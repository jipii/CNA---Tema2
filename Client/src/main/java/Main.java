import autumn.AutumnGrpc;
import autumn.AutumnOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import spring.SpringGrpc;
import spring.SpringOuterClass;
import summer.SummerGrpc;
import summer.SummerOuterClass;
import winter.WinterGrpc;
import winter.WinterOuterClass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){


       String date = read();
       if(validation(date) == false)
           System.out.println("Invalid date! ");
        else {
           System.out.println("Valid date! ");

           ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8000).usePlaintext().build();
           int month = Integer.parseInt(date.split("/")[0]);
           int day = Integer.parseInt(date.split("/")[1]);
           int year = Integer.parseInt(date.split("/")[2]);
            switch(month){
                case 3:
                case 4:
                case 5:
                    SpringGrpc.SpringBlockingStub springBlockingStub = SpringGrpc.newBlockingStub(channel);
                    SpringOuterClass.ZodiacResponse zodiacSpring = springBlockingStub.getZodiacSign(SpringOuterClass.ZodiacRequest.newBuilder()
                            .setMonth(Integer.toString(month))
                            .setDay(Integer.toString(day))
                            .setYear(Integer.toString(year)).build());
                    System.out.println(zodiacSpring.getZodiacSign());
                    break;
                case 6:
                case 7:
                case 8:
                    SummerGrpc.SummerBlockingStub summerBlockingStub = SummerGrpc.newBlockingStub(channel);
                    SummerOuterClass.ZodiacResponse zodiacSummer = summerBlockingStub.getZodiacSign(SummerOuterClass.ZodiacRequest.newBuilder()
                            .setMonth(Integer.toString(month))
                            .setDay(Integer.toString(day))
                            .setYear(Integer.toString(year)).build());
                    System.out.println(zodiacSummer.getZodiacSign());
                    break;
                case 9:
                case 10:
                case 11:
                    AutumnGrpc.AutumnBlockingStub autumnBlockingStub = AutumnGrpc.newBlockingStub(channel);
                    AutumnOuterClass.ZodiacResponse zodiacAutumn = autumnBlockingStub.getZodiacSign(AutumnOuterClass.ZodiacRequest.newBuilder()
                            .setMonth(Integer.toString(month))
                            .setDay(Integer.toString(day))
                            .setYear(Integer.toString(year)).build());
                    System.out.println(zodiacAutumn.getZodiacSign());
                    break;
                case 12:
                case 1:
                case 2:
                    WinterGrpc.WinterBlockingStub winterBlockingStub = WinterGrpc.newBlockingStub(channel);
                    WinterOuterClass.ZodiacResponse zodiacWinter = winterBlockingStub.getZodiacSign(WinterOuterClass.ZodiacRequest.newBuilder()
                            .setMonth(Integer.toString(month))
                            .setDay(Integer.toString(day))
                            .setYear(Integer.toString(year)).build());
                    System.out.println(zodiacWinter.getZodiacSign());
                    break;

            }
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
