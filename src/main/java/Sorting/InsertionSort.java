// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class InsertionSort {
  public void insertionSort(int[] arr) {
    for(int i = 1; i<arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      while(j >= 0 && arr[j] > key) {
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = key;
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}