package backend

import backend.protocol.*
import io.grpc.ServerBuilder
import io.grpc.stub.StreamObserver
import org.slf4j.LoggerFactory


private val log = LoggerFactory.getLogger(Server::class.java)

class Server : GreeterGrpc.GreeterImplBase() {
  override fun greet(request: GreetingRequest, response: StreamObserver<GreetingResponse>) {
    val reply = GreetingResponse.newBuilder()
        .setMessage("Hello, ${request.name}!")
        .build()

    response.onNext(reply)
    response.onCompleted()
  }
}


fun main(args: Array<String>) {
  log.info("Backend starting")

  val server = ServerBuilder
      .forPort(System.getenv("BACKEND_PORT")?.toInt() ?: 8010)
      .addService(Server())
      .build()

  server.start()
  log.info("Listening on *:${server.port}")
  server.awaitTermination()
  log.info("Backend stopped")
}
