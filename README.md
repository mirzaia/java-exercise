# Java Coding Interview Practice Project

Welcome to your dedicated workspace for LeetCode-style coding challenges! This project is designed to help you prepare for your upcoming coding interview by providing a structured environment to solve problems, write code, and verify your solutions using automated tests.

---

## 📂 Project Structure

The project follows the standard Maven directory structure, separating your implementation logic from the verification tests.

```text
java-exercise/
├── pom.xml                 # Maven configuration (dependencies, Java version, plugins)
├── README.md               # This guide
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── exercises/
│   │               ├── TwoSum.java             # Challenge implementation stubs
│   │               ├── ReverseString.java
│   │               ├── PalindromeNumber.java
│   │               ├── ValidParentheses.java
│   │               ├── LongestSubstring.java
│   │               ├── MergeIntervals.java
│   │               ├── BinaryTreeLevelOrder.java
│   │               └── TreeNode.java           # Helper class for Tree problems
│   └── test/
│       └── java/
│           └── com/
│               └── exercises/
│                   ├── TwoSumTest.java         # Automated JUnit 5 tests
│                   ├── ReverseStringTest.java
│                   ├── PalindromeNumberTest.java
│                   ├── ValidParenthesesTest.java
│                   ├── LongestSubstringTest.java
│                   ├── MergeIntervalsTest.java
│                   └── BinaryTreeLevelOrderTest.java
└── target/                 # Compiled classes and test reports (generated after build)
```

### Key Components:
- **`src/main/java`**: This is where you write your code. Each challenge has its own Java class with a method signature matching common LeetCode problems.
- **`src/test/java`**: Contains pre-written JUnit 5 test cases. These tests cover various scenarios, including edge cases, to ensure your solution is robust.
- **`TreeNode.java`**: A standard helper class used for binary tree challenges.

---

## 🚀 Getting Started & Guidelines

Follow these steps to effectively use this project for your practice:

### 1. Prerequisites
Ensure you have the following installed on your system:
- **Java 17** or higher.
- **Apache Maven**.

### 2. Choose a Challenge
Browse the files in `src/main/java/com/exercises/`. Each file contains:
- A description of the problem.
- Example inputs and outputs.
- A method stub with a `// TODO` comment where you should write your logic.

### 3. Implement the Solution
Focus on writing clean, efficient code. Consider the time and space complexity of your approach, as these are common interview topics.

### 4. Verify with Tests
Once you've implemented a solution, run the corresponding test to see if it passes.

- **To run all tests in the project:**
  ```bash
  mvn test
  ```
- **To run a specific test (e.g., TwoSum):**
  ```bash
  mvn test -Dtest=TwoSumTest
  ```

### 5. Review and Refactor
If a test fails, analyze the output in the console. Maven will tell you which assertion failed and what the expected vs. actual values were. Use this feedback to debug and improve your code.

---

## 🧠 Challenge Overview

### Beginner Level (Warm-ups)
1.  **Two Sum**: Basic array manipulation and Hash Map usage.
2.  **Reverse String**: In-place array modification and two-pointer technique.
3.  **Palindrome Number**: Mathematical logic without string conversion.
4.  **Valid Parentheses**: Classic use case for the Stack data structure.

### Intermediate Level (Core Interview Topics)
5.  **Longest Substring Without Repeating Characters**: Master the "Sliding Window" pattern.
6.  **Merge Intervals**: Sorting and interval overlapping logic.
7.  **Binary Tree Level Order Traversal**: Breadth-First Search (BFS) implementation.

---

## 💡 Interview Tips
- **Read the problem twice**: Ensure you understand all constraints.
- **Think out loud**: If you were in a real interview, you'd be explaining your thought process. Practice that while you code!
- **Consider edge cases**: What if the input is empty? What if it's very large?
- **Dry run**: Trace your code with a simple example before running the tests.

**Happy Coding and Good Luck with your Interview!**
