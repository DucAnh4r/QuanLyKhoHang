/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DucAnh;

import form.formChinh;
import java.awt.event.MouseEvent;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JTable;

/**
 *
 * @author ADMIN
 */
public class DucAnh {

    public DucAnh() {

    };
    
    
    
    //Hàm bắt sự kiện click chuột vào 1 ô trong bảng 
    public int mousePressed(MouseEvent e, JTable table) {
        //Updated to use rowAtPoint
        int rowIndex = table.rowAtPoint(e.getPoint());

        //Existing code
        if (rowIndex < 0) {
            System.out.println("No row selected");
            table.clearSelection();
            return -1;
        } else {
            System.out.println("Row " + rowIndex + " selected");
            return rowIndex;
        }
    }

    //Hàm kiểm tra ngày nhập vào
    public static boolean isValidDate(String date) {
        try {
            LocalDate inputDate = LocalDate.parse(date);
            LocalDate currentDate = LocalDate.now();
            boolean check = !inputDate.isAfter(currentDate);
            return check;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    //Hàm check chuỗi nhập vào có phải là số và có độ dài bằng n không
    public static boolean checkString(String input, int n) {
        if (input == null || input.length() != n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(input.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
    
    //Hàm check chuỗi nhập vào có phải là số dương và có độ dài bé hơn n không
    public static boolean checkString2(String input, int n) {
        if ( input == null || input.length() > n ) {
            return false;
        }
        
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i)) == false) {
                return false;
            }
        }
        
        if(Integer.parseInt(input)<=0) {
            return false;
        }
        return true;
    }
    
    //Hàm check chuỗi nhập vào có độ dài lớn hơn n không
    public static boolean checkString3(String input, int n) {
        if (input == null || input.length() > n) {
            return false;
        }
        
        return true;
    }
    
    //Hàm lấy ra ngày hiện tại
    public static String currentDate() {
        LocalDate currentDate = LocalDate.now();

        // Định dạng ngày theo chuỗi "yyyy-MM-dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Chuyển ngày thành chuỗi theo định dạng
        String dateString = currentDate.format(formatter);
        return dateString;
    }
}
