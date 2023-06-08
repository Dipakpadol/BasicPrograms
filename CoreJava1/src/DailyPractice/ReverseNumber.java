package DailyPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		/*int number=7865;
		int revnumber=0;*/
		
		int number=1234, revnumber=0;
		System.out.println("The Original Number IS : "+number);
		while(number!=0) {
			
			revnumber=revnumber*10+number%10;
			number=number/10;
					
		}
		System.out.println("The Reverse Number Is : "+revnumber);

	}

}
