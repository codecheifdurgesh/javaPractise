package pattern1;

import java.util.Scanner;

public class binaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int temp=0;
		int decimal=0;
		while(n>0) {
			int rem=n%10;
			decimal=(int) (decimal+rem*Math.pow(2, temp));
			temp++;
			n=n/10;
		}
		System.out.println(decimal);
	sc.close();
	}

}
