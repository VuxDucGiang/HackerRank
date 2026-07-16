package problem_0015;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstStr = sc.nextLine();
        String secondStr = sc.nextLine();
        sc.nextLine();
        sc.close();
        System.out.println(firstStr.length() + secondStr.length());
        System.out.println((firstStr.charAt(0)) > (secondStr.charAt(0)) ? "Yes" : "No");
        // firstStr.charAt(0) : Lấy ký tự đầu tiên (tại vị trí index 0) của chuỗi firstStr
        // secondStr.charAt(0) : Lấy ký tự đầu tiên cảu cuối secondStr
        // Toans tử tam phân : (điều kiện) ? giá trị nếu đúng : giá trị nếu sai
        System.out.printf("%s %s", capitalize(firstStr), capitalize(secondStr));

    }

    public static String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1);
        /*  s.substring(0, 1): Lấy ra ký tự đầu tiên của
        chuỗi (từ vị trí 0 đến trước vị trí 1). */
        /* .toUpperCase(): Chuyển ký tự đầu tiên đó thành chữ viết hoa.*/
       /* + s.substring(1): Cắt lấy phần còn lại của chuỗi
       (từ vị trí thứ 2 trở đi, tức là index 1) và nối vào sau chữ cái đã viết hoa.*/

    }
}


