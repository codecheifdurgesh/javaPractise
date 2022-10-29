package pattern1;

import java.util.Scanner;

public class checkAp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=0;
	boolean isAp=true;
	int[] arr=new int[n];
	while(temp<=n-1) {
		arr[temp]=sc.nextInt();
		temp++;
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}
	int d=arr[1]-arr[0];
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i+1]-arr[i]!=d) {
			isAp=false;
		}
	}
	if(isAp==true) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}

	}

}
