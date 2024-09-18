package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("To what do you want to search for prime numbers: ");
		int n = scan.nextInt();
		
		boolean[] prime = new boolean[n+1];
		//Value of number is spot in array + 2

		
		for (int i = 2; i < prime.length; i++)
		{
			prime [i] = true;
		}
		
		for (int i = 2; i < n; i++)
		{
			for (int j = 2*i; j < n; j+=i)
			{
				prime [j] = false;
			}
		}
		
		for (int i = 2; i < n; i++) {
			if(prime[i] == true) {
				System.out.println(i + " is a prime number");
			}
		}
		
		
		
	}

}
