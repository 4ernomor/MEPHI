import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Enter the number from the console and add Scanner
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        //We introduce an arithmetic action
        System.out.println("Введите математическое действие: '+' '-' '*' '/' ");
        String action = scanner.next();
        //Enter the second number from the console
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();
        // Преобразуем action в символ
        char operation = action.charAt(0);
        double result = calculateOperation(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    private static double calculateOperation(double num1, double num2, char operation) {
        double result = 0;
        //We define the arithmetic sign
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-': {
                result = num1 - num2;
                break;
            }
            case '*': {
                result = num1 * num2;
                break;
            }
            case '/': {
                result = num1 / num2;
                if (num2 == 0) {
                    System.out.println("Вы не можете разделить на ноль");
                } else {
                    System.out.println(result);
                }
                break;
            }
        }
        return result;
    }
}






