package pattern1;

import java.util.Scanner;

public class checkFibbonaci {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fibbo=0;
		int a=1;
		int b=1;
		boolean flag=false;
		while(fibbo<=n) {
			fibbo=a+b;
			a=b;
			b=fibbo;
			if(n==fibbo) {
				flag=true;
				break;
			}
			
		}
		if(flag==true) {
			System.out.println(flag);
		}
		else {
			System.out.println(flag);
		}
		

	}

}
