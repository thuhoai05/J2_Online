package OOP.Controllers;

import java.util.Scanner;

import OOP.models.Coder;

public class OOP {
    static int defaultage = 18;

    public static void main(String[] args) {
        // Parameter: tham số: phương thức thongBao (String baocao)
        // Argument: Ở hàm main hay phương thức khác
        // thongBao ("hom nay nghi hoc som hon 30p");
        // từ khóa this: phân biệt biến instance (thành viên)
        // biến cục bộ - parameter có cùng tên.
        // instanceof() -> trả về true/false
        // Toán tử instanceof() sẽ được sử dụng để kiểm tra xem 1 đối tượng có thuộc về
        // 1 kiểu dữ liệu nào đó hay không(có thể là lớp interface)
        //
        // Coder coder1 = new Coder("Java", "Hoai", 19, "0961110859"); // constructor
        // không đối
        // System.out.println("Ngon ngu lap trinh: " +
        // coder1.getProgramming_Language());
        // Coder coder2 = new Coder ("C++","ABC",19,"0123456789");
        // System.out.println("Ngon ngu lap trinh: "+coder2.getProgramming_Language());
        System.out.println(coder1 instanceof Person);
        System.out.println(psl instanceof Coder);

        // List
        // ArrayList
        Coder coder1 = new coder();
        Coder coder2 = new coder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Yeu cau nhap ten:");
        String name = sc.next();
        coder1.setName(name);
        System.out.println("Nhap tuoi: ");
        int age = sc.nextInt();
        // while (age < defaultage) {
        // System.out.println("Your age is not suitable. Try again");
        // System.out.println("Your age");
        // age = sc.nextInt();
        // }
        coder1.getAge();
        while (coder1.getAge() == 0) {
            age = sc.nextInt();
            coder1.setAge(age);
        }
        coder1.setAge(age);
        System.out.println("Yeu cau nhap sdt:");
        String phone = sc.next();
        coder1.setPhone(phone);
        System.out.println("Ngon ngu lap trinh: ");
        String lang = sc.next();
        coder1.setProgramming_Language(lang);
        System.out.println("name" + coder1.getName() + "\ntuoi" + coder1.getAge() + "\nsdt" + coder1.getPhone()
                + "\nlang" + coder1.getProgramming_Language());

    }
}
