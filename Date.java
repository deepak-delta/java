import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the code: ");
        int a = input.nextInt();

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("uuuu-MM-dd");
        LocalDate localDate = LocalDate.now();
        String currentDate = dateFormat.format(localDate);

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        String currentTime = timeFormat.format(localTime);

        String c = currentDate + " " + currentTime;

        String startDate = "1970-01-01";
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(currentDate);
        long days = ChronoUnit.DAYS.between(start, end);

        switch (a) {
        case 0:
            System.out.println(days * 24 * 60 * 60 * 1000);
            break;
        case 1:
            System.out.println(days * 24 * 60 * 60);
            break;
        case 2:
            System.out.println(days);
            break;
        case 3:
            System.out.println(c);
            break;
        default:
            System.out.println("Invalid Input");
            input.close();
        }
    }
}
