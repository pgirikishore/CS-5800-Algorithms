import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr1 = {5, 2, 4, 6, 1, 3};

    System.out.println("Array before sorting: " + Arrays.toString(arr1));

    // Sort the array using insertion sort
    InsertionSort sort = new InsertionSort();
    sort.insertionSort(arr1);
    System.out.println("Array after sorting: " + Arrays.toString(arr1));


    int[] arr2 = {5, 2, 4, 6, 1, 3};

    System.out.println("Array before sorting: " + Arrays.toString(arr2));
    // Sort the array using merge sort
    MergeSort merge = new MergeSort();
    merge.mergeSort(arr2, 0, arr2.length - 1);
    System.out.println("Array after sorting: " + Arrays.toString(arr2));
  }
}