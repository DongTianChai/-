package com.test;

import java.util.Calendar;

public class Data {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        int year =c.get(Calendar.YEAR);
        int month =c.get(Calendar.MONTH)+1;
        int data =c.get(Calendar.DATE);

        System.out.println(year+"年"+month+"月"+data);
    }
}
