package problem_0020;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String[] arr = s.split("[ !,?._'@]+");
        if (s.isEmpty()){
            System.out.println(0);
            return;
        }
        scan.close();
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

