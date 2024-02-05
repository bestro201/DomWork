import java.util.Arrays;

public class Domashka_014 {
    public static void swap(int[] array, int index1, int index2) {

        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("индекс выходит за пределы массива.");
            return;
        }
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void swap(String[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("индекс выходит за пределы массива.");
            return;
        }
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6};
        System.out.println("Перед обменом: " + Arrays.toString(intArray));
        swap(intArray, 1, 5);
        System.out.println("После обмена: " + Arrays.toString(intArray));


    }
}

