package services;

import io.grpc.stub.StreamObserver;
import winter.WinterGrpc;
import winter.WinterOuterClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WinterImpl extends WinterGrpc.WinterImplBase {
    @Override
    public void getZodiacSign(WinterOuterClass.ZodiacRequest request, StreamObserver<WinterOuterClass.ZodiacResponse> responseObserver) {
        String[][] intervals = new String[4][3];

        try(Scanner scanner = new Scanner(new FileReader("winter.txt"))){

            for(int index = 0; index < 4; index++){
                intervals[index] = scanner.nextLine().split(" ");
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
