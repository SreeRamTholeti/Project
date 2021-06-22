package Pak1;

public class Bubblesort implements Sortingalgorithm {
	public int[] sort(int[] array,int size){
        int temp=0,i,j; 
         for(i=0; i < size; i++){  
            for(j=1;j<(size-i);j++){  
                if(array[j-1]>array[j]){  
                    temp=array[j-1];  
                    array[j-1]=array[j];  
                    array[j]=temp;  
                }  
            }  
         }
		return array;
    }
}