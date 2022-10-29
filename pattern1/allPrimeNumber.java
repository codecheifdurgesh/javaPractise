package pattern1;

import java.util.Scanner;

public class allPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==2) {
			System.out.println(n);
		}
		else if(n>=2) {
			System.out.println(2);
			for(int i=3;i<=n;i++) {
				boolean flag=true;
				int j=2;
				while(j<i) {
					if(i%j==0) {
						flag=false;
						break;
					}
					j++;
				}
				if(flag==true) {
					System.out.println(i);
				}
			}
		}

	}

}
