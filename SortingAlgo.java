package array;

import java.util.Scanner;

public class  SortingAlgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Input the array elements
        int[] arr = new int[5];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Sort the array using Bubble Sort
        bubbleSort(arr);
        
        // Print the sorted array
        System.out.println("Sorted Array in Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

/*OUTPUT:-
 Enter the number of elements in the array: 5
Enter the elements of the array:
8 9 4 5 2
Sorted Array in Ascending Order:
2 4 5 8 9 */
