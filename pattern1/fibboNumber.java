package pattern1;

import java.util.Scanner;

public class fibboNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int a=1;
		int b=1;
		int fibbo=1;
		for(int i=2;i<=n-1;i++) {
			fibbo=a+b;
			a=b;
			b=fibbo;
		}
		System.out.println(fibbo);
sc.close();
	}

}
