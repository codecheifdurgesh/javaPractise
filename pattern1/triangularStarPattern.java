package pattern1;

import java.util.Scanner;

public class triangularStarPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
//				System.out.print("*");
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();

	}

}
