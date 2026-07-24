package problem_0025;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Adder a = new Adder();

        System.out.println(
                "My superclass is: "
                        + a.getClass().getSuperclass().getName());

        System.out.println(a.callAdd(41, 1) + " " + a.callAdd(12, 1) + " " + a.callAdd(19, 1));

    }
}

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    public int callAdd(int a, int b) {
        return add(a, b);
    }
}