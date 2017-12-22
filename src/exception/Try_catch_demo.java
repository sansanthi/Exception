/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author san
 */
public class Try_catch_demo {
    public static void main(String[] args) {
        showDate("2014-10-10");
    }
    static void showDate(String str){
        
        try {
            DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            Date date;
            date=format.parse(str);
            System.out.println(date);
        } catch (ParseException ex) {
         System.err.println(ex.getMessage());
        }
        
}
}
