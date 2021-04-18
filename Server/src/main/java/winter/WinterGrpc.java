package winter;

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
    comments = "Source: winter.proto")
public final class WinterGrpc {

  private WinterGrpc() {}

  public static final String SERVICE_NAME = "Winter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<winter.WinterOuterClass.ZodiacRequest,
      winter.WinterOuterClass.ZodiacResponse> getGetZodiacSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getZodiacSign",
      requestType = winter.WinterOuterClass.ZodiacRequest.class,
      responseType = winter.WinterOuterClass.ZodiacResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<winter.WinterOuterClass.ZodiacRequest,
      winter.WinterOuterClass.ZodiacResponse> getGetZodiacSignMethod() {
    io.grpc.MethodDescriptor<winter.WinterOuterClass.ZodiacRequest, winter.WinterOuterClass.ZodiacResponse> getGetZodiacSignMethod;
    if ((getGetZodiacSignMethod = WinterGrpc.getGetZodiacSignMethod) == null) {
      synchronized (WinterGrpc.class) {
        if ((getGetZodiacSignMethod = WinterGrpc.getGetZodiacSignMethod) == null) {
          WinterGrpc.getGetZodiacSignMethod = getGetZodiacSignMethod = 
              io.grpc.MethodDescriptor.<winter.WinterOuterClass.ZodiacRequest, winter.WinterOuterClass.ZodiacResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Winter", "getZodiacSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  winter.WinterOuterClass.ZodiacRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  winter.WinterOuterClass.ZodiacResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WinterMethodDescriptorSupplier("getZodiacSign"))
                  .build();
          }
        }
     }
     return getGetZodiacSignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WinterStub newStub(io.grpc.Channel channel) {
    return new WinterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WinterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WinterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WinterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WinterFutureStub(channel);
  }

  /**
   */
  public static abstract class WinterImplBase implements io.grpc.BindableService {

    /**
     */
    public void getZodiacSign(winter.WinterOuterClass.ZodiacRequest request,
        io.grpc.stub.StreamObserver<winter.WinterOuterClass.ZodiacResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetZodiacSignMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetZodiacSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                winter.WinterOuterClass.ZodiacRequest,
                winter.WinterOuterClass.ZodiacResponse>(
                  this, METHODID_GET_ZODIAC_SIGN)))
          .build();
    }
  }

  /**
   */
  public static final class WinterStub extends io.grpc.stub.AbstractStub<WinterStub> {
    private WinterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WinterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WinterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WinterStub(channel, callOptions);
    }

    /**
     */
    public void getZodiacSign(winter.WinterOuterClass.ZodiacRequest request,
        io.grpc.stub.StreamObserver<winter.WinterOuterClass.ZodiacResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetZodiacSignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WinterBlockingStub extends io.grpc.stub.AbstractStub<WinterBlockingStub> {
    private WinterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WinterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WinterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WinterBlockingStub(channel, callOptions);
    }

    /**
     */
    public winter.WinterOuterClass.ZodiacResponse getZodiacSign(winter.WinterOuterClass.ZodiacRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetZodiacSignMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WinterFutureStub extends io.grpc.stub.AbstractStub<WinterFutureStub> {
    private WinterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WinterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WinterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WinterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<winter.WinterOuterClass.ZodiacResponse> getZodiacSign(
        winter.WinterOuterClass.ZodiacRequest request) {
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
    private final WinterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WinterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ZODIAC_SIGN:
          serviceImpl.getZodiacSign((winter.WinterOuterClass.ZodiacRequest) request,
              (io.grpc.stub.StreamObserver<winter.WinterOuterClass.ZodiacResponse>) responseObserver);
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

  private static abstract class WinterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WinterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return winter.WinterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Winter");
    }
  }

  private static final class WinterFileDescriptorSupplier
      extends WinterBaseDescriptorSupplier {
    WinterFileDescriptorSupplier() {}
  }

  private static final class WinterMethodDescriptorSupplier
      extends WinterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WinterMethodDescriptorSupplier(String methodName) {
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
      synchronized (WinterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WinterFileDescriptorSupplier())
              .addMethod(getGetZodiacSignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
