package com.tt.test;

import java.util.Scanner;

public class JavQ3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter a number: ");
	     int a = sc.nextInt();
	     int limit = (a % 2 == 0) ? a - 1 : a;
	     int num = 1;
	     for (int i = 0; i < limit; i++) {
	        System.out.print(num + " ");
	        num += 2;
	     }
	}
}
