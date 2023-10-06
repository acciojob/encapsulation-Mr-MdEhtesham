package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String args[])
    {
        RWOnly obj= new RWOnly();

        //name is private variable in class RWOnly, hence cannot access it
//      System.out.println(obj.name);
//      //Error: java: name has private access in com.driver.RWOnly
        obj.setName("Md Ehtesham");
        System.out.println(obj.getName());
    }
}