# [Java Regex](https://www.hackerrank.com/challenges/java-regex)

Write a class called `MyRegex` which will contain a `String` `pattern`. You need to write a regular expression and assign it to the `pattern` such that it can be used to validate an IP address.

An IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from $0$ to $255$. Leading zeros are allowed. The length of A, B, C, or D will not exceed $3$.

## Sample Input

```text
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
```

## Sample Output

```text
true
true
true
false
false
false
```

---

## Solution

The Java solution can be found here: [Solution.java](../src/main/java/problem_0022/Solution.java)
