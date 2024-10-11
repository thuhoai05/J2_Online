/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author a3k35
 */
public class J2DAO {

    public static String calculate(int a, int b, String tacvu) {
        String ketqua;
        switch (tacvu) {
            case "TinhTong":
                ketqua = "Tổng = " + TinhTong(a, b);
                break;
            case "TinhHieu":
                ketqua = "Hiệu = " + TinhHieu(a, b);
                break;
            case "TinhTich":
                ketqua = "Tích = " + TinhTich(a, b);
                break;
            case "TinhThuong":
                ketqua = b != 0 ? "Thương = " + TinhThuong(a, b) : "Không thể chia cho 0";
                break;
            default:
                ketqua = "Lựa chọn không hợp lệ.";
        }
        return ketqua;
    }

    public static int TinhTong(int a, int b) {
        return a + b;
    }

    public static int TinhHieu(int a, int b) {
        return a - b;
    }

    public static int TinhTich(int a, int b) {
        return a * b;
    }

    public static String TinhThuong(int a, int b) {
        if (b == 0) {
            return "Không thể chia cho 0";
        }
        return String.valueOf(a / b);
    }
}

