//BTVN: Tạo 1 lớp student có các thuộc tính: int id, str name, int tuổi, str chuyên ngành
//chú ý id phải là duy nhất 
//thêm thuộc tính của lớp student có thể để là private static int count; -> biến tĩnh
//Trong constructor khi khởi tạo id: count++ 
//tạo lớp StudentManager bao gồm các Student
//tạo menu switch/case gồm các tác vụ: 
//1. xem danh sách học sinh
//2. thêm
//3. xóa
//4. sửa -> cho người dùng nhập id: rồi sửa các thuộc tính k sửa id
//5. tìm theo tên
//6. thoát
public class Student {
    private String name;
    private int ID;
    private int age;
    private String major;
    private static int count = 1;

    public Student() {
        count++;
    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.ID = count++;
        this.major = major;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return String return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    public String toString(String name, int age, String major, int ID) {
        return ("Ten nguoi: " + name + ""
                + "\nTuoi: " + age
                + "\nChuyen nganh: " + major
                + "\nMasinhvien: " + ID);
    }
}