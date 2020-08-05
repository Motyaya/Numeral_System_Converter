import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        while (!string.equals("0")){
            try {
                Integer integer = Integer.parseInt(string);
                System.out.println(integer*10);
            } catch (Exception e){
                System.out.println("Invalid user input: " + string);
            }
            string = scanner.nextLine();
        }
    }
}