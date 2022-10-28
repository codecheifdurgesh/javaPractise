package part1;

import java.util.Scanner;

public class factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int c=2;
		while(c<num) {
			if(num%c==0) {
				System.out.println(c+" ");
			}
			c=c+1;
		}
		sc.close();

	}

}
