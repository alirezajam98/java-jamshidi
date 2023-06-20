
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        if (a == 0) {
            evenAndOdd();
        } else if (a == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("please enter a score : ");
            score(scanner.nextInt());
        } else if (a == 2) {
            table();
        }else if (a==3){
            maxNumber();
        }


    }

    private static void maxNumber() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0 ; i<20;i++){
            int r = random.nextInt(100);
            numbers.add(r);
        }
        System.out.println(numbers);

    }

    public static void table() {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.print(x * y + "\t");
            }
            System.out.println();
        }
    }

    public static void score(int score) {
        if (score < 0 || score > 20) {
            System.out.println("adade vared shode sahih nemibashad. lodfan dart baze 0 ta 20 vared konid");
        } else if (score < 10) {
            System.out.println("mashroot");
        } else if (score < 15) {
            System.out.println("bad");
        } else if (score < 18) {
            System.out.println("khob");
        } else {
            System.out.println("Aali");
        }
    }

    public static void evenAndOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number for check Even or Odd : ");
        int number = scanner.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }


}
