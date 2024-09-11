package com.testcore;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MatchListWithMap {
    public static void main(String[] args) {
        // List of strings to match
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "pear");

        // List of maps with string keys and string values
        List<Map<String, String>> mapList = Arrays.asList(
            Map.of("fruit1", "apple", "fruit2", "pear"),
            Map.of("fruit1", "banana", "fruit2", "grape"),
            Map.of("fruit1", "kiwi", "fruit2", "orange")
        );

        // Match strings with map values and collect them into a new map
        Map<String, String> resultMap = mapList.stream()
            .flatMap(map -> map.entrySet().stream())
            .filter(entry -> stringList.contains(entry.getValue()))  // Check if the value is in the list
            .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue,
                (existingValue, newValue) -> newValue));

        // Print the result
        System.out.println(resultMap);
    }
}
