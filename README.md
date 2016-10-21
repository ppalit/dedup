## REPORT

## Build and execute instructions:

clone or download the project.
To build and run with Maven:

mvn clean install

jar is created in /target folder of the project and then run:
```
java -jar dedup-0.0.1-SNAPSHOT.jar 
```

### 1.deDupWithOrder
```
	public int[] deDupWithOrder(int[] randomIntegers);
```

This approach takes the int[] and assigns it to a LinkedHashSet by iterating over it.
Assigning it to a Set automatically removes all duplicates.
Since it is a LinkedHashSet the order is maintained.
 
The method has a Complexity of  O(n) 


### 2. deDupBySort
```
	public int[] deDupBySort(int[] randomIntegers);
```
This approach first sorts the array.
Then iterates over it replacing each duplicate element with the next element.

Since the highest complexity is for the sorting algorithm. the eventual complexity is 
O(nlogn)

### 3. deDupLite
```
	public int[] deDupLite(int[] randomIntegers);
```
This is the easiest but the most inefficient approach
for each element of the array the entire array is scanned for match . For every match the element is replaced with the furthest element. 
Finally the array obtained is unique up till the end count, which is extracted and returned.

It has a O(n^2)
