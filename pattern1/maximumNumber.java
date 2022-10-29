package pattern1;

import java.util.Scanner;

public class maximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[4];
		int m=n;
		int i=3;
		while(m>0) {
			int rem=m%10;
			arr[i]=rem;
			m=m/10;
			i--;
		}
		int maxnum=0,tempnum=0;
		for(int j=0;j<arr.length;j++) {
			tempnum=0;
			for(int k=0;k<arr.length;k++) {
				if(j==k) {
				
					continue;
				}
				else {
					tempnum=tempnum*10+arr[k];
				}
			}
			if(tempnum>maxnum) {
				
				maxnum=tempnum;
			}
		}

		System.out.println(maxnum);
		sc.close();
		
	}

}
