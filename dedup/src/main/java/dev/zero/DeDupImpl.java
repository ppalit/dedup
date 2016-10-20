package dev.zero;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DeDupImpl implements DeDup{

	public int[] deDupWithOrder(int[] randomIntegers) {
		int end = randomIntegers.length;
		Set<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < end; i++) {
			set.add(randomIntegers[i]);
		}
		int[] intArr = new int[set.size()];
		int i = 0;
		for (Integer val : set) {
			intArr[i++] = val;
		}
		return intArr;
	}

	
	public int[] deDupBySort(int[] randomIntegers) {
		int[] copiedArray= Arrays.copyOf(randomIntegers, randomIntegers.length);
		Arrays.sort(copiedArray);
		int counter = 0;
		copiedArray[counter] = copiedArray[0];
		for (int i = 0; i < copiedArray.length; i++) {
			if (copiedArray[counter] != copiedArray[i]) {
				counter++;
				copiedArray[counter] = copiedArray[i];
			}
		}
		return Arrays.copyOf(copiedArray, counter + 1);
	}

	
	public int[] deDupLite(int[] randomIntegers) {		
		int end = randomIntegers.length;		
	    for (int i = 0; i < end; i++) {
	        for (int j = i + 1; j < end; j++) {
	            if (randomIntegers[i] == randomIntegers[j]) {                  
	                randomIntegers[j] = randomIntegers[end-1];
	                end--;
	                j--;
	            }
	        }
	    }

	    int[] whitelist = new int[end];
	    System.arraycopy(randomIntegers, 0, whitelist, 0, end);
	    return whitelist;
		
		
	}

}
