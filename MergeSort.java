import java.util.Arrays;
//Sources:  https://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Merge_sort
//http://web.cs.iastate.edu/~smkautz/cs227s17/examples/week11/MergeSort.java
public class MergeSort {
	public static int[] mergeSort(int[] a, int[] b){
	 //If list is empty; no need to do anything
    if (a.length <= 1) {
        return a;
    }
     
    //Split the array in half in two parts
    int[] first = new int[a.length / 2];
    int[] second = new int[a.length - first.length];
    System.arraycopy(a, 0, first, 0, first.length);
    System.arraycopy(a, first.length, second, 0, second.length);
     int[] third = new int[b.length/2];
     int[] fourth = new int[b.length - third.length];
     System.arraycopy(b, 0, third, 0, third.length);
     System.arraycopy(b, third.length, fourth, 0, fourth.length);
    //Sort each half recursively
    mergeSort(first,second);
    mergeSort(third,fourth);
     
    //Merge both halves together, overwriting to original array
int[] result = new int[a.length+b.length];
    int iFirst = 0;
    
    //Index Position in second array - starting with first element
    int iSecond = 0;
     
    //Index Position in merged array - starting with first position
    int iMerged = 0;
     
    //Compare elements at iFirst and iSecond,
    //and move smaller element at iMerged
    while (iFirst < first.length && iSecond < second.length)
    {
        if (first[iFirst] < 0 && second[iSecond] < 0)
        {
            result[iMerged] = first[iFirst];
            iFirst++;
        }
        else
        {
            result[iMerged] = second[iSecond];
            iSecond++;
        }
        iMerged++;
    }
    //copy remaining elements from both halves - each half will have already sorted elements
    System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
    System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
	return result;
}
	 public static void main(String[] args)
	    {
	        //Unsorted array
	        int[] x= { 2, 6, 3};
	         int[] y= {3, 5, 1};
	        //Call merge sort
	       
	        //Check the output which is sorted array
	        System.out.println(Arrays.toString(mergeSort(x,y)));
	    }
}
