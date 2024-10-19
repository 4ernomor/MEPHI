public class Sometimes {

    public static void main(String[] args) {
        String name1 = "Иван Иванов";
        String name2 = "Вова иванов Hjyh";

        if (checkUserName(name1, name2)) {
            System.out.println("Выберите другое имя");
        } else {
            System.out.println("Отличное имя! Ваше имя имеет длину " + name2.length() + " символов");
            System.out.println("А без пробелов ваше имя занимает " + name2.replace(" ","" ).length() + " символов");
        }
    }

    public static boolean checkUserName(String name1, String name2) {
        return name1.equalsIgnoreCase(name2);
    }
}
