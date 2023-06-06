package DailyPractice;

public class NumberPattern2 {
	public static void main(String[] args) {
		
		for(int row=5; row>=1; row--) {
			
			for(int column=5; column>=row; column--) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}

}
