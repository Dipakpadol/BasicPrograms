package DailyPractice;

public class PrimeOrNotUsingMethod {

	public static void main(String[] args) {
		
		System.out.println("Start execution");
		m1(4,0);
	}
	public static void m1(int a , int count) {
		if(a>1) {
			for(int i=1; i<=a ; i++) {
				if(a%i==0)
					count++;
			}
			if(count==2) {
				System.out.println(a+" Prime Number");
			}
			else {
				System.out.println(a+ " Not a Prime Number");
			}
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}
