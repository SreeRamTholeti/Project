package Pak1;

public class Bubblesort {
	public void sort(int[] a,int n){
        int temp=0,i,j; 
         for(i=0; i < n; i++){  
            for(j=1;j<(n-i);j++){  
                if(a[j-1]>a[j]){  
                    temp=a[j-1];  
                    a[j-1]=a[j];  
                    a[j]=temp;  
                }  
            }  
         }
         display(a,n);
    }
    public void display(int[] a,int n)
    {
        int i;
        System.out.println("output of Bubble sort:-");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
