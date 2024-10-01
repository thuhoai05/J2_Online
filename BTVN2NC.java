
import java.util.Scanner;

public class BTVN2NC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a la: ");
        int a = sc.nextInt();
        System.out.println("Nhap so b la: ");
        int b = sc.nextInt();
        if ((a > b) && (a % 2 == 0)) {
            int tinhTongSo = a + b;
            System.out.println("Tong hai so nguyen a va b la: " + tinhTongSo);
        } else {
            int tinhHieuSo = Math.abs(a - b);
            System.out.println("Hieu cua hai so nguyen lon tru be la: " + tinhHieuSo);
        }
    }
}