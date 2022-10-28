package part1;

import java.util.Scanner;

public class powerOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int n=sc.nextInt();
int c=1;
int power=1;
while(c<=n) {
	power=power*x;
	c=c+1;
}
System.out.println(power);
sc.close();
	}

}
