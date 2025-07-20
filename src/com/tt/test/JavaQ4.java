package com.tt.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaQ4 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            countMap.put(i, count);
        }
        System.out.println(countMap);
    }
}
