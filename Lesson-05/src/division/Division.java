package division;
//Description:
//Найти максимальное из натуральных чисел, не превышаюших 5000 которое нацело делится на 39.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.Collection;


public class Division {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();//Создаем неограниченный список ArrayList
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        int n;
        while (true) {
            try {
                n = Integer.parseInt(bufferedReader.readLine());
                break;
            } catch (Exception exception) {
                System.out.println("Это не число");
            }
        }
        for (int i = 0; i <= n; i++) {
            if ((i % 39) == 0) {
                list.add(i);
            }
        }
        System.out.println(Collections.max(list));
    }
}
