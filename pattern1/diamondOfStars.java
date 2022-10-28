package pattern1;

import java.util.Scanner;

public class diamondOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=0;
		int j=(n+1)/2;
            int l=j-1;
		for(int i=0;i<(n+1)/2;i++) {
			space=j-i-1;
			int c=1;
			int k=1;
			while(c<=space) {
				System.out.print(" ");
                c=c+1;
			}
			int nbs=2*i+1;
			while(k<=nbs) {
				System.out.print("*");
                k=k+1;
			}
			
			System.out.println();
		}
         for(int i=j-2;i>=0;i--) {
			space=j-i-1;
			int c=1;
			int k=1;
			while(c<=space) {
				System.out.print(" ");
                c=c+1;
			}
			int nbs=2*i+1;
			while(k<=nbs) {
				System.out.print("*");
                k=k+1;
			}
			
			System.out.println();
		}
		

	}

}
