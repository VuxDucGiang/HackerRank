# [Java Substring](https://www.hackerrank.com/challenges/java-substring)

Given a string, $S$, and two indices, `start` and `end`, print a substring consisting of all characters in the inclusive range from `start` to `end - 1`. You'll find the `String` class' `substring` method helpful in completing this challenge.

## Input Format

The first line contains a single string denoting $S$.
The second line contains two space-separated integers denoting the respective values of `start` and `end`.

## Constraints

- $1 \le |S| \le 100$
- $0 \le \text{start} < \text{end} \le |S|$
- String $S$ consists of English alphabetic letters (i.e., $[a-zA-Z]$) only.

## Output Format

Print the substring in the inclusive range from `start` to `end - 1`.

## Sample Input

```text
Helloworld
3 7
```

## Sample Output

```text
lowo
```

---

## Solution

The Java solution can be found here: [Solution.java](../src/main/java/problem_0016/Solution.java)