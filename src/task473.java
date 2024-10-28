import java.util.Scanner;

public class task473 {
    public static void main(String[] args) {
        System.out.println("Enter the nums");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        String formatted = number.replaceAll("(\\d)(?=(\\d{3})+$)", "$1,");
        System.out.println(formatted);

    }
}
