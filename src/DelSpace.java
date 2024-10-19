public class DelSpace {

        public static void main(String[] args) {
            System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
        }

        private static String removeWhiteSpaces(String str) {

            str = new String("А роза упала на лапу Азора").replace(" ", "");
            return str;
        }
    }

