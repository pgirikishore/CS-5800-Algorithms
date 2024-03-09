
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void bucketSort(int[] arr) {
        // Create n empty buckets
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            buckets.add(new ArrayList<>());
        }

        // Distribute elements into buckets
        for (int num : arr) {
            buckets.get(num).add(num);
        }

        // Sort each bucket
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Concatenate buckets into one sorted list
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }
}