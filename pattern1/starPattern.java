package pattern1;

import java.util.Scanner;

public class starPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=0;
		int j=n;
		for(int i=0;i<n;i++) {
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
