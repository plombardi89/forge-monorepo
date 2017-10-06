package frontend

import backend.protocol.GreeterGrpc
import backend.protocol.GreetingRequest
import com.spotify.dns.DnsSrvResolvers
import io.grpc.ManagedChannelBuilder
import spark.Spark.*


private val greeter = createGreeterClient()

fun main(args: Array<String>) {
  initializeServer()
}

fun createGreeterClient(): GreeterGrpc.GreeterBlockingStub {
  val runtime = System.getenv("APP_RUNTIME")?.toLowerCase()

  val channelBuilder = when(runtime) {
    "kubernetes" -> {
      val poolmanHost = "backend.${System.getenv("POD_NAMESPACE")}.svc.cluster.local"
      val poolmanPort = DnsSrvResolvers.newBuilder().build().resolve("_grpc._tcp.$poolmanHost")[0].port()
      ManagedChannelBuilder.forAddress(poolmanHost, poolmanPort)
    }
    else -> ManagedChannelBuilder.forAddress("localhost", 8010)
  }

  return GreeterGrpc.newBlockingStub(channelBuilder.usePlaintext(true).build())
}

private fun initializeServer(port: Int = 8000, address: String = "0.0.0.0") {
  port(port)
  ipAddress(address)

  installFilters()
  installRoutes()
}

private fun installFilters() { }


private fun installRoutes() {
  get("/health") { _, _ -> "" }

  get("/greet/:name") { req, res ->
    val response = greeter.greet(GreetingRequest.newBuilder().setName(req.params("name")).build())

    res.type("text/plain")
    res.status(200)

    response.message
  }
}
