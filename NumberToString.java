import java.util.Scanner;

public class NumberToString {
    static void toWords(char[] num) {

        String[] onesPlace = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine" };

        String[] tensPlace = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                "ninety" };

        if (num[1] == '0') {

            System.out.println(tensPlace[num[0] - '0']);
            return;

        } else {
            System.out.println(tensPlace[num[0] - '0'] + " " + onesPlace[num[1] - '0']);
            return;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        String n = input.nextLine();
        int a = Integer.parseInt(n);
        if (a >= 20 && a <= 99) {
            char[] num = n.toCharArray();
            toWords(num);

        } else {
            System.out.println("Invalid Input");
        }
        input.close();
    }

}
