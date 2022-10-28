package pattern1;

import java.util.Scanner;

public class mirrorImageNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int j=n;
		for(int i=1;i<=n;i++) {
			
				space=j-i;
				int nbs=1;
				while(space>=1) {
					System.out.print(" ");
				space=space-1;
				}
				while(nbs<=i) {
					System.out.print(nbs);
				nbs=nbs+1;
				}
				System.out.println();
				
				
			
		}
		sc.close();

	}

}
