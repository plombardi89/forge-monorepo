// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package backend.protocol;

public final class GreetingProto {
  private GreetingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_backend_protocol_GreetingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_backend_protocol_GreetingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_backend_protocol_GreetingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_backend_protocol_GreetingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hello.proto\022\020backend.protocol\"\037\n\017Greet" +
      "ingRequest\022\014\n\004name\030\001 \001(\t\"#\n\020GreetingResp" +
      "onse\022\017\n\007message\030\001 \001(\t2[\n\007Greeter\022P\n\005gree" +
      "t\022!.backend.protocol.GreetingRequest\032\".b" +
      "ackend.protocol.GreetingResponse\"\000B#\n\020ba" +
      "ckend.protocolB\rGreetingProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_backend_protocol_GreetingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_backend_protocol_GreetingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_backend_protocol_GreetingRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_backend_protocol_GreetingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_backend_protocol_GreetingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_backend_protocol_GreetingResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
