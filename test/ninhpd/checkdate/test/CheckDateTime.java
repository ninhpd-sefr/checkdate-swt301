/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninhpd.checkdate.test;

import ninhpd.checkdate.core.CheckDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class CheckDateTime {
    
   @Test
    public void UTCID01_ReturnsTrue() {
        // input
        int day = 29;
        int month = 2;
        int year = 2000;

        // Actual
        boolean result = CheckDate.isValidDate(day, month, year);

        // Assert
        assertTrue(result);
    }
    
     @Test
    public void UTCID02_ReturnsFalse() {
        // input
        int day = 29;
        int month = 2;
        int year = 2009;

        // Act
        boolean result = CheckDate.isValidDate(day, month, year);

        // Assert
        assertFalse(result);
    }

    @Test
    public void UTCID03_ReturnsFalse() {
        // input
        int day = 31;
        int month = 2;
        int year = 2020;

        // Act
        boolean result = CheckDate.isValidDate(day, month, year);

        // Assert
        assertFalse(result);
    }

    @Test
    public void UTCID04_ReturnsTrue() {
        // input
        int day = 29;
        int month = 4;
        int year = 2000;

        // Act
        boolean result = CheckDate.isValidDate(day, month, year);

        // Assert
        assertTrue(result);
    }

    @Test
    public void UTCID05_ReturnsTrue() {
        // input
        int day = 30;
        int month = 3;
        int year = 2021;

        // Act
        boolean result = CheckDate.isValidDate(day, month, year);

        // Assert
        assertTrue(result);
    }

    @Test
    public void UTCID06_ReturnsFalse() {
        // input
        int day = 31;
        int month = 4;
        int year = 2020;

        // Act
        boolean result = CheckDate.isValidDate(day, month, year);

        // Assert
        assertFalse(result);
    }

    @Test
    public void UTCID07_ReturnsFalse() {
        // input
        int day = 29;
        int month = 2;
        int year = 2021;

        // Act
        boolean result = CheckDate.isValidDate(day, month, year);

        // Assert
        assertFalse(result);
    }

    @Test
    public void UTCID08_ReturnsFalse() {
        // input
        int day = 30;
        int month = 2;
        int year = 2026;

        // Act
        boolean result = CheckDate.isValidDate(day, month, year);

        // Assert
        assertFalse(result);
    }

    @Test
    public void UTCID09_ReturnsTrue() {
        // input
        int day = 29;
        int month = 2;
        int year = 2020;

        // Act
        boolean result = CheckDate.isValidDate(day, month, year);

        // Assert
        assertTrue(result);
    }

      int day = 31;
        int month = 3;
        int year = 2009;
  
   @Test
   public void UTCID10_ReturnTrue(){
    // Input
    int day = 31;
    int month = 3;
    int year = 2009;
    
    //Actual
    boolean result = CheckDate.isValidDate(day, month, year);

    //Assert    
       assertTrue(result);
   }

    
}
