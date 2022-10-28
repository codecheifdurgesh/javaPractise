package pattern1;

import java.util.Scanner;

public class invertedNumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int j=n;
		for(int i=n;i>=1;i--) {
			
				
				int nbs=1;
            while(nbs<=i) {
				System.out.print(i);
				nbs=nbs+1;
				}
				
				
				System.out.println();
				
				
			
		}
		sc.close();

	}
}
