import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr1 = {5, 2, 4, 6, 1, 3};

    System.out.println("Array before sorting: " + Arrays.toString(arr1));

    // Sort the array using insertion sort
    InsertionSort sort = new InsertionSort();
    sort.insertionSort(arr1);
    System.out.println("Array after Insertion Sort: " + Arrays.toString(arr1));


    int[] arr2 = {5, 2, 4, 6, 1, 3};

    System.out.println("Array before sorting: " + Arrays.toString(arr2));
    // Sort the array using merge sort
    MergeSort merge = new MergeSort();
    merge.mergeSort(arr2, 0, arr2.length - 1);
    System.out.println("Array after Merge Sort: " + Arrays.toString(arr2));


    int[] arr3 = {8, 3, 2, 1, 9, 0};

    System.out.println("Array before sorting: " + Arrays.toString(arr3));
    // Sort the array using bubble sort
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.bubbleSort(arr3);
    System.out.println("Array after Bubble Sort: " + Arrays.toString(arr3));


    int[] arr4 = {10, 30, 25, 13, 92, 50};

    System.out.println("Array before sorting: " + Arrays.toString(arr4));
    // Sort the array using quick sort
    QuickSort quickSort = new QuickSort();
      quickSort.quickSort(arr4, 0, arr4.length - 1);
    System.out.println("Array after Quick Sort: " + Arrays.toString(arr4));


    int[] arr5 = {4, 3, 5, 1, 2, 5};

    System.out.println("Array before sorting: " + Arrays.toString(arr5));
    // Sort the array using counting sort
      CountingSort countingSort = new CountingSort();
      int[] outArr = countingSort.countingSort(arr5, 5);
    System.out.println("Array after Counting Sort: " + Arrays.toString(outArr));
  }
}