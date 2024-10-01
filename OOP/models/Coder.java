package OOP.models;

public class Coder extends Person {
    // quan hệ Has - A
    // object Student: name - age - sdt

    // object Class
    private String Programming_Language;
    private ArrayList<Person> listStudent; // Aggregation: 1 đối tượng sẽ chứa 1 danh sách các đối tượng khác
    // Khi đối tượng chứa bị hủy, thì đối tượng nằm trong không bị làm sao
    // -> Aggregation không phải là 1 quan hệ chặt chẽ
    private String Programming_Language;
    private Person student; // Composition: 1 đối tượng chứa 1 đối tượng khác
    // Khi đối tượng chứa bị hủy, thì đối tượng nằm trong như nó như 1 thuôc tính
    // cũng sẽ bị hủy theo -> là 1 quan hệ rất chặt chẽ

    public Coder() {
    }

    public Coder(String Programming_Language, String name, int age, String phone) {
        super(name, age, phone);
        this.Programming_Language = Programming_Language;
    }

    /**
     * @return String return the Programming_Language
     */
    public String getProgramming_Language() {
        return Programming_Language;
    }

    /**
     * @param Programming_Language the Programming_Language to set
     */
    public void setProgramming_Language(String Programming_Language) {
        this.Programming_Language = Programming_Language;
    }

    public String toString(String name, int age, String phone) {
        return ("Ten nguoi: " + name + ""
                + "\nTuoi" + age
                + "\nSDT: " + phone);
    }
}
