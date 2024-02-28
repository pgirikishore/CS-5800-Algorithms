public class QuickSort {
  public void quickSort(int[] arr, int l, int r) {
    if (l < r) {
      int q = partition(arr, l, r);
      quickSort(arr, l, q - 1);
      quickSort(arr, q + 1, r);
    }
  }

  public int partition(int[] arr, int l, int r) {
    int key = arr[r];
    int i = l - 1;
    for (int j = l; j < r; j++) {
      if (arr[j] <= key) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[r];
    arr[r] = temp;
    return i + 1;
  }
}