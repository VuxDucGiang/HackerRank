package problem_0010;
import java.util.Scanner;

// trong static block khi chạy thì các static block chạy trước sau đó đến main,
// nếu có nhiều static block thì thứ tuwj chạy là từ trên xuống dưới
public class Solution {

    static int B;
    static int H;
    static boolean flag = false;

    static {
        Scanner sc = new Scanner(System.in);

        try {
            B = sc.nextInt();
            H = sc.nextInt();

            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            }

            flag = true;

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}