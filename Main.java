package Pak1;
import java.util.*;
import java.io.*;
public class Main {
	public static void main (String[] args)
    {
       
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=ob.nextInt();
            
        }
        Bubblesort obb=new Bubblesort();
        obb.sort(a,n);
        
        Selectionsort obs=new Selectionsort();
        obs.sort(a,n);
        
        
    
    }
}
