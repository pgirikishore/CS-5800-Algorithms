import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr = {5, 2, 4, 6, 1, 3};
    InsertionSort sort = new InsertionSort();
    sort.insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}