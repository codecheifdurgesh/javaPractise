package pattern1;

import java.util.Scanner;

public class findSqrt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int sqrt=(int) Math.sqrt(n);
		System.out.println(sqrt);
		sc.close();
	}

}
