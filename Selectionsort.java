package Pak1;

public class Selectionsort {
	 public void sort(int[] a,int n){
         for (int i=0; i<n-1;i++)  
        {  
            int index=i;  
            for (int j= i+1;j<n;j++){  
                if (a[j]<a[index]){  
                    index=j;
                }  
            }  
            int smallerNumber=a[index];   
            a[index]=a[i];  
            a[i]=smallerNumber;  
        }  
         display(a,n);
        
    }
    public void display(int[]a, int n)
    {
         int i;
        System.out.println("\noutput of selection sort:-");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
