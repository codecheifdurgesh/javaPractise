package array2;
import java.util.Arrays;

import java.util.Scanner;

public class arrayP {

//	binary search
    public static int binarySearch(int[] arr, int x) {
   
    	int mid=0;
    	int start=0;
    	int end=arr.length-1;
    	while(start<=end) {
    		mid=(start+end)/2;
    		if(arr[mid]==x) {
    			return mid;
    		}
    		else if(arr[mid]<x) {
    			start=mid+1;
    			
    		}
    		else {
    			end=mid-1;
    		}
    	}
    	return -1;
        
    }
    
//    selection sort
     public static int[] selectionSort(int[] arr) {
   
    	int min;
    	int minIndex=0;
    	int i=0;
    	while(i<arr.length-1) {
            int j=i;
            min=arr[i];
    		while(j<arr.length) {
    			if(arr[j]<=min) {
    				min=arr[j];
    				minIndex=j;
                    j++;
    			}
                else{
                j++;
                }
    		}
          
    		int temp=min;
    		arr[minIndex]=arr[i];
    		arr[i]=temp;
    			i++;	
            
    	}
    	return arr;
	
    }  
     
     public static void bubbleSort(int[] arr){

    	 int i=0;int j=0;int k=arr.length;
    	 while(i<k-1) {
             j=0;
    		 while(j<k-1) {
    			 if(arr[j]>arr[j+1]) {
    				 int temp=arr[j];
    				 arr[j]=arr[j+1];
    				 arr[j+1]=temp;
    				j++; 
    			 }
    			 else {
    				 j++;
    			 }
    		 }
    		 k--;
    		 
    	 }
     }
     public static int[] merge(int arr1[], int arr2[]) {
     	//Your code goes here
     if(arr1.length==0 || arr2.length==0){
         if(arr1.length==0){
             int m=arr2.length;
             int[] arr3=new int[m];
             for(int i=0;i<arr2.length;i++){
                 arr3[i]=arr2[i];
             }
             return arr3;
         }
         else{
             int m=arr1.length;
             int[] arr3=new int[m];
             for(int i=0;i<arr1.length;i++){
                 arr3[i]=arr1[i];
             }
             return arr3;
             
         }
     }
         else{
         int m=arr1.length+arr2.length;
 	int[] arr3=new int[m];
 	int i=0;
 	int j=0;
     int k=0;
     
 	
 		while(i<arr1.length && j<arr2.length) {
 			if(arr1[i]<arr2[j]) {
 				arr3[k]=arr1[i];
 				i++;
 				k++;
 			}
 			else {
 				arr3[k]=arr2[j];
 				j++;
 				k++;
 			}
 		}
 	
             while(i<arr1.length){
                 arr3[k]=arr1[i];
                 i++;
                 k++;
             }
             while(j<arr2.length){
                 arr3[k]=arr2[j];
                 j++;
                 k++;
             }
 	return arr3;
 	
     }
     }
     public static void pushZerosAtEnd(int[] arr) {
    	 for(int i=0;i<arr.length;i++) {
    		 if(arr[i]==0) {
    			 int j=i+1;
    			 while(j<arr.length) {
    				 if(arr[j]==0) {
    					 j++;
    					 
    				 }
    				 else {
    				 int temp=arr[j];
    				 arr[j]=arr[i];
    				 arr[i]=temp;
    				 break;
    				 }
    				 
    			 }
    		 }
    	 }

     }
//     1 2 3 4 5 6 7
//     2
//     3 4 5 6 7 1 2
     public static void rotate(int[] arr, int d) {
         
    	 
       	 if(d>arr.length) {
    		 return;
    	 }
    	 else if(d==0) {
    		 return ;
    	 }
    	 else {
    		 int[] arr2=new int[arr.length];
         for(int i=0;i<arr.length;i++){
             arr2[i]=arr[i];
         }
            
             
//         1 3 6 11 12 17
//         4
//         12 17 1 3 6 11 
             
    		 int j=0;
    		for(int i=d;i<arr2.length;i++) {
    			arr[j]=arr2[i];
    			j++;
    			
    		}
             for(int i=0;i<arr2.length;i++) {
    			System.out.print(arr2[i]+" ");
    			
    		}
    		int c=0;
    		for(int k=j;k<arr2.length;k++) {
    			arr[k]=arr2[c];
    			c++;
    		}
          
    		 
    	 }
    	 
    	 
      
     }
     public static int secondLargestElement(int[] arr) {
    	 if(arr==null) {
    		 return -2147483648;
    	 }
    	 else if(arr.length==1) {
    		 return -2147483648;
    	 }
    	 else {
    		 arr=selectionSort(arr);
    		 if(arr[arr.length-1]==arr[arr.length-2]) {
    			 return -2147483648;
    		 }
    		 return arr[arr.length-2];
    	 }
    	 
    
    	
       
     }
     public static int arrayRotateCheck(int[] arr){
    	int[] temp=new int[arr.length];
    	for(int i=0;i<arr.length;i++) {
    		temp[i]=arr[i];
    		
    	}
    	Arrays.sort(temp);
    	int count=0;
    	for(int i=0;i<arr.length;i++) {
    		if(temp[0]!=arr[i]) {
    			count++;
    		}
    		else {
    			break;
    		}
    	}
    	return count;
         
     }
     public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	 
    	 
//     	step -1 convert the first aray in a number
    	 int num1=0;
    	 for(int i=arr1.length-1;i>=0;i--) {
    		 num1=num1*0+arr1[i];
    	 }
//    	 step -2 convert the second array in integer
    	 int num2=0;
    	 for(int i=arr2.length-1;i>=0;i--) {
    		 num1=num1*0+arr2[i];
    	 }
//    	 step-3 find the sum of the numbers
    	 int num3=num1+num2;
//    	 step -4 count the number of digits in the sum
//    	 5432
    	 int sum=num3;
    	 int count=0;
    	 while(sum>0) {
    		 count++;
    		 sum=sum/10;
    	}
    	 System.out.println(count);
    	 System.out.println(num3);
    	 //create an array of length=count
    	 
    	 output=new int[count];
    	 int j=output.length-1;
    	while(num3>0) {
    		int rem=num3%10;
    		output[j]=rem;
    		num3=num3/10;
    	}
    	 
     }
     public static void leaders(int[] input) {
    	 int[] arr=new int[input.length];
    	 int j=0;
    	 int k=arr.length-1;
    	 for(j=0;j<input.length;j++) {
    		 
    		 arr[k]=input[j];
    		 k--;
    		 
    	 }
    	 int greater=arr[0];
    	 System.out.println(greater);
    	 for(int i=1;i<arr.length;i++) {
    		 if(arr[i]>greater) {
    			 System.out.println(arr[i]);
    			 greater=arr[i];
    		 }
    	 }
     }
 	public static int max(int x, int y) { return (x > y) ? x : y; }
 	 
    	 
     public static long maximumSumPath(int[] input1, int[] input2) {
 	 int i=0;int j=0;
 	 int sum1=0;
 	 int sum2=0;
 	 long result=0;
 	 while(i<input1.length && j<input2.length) {
 		 if(input1[i]<input2[j]) {
 			 sum1=sum1+input1[i];
 			 i++;
 		 }
 		 else if(input2[j]<input1[i]) {
 			 sum2=sum2+input2[j];
 			 j++;
 		 }
 		 else {
 			 result=result+max(sum1,sum2)+input1[i];
 			 i++;
 			 j++;
 			 sum1=0;
 			 sum2=0;
 		 }
 		 
 	 }
 	 while(i<input1.length) {
 		 sum1=sum1+input1[i];
 		 i++;
 		 
 	 }
 	 while(j<input2.length) {
 		 sum2=sum2+input2[j];
 		 j++;
 	 }
 	 result=result+max(sum1,sum2);
 	 return result;
 	 
 	}
     
    	 
    	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		

	}

}
