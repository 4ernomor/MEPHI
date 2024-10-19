import java.util.Scanner;

public class IMT {
    public static void main(String[] args) {
        int weight = 0;
        int height = 0;
        Scanner man = new Scanner(System.in);
        System.out.println("Введите ваш вес в киллограммах: ");
        weight = man.nextInt();
        System.out.println("Введите ваш рост в метрах: ");
        height = man.nextInt();

        if (weight / (height * height) > 30) {
            System.out.println("У Вас ожирение!");
        }
    }
}