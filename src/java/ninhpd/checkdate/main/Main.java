/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninhpd.checkdate.main;

import ninhpd.checkdate.core.CheckDate;

/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(CheckDate.isValidDate(0, 0, 0));
        System.out.println(CheckDate.getNumberOfDays( 10, 1));
    }
}
