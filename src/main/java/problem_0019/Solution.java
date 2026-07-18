package problem_0019;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram1(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return Arrays.equals(arrA, arrB);
    }

    static boolean isAnagram(String a, String b) {

        // Nếu độ dài khác nhau thì không phải anagram
        if (a.length() != b.length()) {
            return false;
        }

        // Chuyển về chữ thường
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Mảng đếm 26 chữ cái
        int[] count = new int[26];

        // Tăng số lần xuất hiện của chuỗi a
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
        }

        // Giảm số lần xuất hiện của chuỗi b
        for (int i = 0; i < b.length(); i++) {
            count[b.charAt(i) - 'a']--;
        }

        // Kiểm tra mảng đếm
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram1(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
