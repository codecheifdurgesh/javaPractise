package part1;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=1;
		while(c<=10) {
			System.out.println(n*c);
			c=c+1;
		}
		sc.close();
	}
}
