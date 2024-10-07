import java.util.Scanner;

public class Quanlyhocsinh {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Xem danh sách học sinh");
            System.out.println("2. Thêm học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Sửa học sinh");
            System.out.println("5. Tìm học sinh theo tên");
            System.out.println("6. Thoát");
            System.out.println("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentManager.displayStudents();
                    break;
                case 2:
                    studentManager.addStudent();
                    break;
                case 3:
                    studentManager.deleteStudent();
                    break;
                case 4:
                    studentManager.updateStudent();
                    break;
                case 5:
                    studentManager.findStudentByName();
                    break;
                case 6:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 6);

        scanner.close();
    }

}
