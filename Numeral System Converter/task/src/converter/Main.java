package converter;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static String  sourceStringRadix=null;
    static String number=null;
    static String targetStringRadix=null;
    static boolean error = false;
    public static void main(String[] args) {
        Scanning();
        int targetRadix = 0;
        int sourceRadix = 0;
        if (error != true) {
            if (Pattern.matches("\\D*",targetStringRadix)) {
                System.out.println("errorTarget!");
                error=true;
            } else targetRadix = Integer.parseInt(targetStringRadix);
            if (Pattern.matches("\\D*",sourceStringRadix)) {
                System.out.println("errorSource!");
                error=true;
            } else sourceRadix = Integer.parseInt(sourceStringRadix);

            if(error==false && sourceRadix<37 && sourceRadix>0 && targetRadix<37 && targetRadix>0){
                if (sourceRadix == 1) OneSourceRadix(number, targetRadix);
                else if (targetRadix == 1) OneTargetRadix(sourceRadix, number);
                else if (number.contains(".")) Fractions(sourceRadix, number, targetRadix);
                else Converting(sourceRadix, number, targetRadix);
            } else System.out.println("error");
        }
    }

    private static void Fractions(int sourceRadix, String number, int targetRadix) {
        String[]  numbers = number.split("\\.");
        int integ=Integer.parseInt(numbers[0],sourceRadix);
        String rezint = Integer.toString(integ,targetRadix);

        double decCount=0;
        String[] fracNumbers = numbers[1].split("");
        for (int i=0; i!=fracNumbers.length;i++){
            Integer fractional = Integer.parseInt(fracNumbers[i],sourceRadix);
            double frac = fractional;
            decCount +=frac/Math.pow(sourceRadix,i+1);
        }
        StringBuilder fractionalRez=new StringBuilder();
        double fracMultip = decCount;
        for (int i=0;i!=5;i++){
            fracMultip = fracMultip*targetRadix;
            String[] mass = Double.toString(fracMultip).split("\\.");
            String translate = Integer.toString(Integer.parseInt(mass[0]),targetRadix);
            fractionalRez.append(translate);
            fracMultip = fracMultip - Double.parseDouble(mass[0]);
        }
        System.out.printf( rezint+"."+fractionalRez);
    }

    public static void Converting(int sourceRadix, String number, int targetRadix){
        int source = Integer.parseInt(number,sourceRadix);
        String rez = Integer.toString(source,targetRadix);
        System.out.println(rez);
   }
   public static void OneSourceRadix(String number, int targetRadix){
        int decimal = number.length();
        System.out.println(Integer.toString(decimal,targetRadix));
   }
   public static void OneTargetRadix(int sourceRadix, String number){
        int decimal = Integer.parseInt(number,sourceRadix);
        String ones = "";
        for (int i=0;i!=decimal;i++){
            ones+=1;
        }
        System.out.println(ones);
   }
   public static void Scanning(){
       Scanner scanner = new Scanner(System.in);
       if (scanner.hasNext()){
           sourceStringRadix = scanner.next();
       }
       else {
           System.out.println("error");
           error=true;
       }
       if (scanner.hasNext()){
           number = scanner.next();
       }
       else{
           System.out.println("error");
           error=true;
       }
       if (scanner.hasNext()) targetStringRadix = scanner.next();
       else{
           System.out.println("error");
           error=true;
       }
   }

}
