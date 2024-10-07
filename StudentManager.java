
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager extends Student {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Hiển thị danh sách học sinh
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách học sinh trống.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Thêm một học sinh mới
    public void addStudent() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập chuyên ngành: ");
        String major = scanner.nextLine();

        Student student = new Student(name, age, major);
        students.add(student);
        System.out.println("Đã thêm học sinh thành công.");
    }

    // Xóa học sinh theo id
    public void deleteStudent() {
        System.out.println("Nhập ID học sinh muốn xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Student studentToRemove = null;

        for (Student student : students) {
            if (student.getID() == id) {
                studentToRemove = student;
                break;
            }
        }

        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Đã xóa học sinh thành công.");
        } else {
            System.out.println("Không tìm thấy học sinh với ID đã nhập.");
        }
    }

    // Sửa học sinh theo id (không sửa id)
    public void updateStudent() {
        System.out.println("Nhập ID học sinh muốn sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Student studentToUpdate = null;

        for (Student student : students) {
            if (student.getID() == id) {
                studentToUpdate = student;
                break;
            }
        }

        if (studentToUpdate != null) {
            System.out.println("Nhập tên mới: ");
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi mới: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập chuyên ngành mới: ");
            String major = scanner.nextLine();

            studentToUpdate.setName(name);
            studentToUpdate.setAge(age);
            studentToUpdate.setMajor(major);
            System.out.println("Đã cập nhật thông tin học sinh thành công.");
        } else {
            System.out.println("Không tìm thấy học sinh với ID đã nhập.");
        }
    }

    // Tìm kiếm học sinh theo tên
    public void findStudentByName() {
        System.out.println("Nhập tên học sinh muốn tìm: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy học sinh với tên đã nhập.");
        }

    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /**
     * @return Scanner return the scanner
     */
    public Scanner getScanner() {
        return scanner;
    }

    /**
     * @param scanner the scanner to set
     */
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

}