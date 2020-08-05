import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringJob = scanner.next();
        if (stringJob.equals("")) System.out.println("");
        else {
            stringJob = stringJob + " ";
            String[] string = stringJob.split("");
            String rez = string[0];
            int count = 1;
            for (int i = 1; i != string.length; i++) {
                if (string[i - 1].equals(string[i])) {
                    count++;
                }
                if (!string[i - 1].equals(string[i])) {
                    System.out.print(rez+count);
                    count = 1;
                    rez=string[i];
                }
            }
        }
    }
}