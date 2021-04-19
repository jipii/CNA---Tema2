import io.grpc.Server;
import io.grpc.ServerBuilder;
import services.SpringImpl;
import services.SummerImpl;
import services.AutumnImpl;
import services.WinterImpl;

public class Main {
    public static void main(String[] args){

        Server server= ServerBuilder.forPort(8000)
                .addService(new SpringImpl())
                .addService(new SummerImpl())
                .addService(new AutumnImpl())
                .addService(new WinterImpl())
                .build();

    }
}
