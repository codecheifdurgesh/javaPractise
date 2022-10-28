package pattern1;

import java.util.Scanner;

public class oddSquare {

	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n =sc.nextInt();
			int[] temp = new int[n];
			int k=1;
			
			for(int i=0;i<n;i++) {
				temp[i]=k;
				k=k+2;
			}
			for(int i=0;i<n;i++) {
				int j=i;
				int count=0;
				while(j<=n-1) {
					System.out.print(temp[j]);
					j++;
					count++;
				}
				if(count<n) {
					int c=n-count;
					int d=0;
					while(d<c) {
						System.out.print(temp[d]);
						d=d+1;
					}
					
				}
				System.out.println();
				
			}
			

		}

}
