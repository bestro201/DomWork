public class Domashka_14_3 {
    public static void main(String[] args) {
        String input1 = "Hello";
        if (input1.length() >= 3) {
            char char2 = Character.toUpperCase(input1.charAt(1));
            char char3 = Character.toUpperCase(input1.charAt(2));
            String result1 = String.valueOf(char2) + String.valueOf(char3);
            System.out.println(result1);
        }

        String input2 = "He";
        if (input2.length() >= 3) {
            char char2 = Character.toUpperCase(input2.charAt(1));
            char char3 = Character.toUpperCase(input2.charAt(2));
            String result2 = String.valueOf(char2) + String.valueOf(char3);
            System.out.println(result2);
        } else if (input2.length() == 2) {
            char char2 = Character.toUpperCase(input2.charAt(1));
            String result2 = String.valueOf(char2);
            System.out.println(result2);
        }

        String input3 = "H";
        if (input3.length() >= 3) {
            char char2 = Character.toUpperCase(input3.charAt(1));
            char char3 = Character.toUpperCase(input3.charAt(2));
            String result3 = String.valueOf(char2) + String.valueOf(char3);
            System.out.println(result3);
        } else if (input3.length() == 2) {
            char char2 = Character.toUpperCase(input3.charAt(1));
            String result3 = String.valueOf(char2);
            System.out.println(result3);
        } else {
            System.out.println(" ");
        }
    }
}
