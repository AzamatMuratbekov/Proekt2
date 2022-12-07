package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Manager {
    public static void manager() throws MyException {
        Map<Integer, String> map = new HashMap<>();
        map.put(1234, "Admin");
        map.put(111, "aza");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String user = sc.nextLine();
        System.out.println("Введите пароль:");
        Integer parol = sc.nextInt();
        for (
                Integer a : map.keySet()
        ) {
            if (map.containsValue(user) && map.containsKey(parol)) {
            } else throw new MyException("Не правильное имя пользователя или пароль");
        }
    }
}