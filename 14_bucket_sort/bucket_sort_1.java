//in this we put all the elements in certain numberf of buckets 
//and sort the each bucket individually 
//after sorting 
//take  all elements and join them 

import java.util.ArrayList;
import java.util.Collections;

public class bucket_sort_1 {

    static void bucket_sort(float[] arr) {

        int n = arr.length;
        // buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        // creating empty buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        // adding elements into buckets

        for (int i = 0; i < n; i++) {
            int bucketindex = (int) arr[i] * n;
            buckets[bucketindex].add(arr[i]);

        }

        // sorting each bucket indiviadually
        // we are using inb<uild sort
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        // merging buckts
        int idx = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currbucket = buckets[i];
            for (int j = 0; j < currbucket.size(); j++) {
                arr[idx++]
                









                
        }

    }

    // arrays printing
    static void printarr(float[] arr) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        float[] arr = { 0.5f, 0.4f, 0.3f, 0.2f, 0.1f };
        System.out.println("original arrays ");
        printarr(arr);
        bucket_sort(arr);
        System.out.println("sorted array ");
        printarr(arr);
    }

}