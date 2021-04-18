package spring;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: spring.proto")
public final class SpringGrpc {

  private SpringGrpc() {}

  public static final String SERVICE_NAME = "Spring";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<spring.SpringOuterClass.ZodiacRequest,
      spring.SpringOuterClass.ZodiacResponse> getGetZodiacSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getZodiacSign",
      requestType = spring.SpringOuterClass.ZodiacRequest.class,
      responseType = spring.SpringOuterClass.ZodiacResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spring.SpringOuterClass.ZodiacRequest,
      spring.SpringOuterClass.ZodiacResponse> getGetZodiacSignMethod() {
    io.grpc.MethodDescriptor<spring.SpringOuterClass.ZodiacRequest, spring.SpringOuterClass.ZodiacResponse> getGetZodiacSignMethod;
    if ((getGetZodiacSignMethod = SpringGrpc.getGetZodiacSignMethod) == null) {
      synchronized (SpringGrpc.class) {
        if ((getGetZodiacSignMethod = SpringGrpc.getGetZodiacSignMethod) == null) {
          SpringGrpc.getGetZodiacSignMethod = getGetZodiacSignMethod = 
              io.grpc.MethodDescriptor.<spring.SpringOuterClass.ZodiacRequest, spring.SpringOuterClass.ZodiacResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Spring", "getZodiacSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spring.SpringOuterClass.ZodiacRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spring.SpringOuterClass.ZodiacResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpringMethodDescriptorSupplier("getZodiacSign"))
                  .build();
          }
        }
     }
     return getGetZodiacSignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpringStub newStub(io.grpc.Channel channel) {
    return new SpringStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpringBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpringBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpringFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpringFutureStub(channel);
  }

  /**
   */
  public static abstract class SpringImplBase implements io.grpc.BindableService {

    /**
     */
    public void getZodiacSign(spring.SpringOuterClass.ZodiacRequest request,
        io.grpc.stub.StreamObserver<spring.SpringOuterClass.ZodiacResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetZodiacSignMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetZodiacSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spring.SpringOuterClass.ZodiacRequest,
                spring.SpringOuterClass.ZodiacResponse>(
                  this, METHODID_GET_ZODIAC_SIGN)))
          .build();
    }
  }

  /**
   */
  public static final class SpringStub extends io.grpc.stub.AbstractStub<SpringStub> {
    private SpringStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpringStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpringStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpringStub(channel, callOptions);
    }

    /**
     */
    public void getZodiacSign(spring.SpringOuterClass.ZodiacRequest request,
        io.grpc.stub.StreamObserver<spring.SpringOuterClass.ZodiacResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetZodiacSignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SpringBlockingStub extends io.grpc.stub.AbstractStub<SpringBlockingStub> {
    private SpringBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpringBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpringBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpringBlockingStub(channel, callOptions);
    }

    /**
     */
    public spring.SpringOuterClass.ZodiacResponse getZodiacSign(spring.SpringOuterClass.ZodiacRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetZodiacSignMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SpringFutureStub extends io.grpc.stub.AbstractStub<SpringFutureStub> {
    private SpringFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpringFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpringFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpringFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<spring.SpringOuterClass.ZodiacResponse> getZodiacSign(
        spring.SpringOuterClass.ZodiacRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetZodiacSignMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ZODIAC_SIGN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpringImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpringImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ZODIAC_SIGN:
          serviceImpl.getZodiacSign((spring.SpringOuterClass.ZodiacRequest) request,
              (io.grpc.stub.StreamObserver<spring.SpringOuterClass.ZodiacResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SpringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpringBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spring.SpringOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Spring");
    }
  }

  private static final class SpringFileDescriptorSupplier
      extends SpringBaseDescriptorSupplier {
    SpringFileDescriptorSupplier() {}
  }

  private static final class SpringMethodDescriptorSupplier
      extends SpringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpringMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SpringGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpringFileDescriptorSupplier())
              .addMethod(getGetZodiacSignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
