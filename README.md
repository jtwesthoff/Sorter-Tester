# Java Sorting and Searching Project

This project includes classes for sorting arrays using merge sort and bubble sort algorithms, as well as performing binary search operations.

## Sorter Class

### Introduction
The `Sorter` class provides methods for sorting arrays using merge sort and bubble sort algorithms. It also includes a method for performing binary search operations on sorted arrays.

### Usage
To utilize the `Sorter` class, follow these steps:
1. Instantiate a `Sorter` object.
2. Set the data array using the `setData(int[] data)` method.
3. Call the desired sorting or searching method.

### Methods
- `Sorter()`: Default constructor.
- `Sorter(int[] data)`: Constructor with initial data array.
- `setData(int[] data)`: Sets the data array.
- `mergesort()`: Performs merge sort on the data array.
- `merge(int f, int m, int l)`: Helper method for merge sort.
- `bubbleSort()`: Performs bubble sort on the data array.
- `swap(int m, int n)`: Helper method for bubble sort.
- `binarySearch(int key)`: Performs binary search on the sorted data array.
- `binarySearchRecursive(int lo, int hi, int key)`: Helper method for binary search.

## SorterTester Class

### Introduction
The `SorterTester` class is designed to test the functionalities of the `Sorter` class by timing the merge sort and bubble sort algorithms, as well as performing binary search operations.

### Usage
To run the tests:
1. Compile the `SorterTester.java` file.
2. Execute the compiled program.

### Test Procedure
1. Generate random data arrays for testing.
2. Time the merge sort and bubble sort algorithms.
3. Perform binary search operations on key values.

## Contributors
- Joseph Westhoff
