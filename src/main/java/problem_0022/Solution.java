package problem_0022;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    // IPv4 Regex
    // ^ : bắt đầu chuỗi
    // (...)|(...)|(...) : kiểm tra 1 octet (0-255)
    //   - 25[0-5]      : 250-255
    //   - 2[0-4][0-9]  : 200-249
    //   - [01]?[0-9]?[0-9] : 0-199 (cho phép leading zeros)
    // \\. : dấu '.' ngăn cách các octet
    // (...)\\. {3} : lặp 3 lần (octet.)
    // (...) : octet cuối (không có dấu '.')
    // $ : kết thúc chuỗi

    String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])$";
}

//Write your code here