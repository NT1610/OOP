package com.patterns.singleton;

public class Database {
    private static Database instance;

    public Database() {
    }

    public static Database getInstance() {

        if (instance == null) {

            instance = new Database();
        }
        return instance;
    }
}
