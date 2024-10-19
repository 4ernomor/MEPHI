import java.util.Scanner;

public class NamePassword {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner nameUser = new Scanner(System.in);
        String name = nameUser.nextLine();
        System.out.println("Введите пароль: ");
        Scanner passwordUser = new Scanner(System.in);
        String password;
        password = passwordUser.nextLine();
        if (password.length() < 8 || password.length() > 15) {
            do {
                System.out.println("Длина пароля должна составлять от 8 до 15 символов");
                password = passwordUser.nextLine();
            } while (password.length() < 8 || password.length() > 15);
        }
        System.out.printf("%s, Ваш новый пароль: %s", name, password);
    }
}



