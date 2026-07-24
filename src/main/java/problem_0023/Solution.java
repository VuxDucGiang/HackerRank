package problem_0023;

import java.security.MessageDigest;
import java.util.HexFormat;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        // Gọi hàm hash
        try {
            System.out.println(hash(input));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // MessageDigest là một lớp trong java thuộc package java.security, dùng để băm
    // giá trị của thuật toán
    // MD5
    // SHA-1
    // SHA-256
    // SHA-384
    // SHA-512
    // String -> byte[] -> SHA256 -> Hex
    public static String hash(String input) throws Exception {
        // Tạo đối tượng SHA
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        // Chuyển chuỗi sang dạng byte rồi hash
        byte[] hash = md.digest(input.getBytes());
        // Chuyển sang dạng hexa
        return HexFormat.of().formatHex(hash);
    }

}

/*
 * public class Solution {
 * 
 * public static void main(String[] args) throws NoSuchAlgorithmException {
 * Scanner input = new Scanner(System.in);
 * MessageDigest m = MessageDigest.getInstance("SHA-256");
 * m.reset();
 * m.update(input.nextLine().getBytes());
 * for (byte i : m.digest()) {
 * System.out.print(String.format("%02x", i));
 * }
 * System.out.println();
 * }
 * }
 */