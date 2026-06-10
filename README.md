# Part 2: Problem-Solving Reflection

## Problem 1: Two Sum

**1. First Thought**
Check every pair of numbers and see if their sum equals the target.

**2. Brute Force Approach**
Use two loops. Compare each element with all elements after it. If the sum matches the target, return the indices.

**3. Complexity**

* Time: O(n²)
* Space: O(1)

**4. Better Solution**
Use a HashMap to store numbers and their indices while traversing the array.

**5. Optimization**
The nested loop causes repeated comparisons. A HashMap allows direct lookup of the required value.

**Optimized Complexity**

* Time: O(n)
* Space: O(n)

---

## Problem 2: Longest Substring Without Repeating Characters

**1. First Thought**
Generate all substrings and check whether each substring contains unique characters.

**2. Brute Force Approach**
Create every possible substring and verify if any character repeats.

**3. Complexity**

* Time: O(n³)
* Space: O(n)

**4. Better Solution**
Use a sliding window and HashMap to track the latest position of characters.

**5. Optimization**
Avoid checking the same characters repeatedly. Move the window directly when a duplicate is found.

**Optimized Complexity**

* Time: O(n)
* Space: O(n)

---

## Problem 3: Climbing Stairs

**1. First Thought**
To reach stair n, I can come from stair n-1 or stair n-2.

**2. Brute Force Approach**
Use recursion and calculate both possibilities for every stair.

**3. Complexity**

* Time: O(2ⁿ)
* Space: O(n)

**4. Better Solution**
Store previously calculated answers using Dynamic Programming.

**5. Optimization**
Avoid solving the same subproblems multiple times.

**Optimized Complexity**

* Memoization: O(n) time, O(n) space
* Iterative DP: O(n) time, O(1) space

---

# Part 3: Complexity Quiz

| Concept        | Time Complexity |
| -------------- | --------------- |
| Single Loop    | O(n)            |
| Nested Loop    | O(n²)           |
| Binary Search  | O(log n)        |
| Merge Sort     | O(n log n)      |
| HashMap Lookup | O(1) average    |
| DFS Traversal  | O(V + E)        |
| BFS Traversal  | O(V + E)        |

**Summary:**
A single loop visits each element once, nested loops compare multiple elements, binary search reduces the search space by half each step, merge sort uses divide and conquer, HashMap provides fast lookup, and DFS/BFS visit every vertex and edge once.
