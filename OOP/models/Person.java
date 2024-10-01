package OOP.models;

public class Person {
    // access modifiers: Từ khóa chỉ mức độ truy cập của 1 class, phương thức, biến
    // public:không bị giới hạn truy cập, truy cập từ bất cứ đâu
    // private: chỉ được sử dụng trong class chứa biến, chứa phương thức đó
    // protected: chỉ được sử dụng trong package hoặc class con của nó
    // default: chỉ được sử dụng trong package
    // OOP có 4 thuộc tính:
    // kế thừa :
    // đóng gói
    // đa hình
    // trừu tượng
    // non access modifiers;
    private String name;
    private int age;
    private String phone;

    public Person() {
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    /**
     * @return String return the name
     */
    public String getName() { // dùng để gọi dữ liệu của thuộc tính
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) { // thêm mới - sửa đổi dữ liệu thuộc tính
        this.name = name;
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
        if (age < 18) {
            System.out.println("phai nhap tren 18 tuoi");
        } else {
            this.age = age;
        }
    }

    /**
     * @return String return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
