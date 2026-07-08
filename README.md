# HackerRank Java Solutions

A repository containing structured descriptions and Java solutions to HackerRank Java practice challenges.

---

## 📋 Problem Set & Solutions

Here is the list of problems resolved in this repository:

| Problem ID | Title | Description | Challenge Link | Solution | Difficulty |
|:---:|:---|:---|:---:|:---:|:---:|
| **`0001`** | Java Stdin and Stdout II | [problem_0001.md](problems/problem_0001.md) | [HackerRank](https://www.hackerrank.com/challenges/java-stdin-stdout) | [Solution.java](src/main/java/problem_0001/Solution.java) | `Easy` |
| **`0002`** | Welcome to Java! | [problem_0002.md](problems/problem_0002.md) | [HackerRank](https://www.hackerrank.com/challenges/welcome-to-java) | [Solution.java](src/main/java/problem_0002/Solution.java) | `Easy` |
| **`0003`** | Java Stdin and Stdout I | [problem_0003.md](problems/problem_0003.md) | [HackerRank](https://www.hackerrank.com/challenges/java-stdin-stdout-1) | [Solution.java](src/main/java/problem_0003/Solution.java) | `Easy` |
| **`0004`** | Java If-Else | [problem_0004.md](problems/problem_0004.md) | [HackerRank](https://www.hackerrank.com/challenges/java-if-else) | [Solution.java](src/main/java/problem_0004/Solution.java) | `Easy` |

---

## 🛠️ Project Structure

The project is structured as follows:

```text
HackerRank/
├── problems/                  # Markdown files containing problem statements
│   ├── problem_0001.md
│   ├── problem_0002.md
│   ├── problem_0003.md
│   └── problem_0004.md
├── src/main/java/             # Java solution implementations
│   ├── problem_0001/Solution.java
│   ├── problem_0002/Solution.java
│   ├── problem_0003/Solution.java
│   └── problem_0004/Solution.java
└── README.md                  # Main overview of the repository
```

---

## 🚀 How to Run the Solutions

To compile and run any of the solutions locally:

1. Navigate to the root directory of the project.
2. Compile the Java file using `javac`:
   ```bash
   javac src/main/java/problem_<ID>/Solution.java -d target/classes
   ```
3. Run the compiled class using `java` (providing input if needed):
   ```bash
   java -cp target/classes problem_<ID>.Solution
   ```
   *Example for Problem 0001:*
   ```bash
   java -cp target/classes problem_0001.Solution
   ```