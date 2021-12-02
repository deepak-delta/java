import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name :");
        String name = input.nextLine();
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(name + "  ");
            }
            System.out.println();
        }

        input.close();

    }
}
