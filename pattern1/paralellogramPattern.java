package pattern1;

import java.util.Scanner;

public class paralellogramPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int k=1;
			while(k<=i) {
				System.out.print(" ");
				k=k+1;
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
