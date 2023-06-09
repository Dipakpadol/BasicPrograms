package DailyPractice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReverseArray {

	public static void main(String[] args) {
    
		int[] a= {10,20,30,40,50};
		System.out.println("Original Array : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse Array : ");
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(+a[i]+" ");
		}
	}
}
