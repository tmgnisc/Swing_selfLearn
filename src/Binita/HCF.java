package Binita;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

      
        int gcd = calculateGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        sc.close();
    }


    private static int calculateGCD(int a, int b) {
  
        if (b == 0) {
            return a;
        }
 
        return calculateGCD(b, a % b);
    }
}