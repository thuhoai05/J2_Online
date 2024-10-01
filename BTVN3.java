import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Nhap vao 1 so nguyen duong: ");
         * int n = sc.nextInt();
         * int b = n + 5;
         * while (n <= b) {
         * System.out.println(n);
         * n++;
         * }
         */

        // Nhập số a và b
        System.out.println("Moi ban nhap so: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // In ra màn hình menu lựa chọn
        while (true) {
            System.out.println("1. Cong");
            System.out.println("2. Tru");
            System.out.println("3. Nhan");
            System.out.println("4. Chia");
            System.out.println("5. Thoat");
            System.out.println("Moi ban lua chon: ");
            int choice = sc.nextInt();

            // Xử lý các trường hợp lựa chọn
            switch (choice) {
                case 1:
                    int c = a + b; // Phương thức cộng a và b
                    System.out.println("Tong cua a va b la: " + c); // In ra kết quả cộng và gọi phương thức cộng
                    break;
                case 2:
                    int d = a - b;// Phương thức hiệu của a và b
                    System.out.println("Hieu cua a va b la: " + d); // In ra kết quả trừ và gọi phương thức hiệu
                    break;
                case 3:
                    int e = a * b; // Phương thức nhân của a và b
                    System.out.println("Tich cua a va b la: " + e); // In ra kết quả tích và gọi phương thức nhân
                    break;
                case 4:
                    int f = a / b; // Phương thức chia của a và b
                    System.out.println("Thuong cua a va b la: " + f); // In ra kết quả thương và gọi phương thức chia
                    break;
                case 5:
                    System.exit(0); // Thoát chương trình
                default:
                    System.out.println("Lua chon khong hop le, vui long thu lai!"); // Xử lý lựa chọn không hợp lệ
            }
        }
    }
}

/*
 * Cho người dùng nhập vào 2 số nguyên , hiện menu lên bao gồm 5 tác vụ:
 * 1. cộng
 * 2. trừ
 * 3. nhân
 * 4. chia
 * 5. thoát
 */
