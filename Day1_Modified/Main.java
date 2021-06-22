package Pak1;
import java.util.*;
import java.io.*;
public class Main {
	public static void main (String[] args)
    {
       
        Scanner ob = new Scanner(System.in);
        int size=ob.nextInt();
        int array[]=new int[size];
        int result[] = new int[size];
        int i,option;
        for(i=0;i<size;i++){
            array[i]=ob.nextInt();
        }
        Sortingalgorithm bs = new Bubblesort();
        Sortingalgorithm ss = new Selectionsort();
        System.out.println("Select the Sorting Algorithm\n1 -> Bubblesort Algorithm\n2 -> Selectionsort Algorithm");
        option=ob.nextInt();
        System.out.println("Before Sorting");
        for(i=0;i<size;i++) {
        	System.out.print(array[i]+" ");
        }
        switch(option) {
        case 1:
        	System.out.println("\nUsing Bubblesort Algorithm");
        	result = bs.sort(array, size);
        	for(i=0;i<size;i++) {
        		System.out.print(result[i]+" ");
        	}
        	break;
        case 2:
        	System.out.println("\nUsing Selectionsort Algorithm");
        	result = ss.sort(array, size);
        	for(i=0;i<size;i++) {
        		System.out.print(result[i]+" ");
        	}
        	break;
        }
        
    
    }
}
