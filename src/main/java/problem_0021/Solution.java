package problem_0021;

import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases > 0) {

            String regex = scanner.nextLine();
            try {
                Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }

        scanner.close();
    }
}

//Regex (Regular Expression) là một chuỗi ký tự dùng để mô tả một mẫu
//(pattern) nhằm tìm kiếm, kiểm tra hoặc thay thế chuỗi văn bản.