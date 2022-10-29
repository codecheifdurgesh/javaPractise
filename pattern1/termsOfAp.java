package pattern1;

import java.util.Scanner;

public class termsOfAp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int count=1;
		int temp=1;
		while(count<=n) {
			if((3*temp+1)%4==0)
			{
				temp=temp+1;
			}
			else {
				System.out.print(3*temp+1);
				count++;
				temp++;
			}
		}
		sc.close();
		

	}

}
