import java.util.Date;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        String[] date1 = date.split("-");
        System.out.println(date1[1]+"/"+date1[2]+"/"+date1[0]);
    }
}