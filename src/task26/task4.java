package task26;

import java.util.HashMap;

public class task4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "alex");
        map.put("surname", "nick");
        map.put("age", "19");
        System.out.println(map.get("name"));
        System.out.println(map.get("surname"));
        System.out.println(map.get("age"));
    }
}

