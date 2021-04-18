package services;

import autumn.AutumnGrpc;
import autumn.AutumnOuterClass;
import io.grpc.stub.StreamObserver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AutumnImpl extends AutumnGrpc.AutumnImplBase {
    @Override
    public void getZodiacSign(AutumnOuterClass.ZodiacRequest request, StreamObserver<AutumnOuterClass.ZodiacResponse> responseObserver) {
        String[][] intervals = new String[4][3];

        try(Scanner scanner = new Scanner(new FileReader("autumn.txt"))){

            for(int index = 0; index < 4; index++){
                intervals[index] = scanner.nextLine().split(" ");
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
