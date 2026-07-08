# [Java If-Else](https://www.hackerrank.com/challenges/java-if-else)

## Task

Given an integer, $N$, perform the following conditional actions:
- If $N$ is odd, print `Weird`
- If $N$ is even and in the inclusive range of $2$ to $5$, print `Not Weird`
- If $N$ is even and in the inclusive range of $6$ to $20$, print `Weird`
- If $N$ is even and greater than $20$, print `Not Weird`

Complete the stub code provided in your editor to print whether or not $N$ is weird.

## Input Format

A single line containing a positive integer, $N$.

## Constraints

- $1 \le N \le 100$

## Output Format

Print `Weird` if the number is weird; otherwise, print `Not Weird`.

## Sample Input 0

```text
3
```

## Sample Output 0

```text
Weird
```

## Sample Input 1

```text
24
```

## Sample Output 1

```text
Not Weird
```

## Explanation

- **Sample Case 0**: $N = 3$ is odd, and odd numbers are weird, so we print `Weird`.
- **Sample Case 1**: $N = 24$ is even and greater than $20$, so it isn't weird. Thus, we print `Not Weird`.

---

## Solution

The Java solution can be found here: [Solution.java](../src/main/java/problem_0004/Solution.java)