package summer;

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
    comments = "Source: summer.proto")
public final class SummerGrpc {

  private SummerGrpc() {}

  public static final String SERVICE_NAME = "Summer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<summer.SummerOuterClass.ZodiacRequest,
      summer.SummerOuterClass.ZodiacResponse> getGetZodiacSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getZodiacSign",
      requestType = summer.SummerOuterClass.ZodiacRequest.class,
      responseType = summer.SummerOuterClass.ZodiacResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<summer.SummerOuterClass.ZodiacRequest,
      summer.SummerOuterClass.ZodiacResponse> getGetZodiacSignMethod() {
    io.grpc.MethodDescriptor<summer.SummerOuterClass.ZodiacRequest, summer.SummerOuterClass.ZodiacResponse> getGetZodiacSignMethod;
    if ((getGetZodiacSignMethod = SummerGrpc.getGetZodiacSignMethod) == null) {
      synchronized (SummerGrpc.class) {
        if ((getGetZodiacSignMethod = SummerGrpc.getGetZodiacSignMethod) == null) {
          SummerGrpc.getGetZodiacSignMethod = getGetZodiacSignMethod = 
              io.grpc.MethodDescriptor.<summer.SummerOuterClass.ZodiacRequest, summer.SummerOuterClass.ZodiacResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Summer", "getZodiacSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  summer.SummerOuterClass.ZodiacRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  summer.SummerOuterClass.ZodiacResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SummerMethodDescriptorSupplier("getZodiacSign"))
                  .build();
          }
        }
     }
     return getGetZodiacSignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SummerStub newStub(io.grpc.Channel channel) {
    return new SummerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SummerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SummerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SummerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SummerFutureStub(channel);
  }

  /**
   */
  public static abstract class SummerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getZodiacSign(summer.SummerOuterClass.ZodiacRequest request,
        io.grpc.stub.StreamObserver<summer.SummerOuterClass.ZodiacResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetZodiacSignMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetZodiacSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                summer.SummerOuterClass.ZodiacRequest,
                summer.SummerOuterClass.ZodiacResponse>(
                  this, METHODID_GET_ZODIAC_SIGN)))
          .build();
    }
  }

  /**
   */
  public static final class SummerStub extends io.grpc.stub.AbstractStub<SummerStub> {
    private SummerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummerStub(channel, callOptions);
    }

    /**
     */
    public void getZodiacSign(summer.SummerOuterClass.ZodiacRequest request,
        io.grpc.stub.StreamObserver<summer.SummerOuterClass.ZodiacResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetZodiacSignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SummerBlockingStub extends io.grpc.stub.AbstractStub<SummerBlockingStub> {
    private SummerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummerBlockingStub(channel, callOptions);
    }

    /**
     */
    public summer.SummerOuterClass.ZodiacResponse getZodiacSign(summer.SummerOuterClass.ZodiacRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetZodiacSignMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SummerFutureStub extends io.grpc.stub.AbstractStub<SummerFutureStub> {
    private SummerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<summer.SummerOuterClass.ZodiacResponse> getZodiacSign(
        summer.SummerOuterClass.ZodiacRequest request) {
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
    private final SummerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SummerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ZODIAC_SIGN:
          serviceImpl.getZodiacSign((summer.SummerOuterClass.ZodiacRequest) request,
              (io.grpc.stub.StreamObserver<summer.SummerOuterClass.ZodiacResponse>) responseObserver);
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

  private static abstract class SummerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SummerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return summer.SummerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Summer");
    }
  }

  private static final class SummerFileDescriptorSupplier
      extends SummerBaseDescriptorSupplier {
    SummerFileDescriptorSupplier() {}
  }

  private static final class SummerMethodDescriptorSupplier
      extends SummerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SummerMethodDescriptorSupplier(String methodName) {
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
      synchronized (SummerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SummerFileDescriptorSupplier())
              .addMethod(getGetZodiacSignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
