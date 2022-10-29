package pattern1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int rev_num=0;
		while(n>0) {
			int rem=n%10;
			rev_num=rev_num*10+rem;
			n=n/10;
			
		}
		if(num==rev_num) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
