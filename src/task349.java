import java.util.Arrays;

public class task349 {
    public static void main(String[] args) {
        String[] reverseMassive = {"Петя","Маша","Саша","Ира","Коля","Вася","Рома1"};
        int left = 0;
        int right = reverseMassive.length -1;

        while (left < right) {
            String bufString = reverseMassive[left];
            reverseMassive[left] = reverseMassive[right];
            reverseMassive[right] = bufString;
            left += 1;
            right -= 1;
        }
        System.out.println(Arrays.toString(reverseMassive));
    }
}
