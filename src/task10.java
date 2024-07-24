public class task10 {
    public static void main(String[] args) {
        int[] array = {50, 20, 40, 10, 30};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array using bubble sort: " + java.util.Arrays.toString(array));
    }
}
