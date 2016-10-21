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
		Arrays.sort(randomIntegers);
		int counter = 0;
		randomIntegers[counter] = randomIntegers[0];
		for (int i = 0; i < randomIntegers.length; i++) {
			if (randomIntegers[counter] != randomIntegers[i]) {
				counter++;
				randomIntegers[counter] = randomIntegers[i];
			}
		}
		return Arrays.copyOf(randomIntegers, counter + 1);
	}

	
	public int[] deDupLite(int[] randomIntegers) {		
		int end = randomIntegers.length;		
	    for (int i = 0; i < end; i++) {
	        for (int j = i + 1; j < end; j++) {
	            if (randomIntegers[i] == randomIntegers[j]) {                  
	                randomIntegers[j] = randomIntegers[--end];
	                j--;
	            }
	        }
	    }

	    int[] whitelist = new int[end];
	    System.arraycopy(randomIntegers, 0, whitelist, 0, end);
	    return whitelist;
		
		
	}

}
