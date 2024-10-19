import java.util.Scanner;

public class Pirsing {
    public static void main(String[] args) {
        System.out.println("Введите Ваш возраст: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age <= 14) {
            System.out.println("Прокол ушей в присутствии родителей");
        }
        else if (age > 14 && age < 18) {
            System.out.println("Покол ушей, пупка, языка, носа в присутствии родителей");
        }
        else {
            System.out.println("Делай что хочешь");
        }

        }
    }