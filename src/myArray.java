public class myArray {
    public static void main(String[] args) {
        int[] myArray = {6, 3, 3, 3, 7, 1, 6};
        int max = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];

                System.out.println("Наибольший элемент: " + max + ", его индекс: " + i);
            }
        }
    }
}


