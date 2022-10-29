package pattern1;

import java.util.Scanner;

public class numberStar {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int j=n;
for(int i=0;i<n;i++) {
	int nbs=j-i;
	int c=1;
	while(c<=nbs) {
		System.out.print(c);
		c++;
	}
	if(n-nbs>0) {
		for(int k=1;k<=i;k++) {
			System.out.print("**");
		}
	}
	c=c-1;
	while(c>=1) {
		System.out.print(c);
		c--;
	}
}





	}

}
