package services;

import io.grpc.stub.StreamObserver;
import summer.SummerGrpc;
import summer.SummerOuterClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SummerImpl extends SummerGrpc.SummerImplBase {
    @Override
    public void getZodiacSign(SummerOuterClass.ZodiacRequest request, StreamObserver<SummerOuterClass.ZodiacResponse> responseObserver) {
        String[][] intervals = new String[4][3];

        try(Scanner scanner = new Scanner(new FileReader("summer.txt"))){

            for(int index = 0; index < 4; index++){
                intervals[index] = scanner.nextLine().split(" ");
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
