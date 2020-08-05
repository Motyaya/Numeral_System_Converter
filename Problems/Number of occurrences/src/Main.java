import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String qwe = scanner.nextLine();
        String[] string = qwe.split("");
        String substring = scanner.next();
        String rez="";
        int count=0;
        for (int i=0;i<string.length;i++){
            rez +=string[i];
            if (rez.contains(substring)){
                count++;
                rez="";
            }
        }
        System.out.println(count);
    }
}