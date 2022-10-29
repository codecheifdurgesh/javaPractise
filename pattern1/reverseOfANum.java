package pattern1;

import java.util.Scanner;

public class reverseOfANum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n =sc.nextInt();
		int rnum=0;
		int remm=0;
		while(n>=0) {
			remm=n%10;
			rnum=rnum*10+remm;
			n=n/10;
			
		}
		System.out.println(rnum);
		sc.close();
	}

}
