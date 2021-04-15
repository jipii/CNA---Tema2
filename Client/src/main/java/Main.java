import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.Client;
import proto.ZodiacGrpc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8000).usePlaintext().build();

        ZodiacGrpc.ZodiacBlockingStub dataStub = ZodiacGrpc.newBlockingStub(channel);

       String date = read();
       if(validation(date) == false)
           System.out.println("Invalid date! ");
        else {
           Client.ZodiacResponse response = dataStub.getZodiacSign(Client.ZodiacRequest.newBuilder().setMonth(date).build());
           System.out.println(response.getZodiacSign());

           channel.shutdown();
       }
    }

    public static String read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the date: ");
        String date = scanner.nextLine();
        return date;
    }

    private static boolean isLeap(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static boolean validation(String date){
       String regex="^(0?[1-9]|1[012])/((?:19|20)[0-9][0-9])/(0?[1-9]|[12][0-9]|3[01])$";
       Pattern pattern = Pattern.compile(regex);
       boolean result= false;
       Matcher matcher = pattern.matcher(date);

       if(matcher.matches()){
           result=true;
           int year = Integer.parseInt(matcher.group(3));

           String month = matcher.group(1);
           String day = matcher.group(2);

           if((month.equals("4") || month.equals("6") || month.equals("9") || month.equals("04") || month.equals("06") || month.equals("09") || month.equals("11")) && day.equals("31"))
           {
               result =false;
           }
           if(month.equals("2") || month.equals("02"))
           {
               if(day.equals("30") || day.equals("31"))
               {
                   result = false;
               }
               if(day.equals("29"))
               {
                   if(!isLeap(year))
                       result=false;
               }
           }
       }
        return result;
    }
}
