import java.util.Scanner;
import static java.lang.System.*;

public class rotateString {
    public static void main(String[] args) {
        out.print("Введите слово для его переворота: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if (word == null || word.isEmpty()) {
            out.println("Строка пуста или null");
        } else if (word.trim().split("\\s+").length == 1) {
            StringBuilder sb = new StringBuilder(word);
            String reverseWord = sb.reverse().toString();
            out.println("Перевернутое слово: " + reverseWord);
        } else {
            out.println("Строка содержит более одного слова");




    }
}
}