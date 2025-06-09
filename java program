Program 01 : Binary Search
import java.util.Scanner;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;  
            } else if (arr[mid] < key) {
                low = mid + 1;  
            } else {
                high = mid - 1;  
            }
        }

        return -1;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
