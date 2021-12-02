import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 5:");
        int a = input.nextInt();
        if (a >= 1 && a <= 5) {
            int b = a * a;
            System.out.println(b);
        } else {
            System.out.println("Invalid input");
        }
        input.close();

    }
}