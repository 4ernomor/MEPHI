import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        //Создаем переменную типа int
        int randInt;
        //Сохраняем случайное число в переменной randInt;
        randInt = rand.nextInt(10) + 1;
        System.out.println("Введите и попробуйте угадать число: ");
        Scanner number = new Scanner(System.in);
        int OneNumber = number.nextInt();
        if (OneNumber == randInt) {
            System.out.println("Поздравляю, Вы угадали, загаданное число: " + randInt);
        }
        else {
                System.out.println("Вы не угадали, было загадано число: " + randInt);
            }
        }
}

