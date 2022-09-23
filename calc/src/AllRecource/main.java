package AllRecource;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        while (true){
            System.out.println("Choice");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            int person = scan.nextInt();
            int result;
            if (person ==5){
                break;
            } else if (person == 1){
                System.out.println("Write first num: ");
                int a = scan.nextInt();
                System.out.println("Write second num: ");
                int b = scan.nextInt();
                System.out.println("a :" +a);
                System.out.println("b :" +b);
                result = a + b;
                System.out.println("reply:" +result);
            } else if (person == 2) {
                System.out.println("Write first num: ");
                int a = scan.nextInt();
                System.out.println("Write second num: ");
                int b = scan.nextInt();
                System.out.println("a :" +a);
                System.out.println("b :" +b);
                result = a - b;
                System.out.println("reply:" +result);
            } else if (person == 3) {
                System.out.println("Write first num: ");
                int a = scan.nextInt();
                System.out.println("Write second num: ");
                int b = scan.nextInt();
                System.out.println("a :" +a);
                System.out.println("b :" +b);
                result = a * b;
                System.out.println("reply:" +result);
            } else if (person == 4) {
                System.out.println("Write first num: ");
                int a = scan.nextInt();
                System.out.println("Write second num: ");
                int b = scan.nextInt();
                System.out.println("a :" +a);
                System.out.println("b :" +b);
                result = a / b;
                System.out.println("reply:" +result);
            }
        }
    }
}


