/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninhpd.checkdate.test;

import static ninhpd.checkdate.core.CheckDate.getNumberOfDays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class CheckDayInMonth {

    @Test
    public void UTCID01() {
        // Arrange
        int year = 200;
        int month = 1;
        int expectedNumberOfDays = 31;

        // Act
        int actualNumberOfDays = getNumberOfDays(year, month);

        // Assert
        assertEquals(expectedNumberOfDays, actualNumberOfDays);
    }

    @Test
    public void UTCID02() {
        // Arrange
        int year = 2021;
        int month = 2;
        int expectedNumberOfDays = 28;

        // Act
        int actualNumberOfDays = getNumberOfDays(year, month);

        // Assert
        assertEquals(expectedNumberOfDays, actualNumberOfDays);
    }

    @Test
    public void UTCID03() {
        // Arrange
        int year = 2019;
        int month = 2;
        int expectedNumberOfDays = 28;

        // Act
        int actualNumberOfDays = getNumberOfDays(year, month);

        // Assert
        assertEquals(expectedNumberOfDays, actualNumberOfDays);
    }

    @Test
    public void UTCID04() {
        // Arrange
        int year = 2020;
        int month = 1;
        int expectedNumberOfDays = 31;

        // Act
        int actualNumberOfDays = getNumberOfDays(year, month);

        // Assert
        assertEquals(expectedNumberOfDays, actualNumberOfDays);
    }

    @Test
    public void UTCID05() {
        //Setup
        int year = 2017;
        int month = 2;
        int expectedNumberOfDays = 28;

//        Actual
        int actualNumberOfDays = getNumberOfDays(year, month);

//        Assert
        assertEquals(expectedNumberOfDays, actualNumberOfDays);
    }

    @Test
    public void UTCID06() {
//        Setup
        int year = 2003;
        int month = 1;
        int expectedNumberOfDays = 31;

//        Actual
        int actualNumberOfDays = getNumberOfDays(year, month);

//        Assert
        assertEquals(expectedNumberOfDays, actualNumberOfDays);
    }

    @Test
    public void UTCID07() {
//        Setup
        int year = 2020;
        int month = 1;
        int expectedNumberOfDays = 31;

//        Actual
        int actualNumberOfDays = getNumberOfDays(year, month);

//        Assert
        assertEquals(expectedNumberOfDays, actualNumberOfDays);
    }

    @Test
    public void UTCID08() {
//       Setup
        int year = 2019;
        int month = 2;
        int expectedNumberOfDays = 28;

//        Actual
        int actualNumberOfDays = getNumberOfDays(year, month);

//        Assert
        assertEquals(expectedNumberOfDays, actualNumberOfDays);
    }

    @Test
    public void UTCID09() {
//        Setup
        int year = 10;
        int month = 1;
        int expectedNumberOfDays = 31;

//        Actual
        int actualNumberOfDays = getNumberOfDays(year, month);

//         Assert
        assertEquals(expectedNumberOfDays, actualNumberOfDays);
    }

    @Test
    public void UTCID10() {
//        Setup
        int year = 2018;
        int month = 1;
        int expectedNumberOfDays = 31;
//      Actual
        int actualNumberOfDays = getNumberOfDays(year, month);

//        Assert
        assertEquals(expectedNumberOfDays, actualNumberOfDays);
    }

}
