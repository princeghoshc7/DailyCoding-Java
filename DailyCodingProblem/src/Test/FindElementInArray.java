package Test;
import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element to find: ");
        int target = sc.nextInt();

        int index = findElement(array, target);

        if (index != -1) {

            System.out.println("Element found at Index: " + index);
        } else {

            System.out.println("Element not found in the array.");
        }

    }

    public static int findElement(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

