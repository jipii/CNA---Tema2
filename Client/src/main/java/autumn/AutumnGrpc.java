package autumn;

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
    comments = "Source: autumn.proto")
public final class AutumnGrpc {

  private AutumnGrpc() {}

  public static final String SERVICE_NAME = "Autumn";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<autumn.AutumnOuterClass.ZodiacRequest,
      autumn.AutumnOuterClass.ZodiacResponse> getGetZodiacSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getZodiacSign",
      requestType = autumn.AutumnOuterClass.ZodiacRequest.class,
      responseType = autumn.AutumnOuterClass.ZodiacResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<autumn.AutumnOuterClass.ZodiacRequest,
      autumn.AutumnOuterClass.ZodiacResponse> getGetZodiacSignMethod() {
    io.grpc.MethodDescriptor<autumn.AutumnOuterClass.ZodiacRequest, autumn.AutumnOuterClass.ZodiacResponse> getGetZodiacSignMethod;
    if ((getGetZodiacSignMethod = AutumnGrpc.getGetZodiacSignMethod) == null) {
      synchronized (AutumnGrpc.class) {
        if ((getGetZodiacSignMethod = AutumnGrpc.getGetZodiacSignMethod) == null) {
          AutumnGrpc.getGetZodiacSignMethod = getGetZodiacSignMethod = 
              io.grpc.MethodDescriptor.<autumn.AutumnOuterClass.ZodiacRequest, autumn.AutumnOuterClass.ZodiacResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Autumn", "getZodiacSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  autumn.AutumnOuterClass.ZodiacRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  autumn.AutumnOuterClass.ZodiacResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AutumnMethodDescriptorSupplier("getZodiacSign"))
                  .build();
          }
        }
     }
     return getGetZodiacSignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AutumnStub newStub(io.grpc.Channel channel) {
    return new AutumnStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AutumnBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AutumnBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AutumnFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AutumnFutureStub(channel);
  }

  /**
   */
  public static abstract class AutumnImplBase implements io.grpc.BindableService {

    /**
     */
    public void getZodiacSign(autumn.AutumnOuterClass.ZodiacRequest request,
        io.grpc.stub.StreamObserver<autumn.AutumnOuterClass.ZodiacResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetZodiacSignMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetZodiacSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                autumn.AutumnOuterClass.ZodiacRequest,
                autumn.AutumnOuterClass.ZodiacResponse>(
                  this, METHODID_GET_ZODIAC_SIGN)))
          .build();
    }
  }

  /**
   */
  public static final class AutumnStub extends io.grpc.stub.AbstractStub<AutumnStub> {
    private AutumnStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AutumnStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutumnStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AutumnStub(channel, callOptions);
    }

    /**
     */
    public void getZodiacSign(autumn.AutumnOuterClass.ZodiacRequest request,
        io.grpc.stub.StreamObserver<autumn.AutumnOuterClass.ZodiacResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetZodiacSignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AutumnBlockingStub extends io.grpc.stub.AbstractStub<AutumnBlockingStub> {
    private AutumnBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AutumnBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutumnBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AutumnBlockingStub(channel, callOptions);
    }

    /**
     */
    public autumn.AutumnOuterClass.ZodiacResponse getZodiacSign(autumn.AutumnOuterClass.ZodiacRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetZodiacSignMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AutumnFutureStub extends io.grpc.stub.AbstractStub<AutumnFutureStub> {
    private AutumnFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AutumnFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutumnFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AutumnFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<autumn.AutumnOuterClass.ZodiacResponse> getZodiacSign(
        autumn.AutumnOuterClass.ZodiacRequest request) {
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
    private final AutumnImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AutumnImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ZODIAC_SIGN:
          serviceImpl.getZodiacSign((autumn.AutumnOuterClass.ZodiacRequest) request,
              (io.grpc.stub.StreamObserver<autumn.AutumnOuterClass.ZodiacResponse>) responseObserver);
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

  private static abstract class AutumnBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AutumnBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return autumn.AutumnOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Autumn");
    }
  }

  private static final class AutumnFileDescriptorSupplier
      extends AutumnBaseDescriptorSupplier {
    AutumnFileDescriptorSupplier() {}
  }

  private static final class AutumnMethodDescriptorSupplier
      extends AutumnBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AutumnMethodDescriptorSupplier(String methodName) {
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
      synchronized (AutumnGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AutumnFileDescriptorSupplier())
              .addMethod(getGetZodiacSignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
