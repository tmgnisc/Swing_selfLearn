package Binita;

import java.util.Scanner;

public class Fibonacci {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the value of N (position in Fibonacci series): ");
	        int N = sc.nextInt();

	        int result = Series(N);

	        System.out.println("The " + N + "th term in the Fibonacci series is: " + result);

	        sc.close();
	    }

	    private static int Series(int n) {
	        if (n == 0 || n == 1) {
	            return n;
	        }
	        return Series(n - 1) + Series(n - 2);
	    }
	}