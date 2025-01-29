package week2;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> bills = new HashMap<>();
        bills.put("Allen", 17);
        bills.put("Cook",4);
        System.out.println(bills.get("Allen"));
        for (String key : bills.keySet()) {
            System.out.println(key);
        }
        bills.put("Shakir",10);
        for (Integer value : bills.values()) {
            System.out.println(value);
        }
    }
}
