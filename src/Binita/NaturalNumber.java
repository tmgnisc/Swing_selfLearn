package Binita;

import java.util.Scanner;

public class NaturalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the value of N: ");
	        int N = sc.nextInt();

	        
	        int sum = binita(N);

	        System.out.println("The sum of the first " + N + " natural numbers is: " + sum);

	        sc.close();
	    }

	    
	    private static int binita(int n) {
	      
	        if (n == 0) {
	            return 0;
	        }
	        
	        return n + binita(n - 1);
	    }
	}