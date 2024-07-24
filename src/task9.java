import java.util.Arrays;

public class task9 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 10;
        int index = Arrays.binarySearch(array, target);

        if (index >= 0) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
