package com.patterns.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        System.out.println(db1); // create new instance
        Database db2 = Database.getInstance();
        System.out.println(db2); // return
    }
}
