public class task473 {
    public static void main(String[] args) {
        String number = "12345678546";

        String formatted = number.replaceAll("(\\d)(?=(\\d{3})+$)", "$1,");
        System.out.println(formatted);

    }
}
