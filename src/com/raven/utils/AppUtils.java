/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author dodung
 */
public class AppUtils {
    static DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static String ConertStringToDate(String dateString){
        LocalDate date = LocalDate.parse(dateString, inputFormatter);
        String formattedDate = date.format(outputFormatter);
        return formattedDate;
    }
}
