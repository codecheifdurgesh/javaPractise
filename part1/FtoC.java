package part1;

import java.util.Scanner;

public class FtoC {

	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int s,w,e;
		s=sc.nextInt();
		w=sc.nextInt();
		e=sc.nextInt();
		while(s<e) {
			double c=((s - 32) * 5)/9 ;
			System.out.println(s+"\t"+c);
			s=s+w;

		}
		sc.close();

	}

}
