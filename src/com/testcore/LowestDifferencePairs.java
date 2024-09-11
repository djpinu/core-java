package com.testcore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestDifferencePairs {
    public static void main(String[] args) {
        int[] array = {4, 2, 1, 7, 9, 6};
        
        // Sort the array
        Arrays.sort(array);
        
        // Initialize the minimum difference to a large value
        int minDiff = Integer.MAX_VALUE;
        
        // List to store the pairs with the minimum difference
        List<int[]> pairs = new ArrayList<>();
        
        // Find the minimum difference and corresponding pairs
        for (int i = 0; i < array.length - 1; i++) {
            int diff = array[i + 1] - array[i];
            
            if (diff < minDiff) {
                minDiff = diff;
                pairs.clear(); // Clear the list as we found a new minimum difference
                pairs.add(new int[]{array[i], array[i + 1]});
            } else if (diff == minDiff) {
                pairs.add(new int[]{array[i], array[i + 1]});
            }
        }
        
        // Output the minimum difference and the pairs
        System.out.println("Minimum Difference: " + minDiff);
        System.out.println("Pairs with Minimum Difference:");
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }
}

