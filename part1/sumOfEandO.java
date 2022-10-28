package part1;

import java.util.Scanner;

public class sumOfEandO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int evensum=0;
		int oddsum=0;
		while(n>0) {
			int rem=n%10;
			if(rem%2==0) {
				evensum=evensum+rem;
			}
			else {
				oddsum=oddsum+rem;
			}
			n=n/10;
		}
		
System.out.println(evensum+" "+oddsum);
sc.close();
	}

}
