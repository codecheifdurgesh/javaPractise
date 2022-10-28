package pattern1;

import java.util.Scanner;

public class halfDiamondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
        if(n==0){
            System.out.println("*");
            System.out.println("*");
        }
        else{
		for(int i=0;i<=n;i++) {
			int c=1;
			int d=i-1;
			for(int j=1;j<=2*i+1;j++) {
				
					if(j==1 || j==2*i+1) {
						System.out.print("*");
					}
					else {
						if(c>i) {
							System.out.print(d);
							d--;
							c++;
						}
						else {
						System.out.print(c);
							c++;
						}
						
					}
			}
			System.out.println();
		}
		for(int i=n-1;i>=0;i--) {
			int c=1;
			int d=i-1;
			for(int j=1;j<=2*i+1;j++) {
				
					if(j==1 || j==2*i+1) {
						System.out.print("*");
					}
					else {
						if(c>i) {
							System.out.print(d);
							d--;
							c++;
						}
						else {
						System.out.print(c);
							c++;
						}
						
					}
			}
			System.out.println();
		}
        }
		sc.close();

	}
}
