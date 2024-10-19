public class floatArray {
    public static void main(String[] args) {
        double[] nums = {1.3, 3.2, 5.1, 4.7};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        double total = 0;
        for (int j = 0; j < nums.length; j++) {
            total += nums[j];
        }
        System.out.println("Сумма чисел массива: " + total);
        double max = nums[0];
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] > max)
                max = nums[a];
            }
        System.out.println("Наибольший элемент: " + max);
        }
    }



