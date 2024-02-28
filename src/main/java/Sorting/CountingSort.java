public class CountingSort {
  public int[] countingSort(int[] arr, int k) {
    int[] count = new int[k + 1];
    int[] output = new int[arr.length];

    for (int i = 0; i < (k + 1); i++) {
      count[i] = 0;
    }

    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    for (int i = 1; i < (k + 1); i++) {
      count[i] = count[i-1] + count[i];
    }

    for(int i = arr.length - 1; i >= 0; i--) {
      output[count[arr[i]] - 1] = arr[i];
      count[arr[i]]--;
    }
    return output;
  }
}