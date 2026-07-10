package problem_0008;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            int power = (int) Math.pow(2, 0); // luỹ thừa trong đó 2 là cơ số, 0 là số mũ
            for (int j = 0; j < n; j++) {

                sum = sum + power * b;
                System.out.print(sum);
                if (j < n - 1) {
                    System.out.print(" ");
                }
                power = power * 2;
            }
            System.out.println();
        }
        in.close();
    }
}