import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo biến
        System.out.println("Nhap so a: ");
        int a = sc.nextInt();
        System.out.println("Nhap so b: ");
        int b = sc.nextInt();

        // Gọi phương thức
        System.out.println("Ket qua cua phep cong la: " + tinhTong(a, b));
        System.out.println("Ket qua cua phep tru la: " + tinhHieu(a, b));
        System.out.println("Ket qua cua phep nhan la: " + tinhTich(a, b));
        System.out.println("Ket qua cua phep chia la: " + tinhThuong(a, b));
        System.out.println("Ket qua cua phep chia du la: " + tinhChiaDu(a, b));
    }

    // Phương thức tính tổng
    public static int tinhTong(int a, int b) {
        return a + b;
    }

    // Phương thức tính hiệu
    public static int tinhHieu(int a, int b) {
        return a - b;
    }

    // Phương thức tính tích
    public static int tinhTich(int a, int b) {
        return a * b;
    }

    // Phương thức tính thương
    public static int tinhThuong(int a, int b) {
        if (b == 0) {
            System.out.println("Khong the chia cho 0");
            return 0;
        }
        return a / b;
    }

    // Phương thức tính chia dư
    public static int tinhChiaDu(int a, int b) {
        if (b == 0) {
            System.out.println("Khong the chia cho 0");
            return 0;
        }
        return a % b;
    }
}
