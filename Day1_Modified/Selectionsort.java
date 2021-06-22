package Pak1;

public class Selectionsort implements Sortingalgorithm {
	 public int[] sort(int[] array,int size){
         for (int i=0; i<size-1;i++)  
        {  
            int index=i;  
            for (int j= i+1;j<size;j++){  
                if (array[j]<array[index]){  
                    index=j;
                }  
            }  
            int smallerNumber=array[index];   
            array[index]=array[i];  
            array[i]=smallerNumber;  
        }
         return array;
    }
}
