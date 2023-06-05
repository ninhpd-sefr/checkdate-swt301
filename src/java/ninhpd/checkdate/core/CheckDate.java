/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninhpd.checkdate.core;

import java.time.LocalDate;
import java.time.YearMonth;

/**
 *
 * @author ACER
 */
public class CheckDate {
     public static boolean isValidDate(int day, int month, int year) {
        // Your validation logic here
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
     
      public static int getNumberOfDays(int year, int month){
        YearMonth yearMonth = YearMonth.of(year, month);
        return yearMonth.lengthOfMonth();
    }
}
