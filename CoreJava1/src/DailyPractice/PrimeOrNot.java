package DailyPractice;
import java.util.Scanner;
public class PrimeOrNot {
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		
		int n=s.nextInt();
		int count=0;
		
		if(n>1) {
			for(int i=1; i<=n; i++) {
				if(n%i==0) 
					count++;
			}
			if(count==2) {
				System.out.println("the number "+n+" a prime number");
			}
			else {
				System.out.println("The number "+n+" is not prime number");
			}
			
		}
		else {
			System.out.println("The Number " +n+ " is Not a prime Number ");
		}
	
	}
}


