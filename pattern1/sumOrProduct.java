package pattern1;

import java.util.Scanner;

public class sumOrProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int c=sc.nextInt();
		if(c!=1 && c!=2) {
			System.out.println("-1");
		}
		else {
			
			if(c==1) {
			int sum=0;
			for(int i=1;i<=n;i++) {
				sum=sum+i;
				
			}
			System.out.println(sum);
			}
			else {
				int prod=1;
				for(int i=1;i<=n;i++) {
					prod=prod*i;
				}
				System.out.println(prod);
				
			}
		}
		sc.close();

	}

}
