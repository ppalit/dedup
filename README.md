## REPORT

### 1.deDupWithOrder
```
	public int[] deDupWithOrder(int[] randomIntegers);
```

This approach takes the int[] and assigns it to a LinkedHashSet by iterating over it.
Assigning it to a Set automatically removes all duplicates.
Since it is a LinkedHashSet the order is maintained.
 
The method has a Complexity of 2n 
This uses pivoted Quick Sort to sort the array and then once the array is sorted removes the depulacates

Sorting complexity is (O)nlogn

### 2. de
```
	public int[] deDupBySort(int[] randomIntegers);
```


### 3. 
```
	public int[] deDupLite(int[] randomIntegers);
```