import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите цвет: ");
    Scanner input = new Scanner(System.in);
    String color = input.nextLine();
    switch (color) {
        case "Красный":
            System.out.println("Остановитесь!");
            break;
        case "Желтый":
            System.out.println("Внимание!");
            break;
        case "Зелёный":
            System.out.println("Езжай!");
            break;
        default:
            System.out.println("Ты кого хочешь ноебать");
    }

    }
}
