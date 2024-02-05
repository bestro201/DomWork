public class Domashka_14_2 {

        public static int searchString(String[] array, String target) {
            for (int i = 0; i < array.length; i++) {

                if (array[i] == target || (array[i] != null && array[i].equals(target))) {
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            String[] stringArray = {"СТРОКА1", "СТРОКА2", "СТРОКА3", "СТРОКА4"};
            String targetString = "СТРОКА2";

            int result = searchString(stringArray, targetString);

            if (result != -1) {
                System.out.println("НАЙДЕНА '" + targetString + "' В МАССИВЕ ПОД НОМЕРОМ: " + result);
            } else {
                System.out.println("НАЙДЕНА '" + targetString + "' НЕТ В МАССИВЕ.");
            }
        }

    }
