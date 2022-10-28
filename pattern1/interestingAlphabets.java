package pattern1;

import java.util.Scanner;

public class interestingAlphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=65+n;
		int d=65+n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)d);
				d=d+1;
			}
			
			c=c-1;
			d=c;
			System.out.println();
		}

		sc.close();
	}
}
