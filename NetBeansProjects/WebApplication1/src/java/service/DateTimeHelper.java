/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

/**
 *
 * @author a3k35
 */
public class DateTimeHelper {

    //gói java.time
    //Calendar: là 1 lớp trong java sử dụng để \
    //thao tác với ngày, tháng, năm, thời gian 
    //còn có thể hỗ trợ để thêm, bớt hoặc lấy các thành phần của Date
    //năm, tháng, ngày, giờ, phút, giây
    //để khởi tạo đối tượng Calendar có thể sử dụng phương thức tĩnh getInstance()
    //có thể sử dụng các hằng số được định nghĩa trong Calendar để lấy thông tin
    //phương thức set() dùng để thiết lập Date
    //phương thức add() để thêm hoặc bớt 1 khoảng thời gian
    //before(), after(), compareTo() dùng để so sánh 2 đối tượng Calendar
    //để định dạng 1 đối tượng Calendar thành String thông qua lớp SimpleDateFormat
    //để thiết lập múi giờ cho Calendar sử dụng lớp TimeZone
    public static void main(String[] args) {
        Calendar cld = Calendar.getInstance();
//        //lấy thời gian cụ thể hiện tại của Calendar
//        System.out.println(cld.getTime());
//        cld.set(cld.YEAR,2019);
//        //year-month-day
//        //2 lưu ý khi set MONTH
//        //Sử dụng calendar.MONTH
//        //tháng sẽ bắt đầu từ 0-11
//        //+1
//        cld.set(cld.MONTH, cld.SEPTEMBER);
//        System.out.println(cld.MONTH);
//        System.out.println(cld.getTime());
//khi mà mn cho ng dùng truyền date vào trong web -> auto truyền vào Servlet 
//dưới dạng String. và mn sẽ phải parse về dạng Date
//        String date = "23/06/2022";
//        String format = "yyyy-MM-dd";
//        format = "MM-yyyy-dd";
        SimpleDateFormat sdf = new SimpleDateFormat("MM//yyyy//dd HH:mm:ss");
        System.out.println("ngày giờ hiện tại: " + sdf.format(cld.getTime()));
        //thêm 10 ngày vào ngày hiện tại
        cld.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Ngay gio hien tai: " + sdf.format(cld.getTime()));
        Calendar cld2 = Calendar.getInstance();
        cld2.set(Calendar.YEAR, 2022);
        //11/10/2022 truoc 11/10/2024
        //before trả về true nếu cld xảy ra trước cld2
        if (cld.before(cld2)) {
            System.out.println("Ngay 11/10/2022 khong truoc ngay 11/10/2024");
        } else {
            System.out.println("Ngay 11/10/2022 truoc ngay 11/10/2024");
        }

//        Date a = toDate(date, format);
//        System.out.println(a);
        //java.util.Date: biểu thị thời gian chung trong Java, phù hợp cho các
        //tác vụ xử lý thời gian không sử dụng database
        //nó lưu trữ cả ngày và thời gian
        //Date: Ngày/tháng/năm
        //Time: giờ/phút/giây
        //java.sql.Date: được thiết kế để làm việc với SQL(database)
        //chỉ lưu Date, không lưu time
        //Time mặc định: 00:00:00
        //LocalDate: đại diện cho 1 Date(ngày-tháng-năm) mà không có Time
        //LocalTime: đại diện cho 1 Time(giờ-phút-giây) mà không có Date
        //ZoneDateTime: đại diện cho DateTime có múi giờ
        //Instant: đại diện cho 1 điểm thời gian(timestemp) trong hệ thống Unix thời gian
        //(epoch)
        //Duration: Đo khoảng thời gian theo giờ phút giây
        //Period: đo khoảng thời gian theo ngày tháng năm
        //DateTimeFormatter: định dạng ngày và giờ thành chuỗi và ngược lại 
        //khởi tạo LocalTime
        LocalTime startTime = LocalTime.of(10, 30, 0);// 10:30 AM
        LocalTime endTime = LocalTime.of(12, 45, 30);//12:45:30 AM
        //Tính toán Duration giữa 2 thời gian
        Duration dr = Duration.between(startTime, endTime);
        //Hiển thị khoảng thời gian
        System.out.println(dr);
        //lấy giờ, phút, giây từ Duration
        long hour = dr.toHours();
        long minute = dr.toMinutes() % 60;
        long second = dr.toSecondsPart();
        System.out.println(minute);
        System.out.println(second);

        DateTimeFormatter dtt = DateTimeFormatter.ofPattern("MM/yyyy//dd HH:mm:ss");

        LocalDate ld = LocalDate.of(2024, 12, 25);//25/12/2024
        LocalTime lt = LocalTime.of(21, 45, 0);//21:45:00 PM

        LocalDateTime ldt = LocalDateTime.of(ld, lt);

        String dateTimeFormat = ldt.format(dtt);
        System.out.println(dateTimeFormat);

        //so sánh
        LocalDateTime ldt2 = LocalDateTime.of(ld, startTime);
        if (ldt.isBefore(ldt2)) {
            System.out.println("9 giờ 45 phút tối xảy ra trước 10 giờ 30 phút sáng");
        } else {
            System.out.println("9 giờ 45 phút tối xảy ra sau 10 giờ 30 phút sáng");
        }
        int a = Calendar.DAY_OF_WEEK;
        int c = Calendar.MONTH;
        System.out.println(a);
        System.out.println(c);
        
            String b = getDayNameofWeek(a);
            System.out.println(b);
       
    }

    public static String getDayNameofWeek(java.sql.Date a) {
//        return new SimpleDateFormat(format).parse(date));
        Calendar calendar = Calendar.getInstance();
         calendar.setTime(a);
        int dayOfweek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfweek-2) {
            case 1:
                return "Thu Hai";
            case 2:
                return "Thu Ba";
            case 3:
                return "Thu Tu";
            case 4:
                return "Thu Nam";
            case 5:
                return "Thu Sau";
            case 6:
                return "Thu Bay";
            case 7:
                return "Chu nhat";
        }
        return "Loi lay thu ";
    }

    private static String getDayNameofWeek(int a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
