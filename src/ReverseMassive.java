public class ReverseMassive {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 5, 4};
        for (int i = 0; i < list.length - 1; i++) {
            list[i] = list[i + 1];
            System.out.println(i);
        }
    }
}
