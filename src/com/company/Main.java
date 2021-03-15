package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Чогори", "8611 м");
        hashMap.put("Казбек", "8033 м");
        hashMap.put("Дыхтаю", "5205 м");
        hashMap.put("Коштан-Тау", "5151 м");
        hashMap.put("Шхара", "5193 м");
        hashMap.put("Аконкагуа", "6962 м");

        String[] keySet1 = hashMap.keySet().toArray(new String[0]);
        System.out.println("Ключи ассиациативного массива:");
        for (int i = 0; i < keySet1.length; i++) {
            System.out.print(keySet1[i] + ", ");
        }
        System.out.println("\n");

        System.out.println("Значения ассициативного массива:");
        for (int i = 0; i < hashMap.size(); i++) {
            System.out.print(hashMap.get(keySet1[i]) + ", ");
        }
        System.out.println("\n");

        System.out.println("Ключи и значения ассициативного массива:");
        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(keySet1[i] + " : " + hashMap.get(keySet1[i]));
        }
        System.out.println();

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Чогори", "8611 м");
        treeMap.put("Казбек", "8033 м");
        treeMap.put("Дыхтаю", "5205 м");
        treeMap.put("Коштан-Тау", "5151 м");
        treeMap.put("Шхара", "5193 м");
        treeMap.put("Аконкагуа", "6962 м");

        String[] keySet2 = treeMap.keySet().toArray(new String[0]);
        System.out.println("Ключи и значения дерва:");
        for (int i = 0; i < treeMap.size(); i++) {
            System.out.println(keySet2[i] + " : " + treeMap.get(keySet2[i]));
        }
        System.out.println();

        System.out.println(treeMap.subMap("Е", "П"));
    }
}
