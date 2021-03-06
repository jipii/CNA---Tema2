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

        for(int index = 0; index < intervals.length; index++){
            if(Integer.parseInt(request.getMonth()) == Integer.parseInt(intervals[index][0])
                    && Integer.parseInt(request.getMonth()) == Integer.parseInt(intervals[index][2])){
                if(Integer.parseInt(request.getDay()) >= Integer.parseInt(intervals[index][1])
                        && Integer.parseInt(request.getDay()) <= Integer.parseInt(intervals[index][3])) {
                    SummerOuterClass.ZodiacResponse zodiacResponse = SummerOuterClass.ZodiacResponse
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
                    SummerOuterClass.ZodiacResponse zodiacResponse = SummerOuterClass.ZodiacResponse
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
                    SummerOuterClass.ZodiacResponse zodiacResponse = SummerOuterClass.ZodiacResponse
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
