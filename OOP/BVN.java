
import java.util.Scanner;

public class BVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap so nguyen a: ");
            int a = sc.nextInt();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Phai nhap so nguyen");
            // TODO: handle exception
        } finally {
            sc.close();
        }
    }

}
