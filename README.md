# DAA Lab

Simple Java programs for Design and Analysis of Algorithms lab experiments.

## How to run

Open a terminal in the folder containing a program, then run:

    javac ProgramName.java
    java ProgramName

Each program contains a small example in its main method, so it can be run and understood without extra input.

## Experiment 1: Basic Sorting and Array Problems

| Program | Main idea | Complexity |
| --- | --- | --- |
| InsertionSort.java | Iterative and recursive insertion sort | O(n^2) time; O(1) iterative space / O(n) recursive space |
| DutchNationalFlag.java | Three-pointer sorting of 0s, 1s and 2s | O(n) time, O(1) space |
| MajorityElement.java | Moore's Voting Algorithm with candidate verification | O(n) time, O(1) space |

## Experiment 2: Searching and Divide-and-Conquer

| Program | Main idea | Complexity |
| --- | --- | --- |
| UnionIntersection.java | Two-pointer union and intersection of sorted arrays | O(n + m) time |
| SearchRotatedSortedArray.java | Binary search in a rotated sorted array | O(log n) time |
| MergeSort.java | Divide, sort and merge | O(n log n) time, O(n) space |
| CountInversions.java | Count inversions while merging | O(n log n) time, O(n) space |

The examples are intentionally small and readable so the algorithm steps are easy to follow.
