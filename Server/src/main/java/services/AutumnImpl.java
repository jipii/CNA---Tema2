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

        for(int index = 0; index < intervals.length; index++){
            if(Integer.parseInt(request.getMonth()) == Integer.parseInt(intervals[index][0])
                    && Integer.parseInt(request.getMonth()) == Integer.parseInt(intervals[index][2])){
                if(Integer.parseInt(request.getDay()) >= Integer.parseInt(intervals[index][1])
                        && Integer.parseInt(request.getDay()) <= Integer.parseInt(intervals[index][3])) {
                    AutumnOuterClass.ZodiacResponse zodiacResponse = AutumnOuterClass.ZodiacResponse
                            .newBuilder()
                            .setZodiacSign(intervals[index][4])
                            .build();
                    responseObserver.onNext(zodiacResponse);
                    responseObserver.onCompleted();
                }
            }
           if(Integer.parseInt(request.getMonth()) == Integer.parseInt(intervals[index][0])
                   && Integer.parseInt(request.getMonth()) != Integer.parseInt(intervals[index][2])){
               if(Integer.parseInt(request.getDay()) >= Integer.parseInt(intervals[index][1])) {
                   AutumnOuterClass.ZodiacResponse zodiacResponse = AutumnOuterClass.ZodiacResponse
                           .newBuilder()
                           .setZodiacSign(intervals[index][4])
                           .build();
                   responseObserver.onNext(zodiacResponse);
                   responseObserver.onCompleted();
               }
           }
            if(Integer.parseInt(request.getMonth()) != Integer.parseInt(intervals[index][0])
                    && Integer.parseInt(request.getMonth()) == Integer.parseInt(intervals[index][2])){
                if(Integer.parseInt(request.getDay()) <= Integer.parseInt(intervals[index][3])) {
                    AutumnOuterClass.ZodiacResponse zodiacResponse = AutumnOuterClass.ZodiacResponse
                            .newBuilder()
                            .setZodiacSign(intervals[index][4])
                            .build();
                    responseObserver.onNext(zodiacResponse);
                    responseObserver.onCompleted();
                }
            }
        }
    }
}
