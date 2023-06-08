/* Palindrome Number is number we can read backward and forward same. 
OR
Palindrome Number is a number That is same after reverse.

e.g --> 12321;  353; 7667;
*/
package DailyPractice;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number = 323, revNumber=0, originalNumber=number;
		while(number != 0) {
			revNumber=revNumber*10+number%10;
			number=number/10;
		}
		if(originalNumber==revNumber) {
			System.out.println("Palindrome Number : "+revNumber);
		}
		else {
			System.out.println("Not a Palindrome Number : "+revNumber);
		}
		
	}

}
