package com.example.exam.dao;

import java.util.HashMap;
import java.util.Map;

public class DataSource {
    private static Map<String, Map<String, String>> data = new HashMap<>();

    static {
        Map<String, String> data1 = new HashMap<>();
        data1.put("password", "student");
        data1.put("role", "student");
//        data1.put("permission", "view");

        Map<String, String> data2 = new HashMap<>();
        data2.put("password", "teacher");
        data2.put("role", "teacher");
//        data2.put("permission", "view,edit");
        Map<String, String> data3 = new HashMap<>();
        data2.put("password", "admin");
        data2.put("role", "admin");

        data.put("student", data1);
        data.put("teacher", data2);
        data.put("admin", data3);
    }

    public static Map<String, Map<String, String>> getData() {
        return data;
    }
}
