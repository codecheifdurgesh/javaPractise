package array;

import java.util.Scanner;

public class arraySum {
	public static int sum(int[] arr) {

		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		return sum;
        
}

	   public static int linearSearch(int arr[], int x) {
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	        
	   }
	   public static void arrange(int[] arr, int n) {
		   int k=1;
		   int i=0;
		   int j=arr.length-1;
		   int c=0;
		   boolean start=true;
		   while(c<arr.length) {
			   if(start==true) {
				   arr[i]=k;
				   k++;
				   i++;
				   c++;
				   start=false;
				   
			   }
			   else {
				   arr[j]=k;
				   j--;
				   k++;
				   c++;
				   start=true;
			   }
		   }
	    	
	 
	    }

	   public static void swapAlternate(int arr[]) {
			
		   int n=arr.length;
		   int temp=0;
        int i=0;
		   if(n%2==0) {
			  while(i<arr.length-1){
				   temp=arr[i];
				   arr[i]=arr[i+1];
				   arr[i+1]=temp;
                  i=i+2;
				}
		   return ;
		   }
		   while(i<arr.length-2){
			   temp=arr[i];
			   arr[i]=arr[i+1];
			   arr[i+1]=temp;
               i=i+2;
			}
		   return ;
		     
	   }
	   public static int findUnique(int[] arr)
	   {for(int i=0;i<arr.length;i++) {
           boolean flag=false;
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					
					continue;
				}
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				return arr[i];
				
			}
		}
		return 0;
		}
	   public static int duplicateNumber(int arr[]) {
		 for(int i=0;i<arr.length;i++) {
			 for(int j =0;j<arr.length;j++) {
				 if(i==j) {
					 continue;
					 
				 }
				 if(arr[i]==arr[j]) {
					 return arr[i];
				 }
			 }
		 }
		 return 0;
	    }
	   
	   public static int[] sort(int[] arr) {
		   for(int i=0;i<arr.length;i++) {
			   for(int j=i+1;j<arr.length;j++) {
				   if(arr[j]<arr[i]) {
					   int temp=arr[i];
					   arr[i]=arr[j];
					   arr[j]=temp;
				   }
			   }
		   }
		   return arr;
	   }
	   public static void intersections(int[] arr1,int[] arr2)
		{
    
	        for(int i=0;i<arr1.length;i++) {
             for(int j=0;j<arr2.length;j++) {
            	 if(arr1[i]==arr2[j]) {
            		 System.out.println(arr1[i]);
            		 arr2[j]=Integer.MAX_VALUE;
            		 break;
            	 }
             }
	        }
	    }
	   public static int pairSum(int arr[], int x) {
		   int count=0;
		   for(int i=0;i<arr.length;i++) {
			   for(int j=i+1;j<arr.length;j++) {
				   if(arr[i]+arr[j]==x) {
					   count++;
				   }
			   }
		   }
		   return count;
		   
	    }
	   public static int findTriplet(int[] arr, int x) {
		   int count=0;
		   for(int i=0;i<arr.length;i++) {
			   for(int j=i+1;j<arr.length;j++) {
				   for(int k=j+1;k<arr.length;k++)
				   if(arr[i]+arr[j]+arr[k]==x) {
					   count++;
				   }
			   }
		   }
		   return count;
			
	    }
	   public static void sortZeroesAndOne(int[] arr) {
		 int count=0;
		   for(int i=0;i<arr.length-1;i++) {
			   if(arr[i]==0) {
				   count++;
			   }
		   }
		   for(int j=0;j<count;j++) {
			   arr[j]=0;
		   }
		   while(count<arr.length) {
			   arr[count]=1;
			   count++;
		   }
	    }
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			System.out.println(sum(arr));
		}

	}

}
