/**
 * 
 */
package dev.zero;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ppalit
 *
 */
public class DeDupImlTest {

	public int[] randomIntegers; 
	public int[] randomIntegersOrderedExpected;
	public int[] randomIntegersSortedExpected;

	public int[] randomIntegers2;
	public int[] randomIntegers2SortedExpected;
	public int[] randomIntegersOrdered2Expected;
	
	public int[] performanceArr;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		randomIntegers = new int[] {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
		randomIntegersSortedExpected = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,25,26,34,43,45,85,86,10000};
		randomIntegersOrderedExpected = new int[]{1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43, 10000, 11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10, 14, 12, 13, 7};
		
		randomIntegers2 = new int[]{1,2,34,34,2, 5};
		randomIntegersOrdered2Expected = new int[]{1,2,34,5};
		randomIntegers2SortedExpected = new int[]{1,2,5,34};
		
		
		performanceArr = new int[100000];
		 for(int i = 0; i <  performanceArr.length; i++) {
	        	performanceArr[i] = (int) (Math.random() * 10000);
	        }
       
	}

	@Test
	public void testDeDupWithOrder() {
		DeDupImpl dedup = new DeDupImpl();
		assertArrayEquals(randomIntegersOrdered2Expected, dedup.deDupWithOrder(randomIntegers2));
		assertArrayEquals(randomIntegersOrderedExpected, dedup.deDupWithOrder(randomIntegers));
		assertNotNull( dedup.deDupWithOrder(performanceArr));
	}
	
	@Test
	public void testDeDupBySort() {
		DeDupImpl dedup = new DeDupImpl();
		assertArrayEquals(randomIntegers2SortedExpected, dedup.deDupBySort(randomIntegers2));
		assertArrayEquals(randomIntegersSortedExpected, dedup.deDupBySort(randomIntegers));
		assertNotNull( dedup.deDupBySort(performanceArr));
	}
	
	@Test
	public void testDeDupLite() {
		DeDupImpl dedup = new DeDupImpl();
		assertArrayEquals(randomIntegersOrdered2Expected, dedup.deDupLite(randomIntegers2));		
		int[] randomIntegersExpected = {1,2,34,10,25,11,45,3,26,85,4,17,86,20,43,18,8,10000,9,16,19,13,6,12,15,5,14,7};
		assertArrayEquals(randomIntegersExpected, dedup.deDupLite(randomIntegers));
    	 assertNotNull( dedup.deDupLite(performanceArr));
	}

}
