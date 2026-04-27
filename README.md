# Java DSA Solutions

This repository contains a collection of optimized solutions to competitive programming problems from Codeforces. I created this repository to showcase my proficiency in **Java**, specifically focusing on data structures, algorithm design, and writing time-efficient code.

## 🛠️ Technical Skills Demonstrated
* **Java Collections Framework**: Extensive use of `HashMap`, `ArrayList`, and `Arrays`.
* **Advanced Sorting**: Utilizing custom comparators and lambda expressions (`(a, b) -> b - a`).
* **Algorithmic Paradigms**: Greedy algorithms, Prefix/Suffix array precomputation, and frequency mapping.
* **Optimization**: Writing strictly optimal code to pass tight $O(N \log N)$ and $O(N)$ time limits.

---

## 📂 Problem Breakdown

### 1. Destruction of the Dandelion Fields
* **Platform**: Codeforces Round 1050 (Div. 4) - Problem D
* **Core Logic**: A greedy approach utilizing parity checking and custom sorting. The algorithm separates odd-numbered fields, sorts them in descending order using Java's `Collections.sort()` with a lambda expression, and calculates the optimal collection order to maximize the total yield.
* **Time Complexity**: $O(N \log N)$ due to sorting.
* **File**: [`DandelionFields.java`](./DandelionFields.java)

### 2. Group Formation / Array Partitioning
* **Platform**: Codeforces Round 1047 (Div. 3)
* **Core Logic**: Validating and grouping array elements based on their values and frequencies. This solution heavily relies on a `HashMap<Integer, ArrayList<Integer>>` to group indices by their array values. It then verifies if the size of each group is strictly divisible by its key, dynamically assigning group IDs if valid.
* **Time Complexity**: $O(N)$ for linear mapping and assignment.
* **File**: [`ReplaceWithOccurences.java`](./ReplaceWithOccurences.java)

### 3. Prefix Min and Suffix Max
* **Platform**: Codeforces Round 1034 (Div. 3) - Problem C
* **Core Logic**: Dynamic programming / Array precomputations. To determine if an array can be reduced to a specific element using prefix-min and suffix-max operations, the solution precomputes the minimums of all prefixes and the maximums of all suffixes using strictly linear passes.
* **Time Complexity**: $O(N)$ with two linear passes for precomputation.
* **File**: [`PrefixMinAndSuffixMax.java`](./PrefixMinAndSuffixMax.java)

---

## 🚀 How to Run Locally

To compile and run any of these solutions locally, ensure you have the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) installed.

1. Clone this repository:

```bash
git clone [https://github.com/tashad19/Java-DSA-Solutions.git](https://github.com/tashad19/Java-DSA-Solutions.git)
```

2. Navigate to the directory:

```bash
cd Java-DSA-Solutions
```

3. Compile the desired Java file:

```bash
javac DandelionFields.java
```

4. Run the compiled class (you can pipe in your own input or type it directly):

```bash
java DandelionFields
```
