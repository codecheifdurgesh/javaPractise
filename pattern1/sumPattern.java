package pattern1;

import java.util.Scanner;

public class sumPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=0;
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print(j);
					sum=sum+j;
				}
				else {
					System.out.print("+"+j);
					sum=sum+j;
				}
			}
			System.out.print("="+sum);
			System.out.println();
		}
		

	}

}
