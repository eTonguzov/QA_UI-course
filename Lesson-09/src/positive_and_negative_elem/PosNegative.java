package positive_and_negative_elem;

import java.io.*;
import java.util.*;

public class PosNegative {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите колличесто элеметнов массива");

        int element = Integer.parseInt(br.readLine());
        System.out.println("Введите ваши чила в массив");

        int[] arr_new = array_gen(element, br);
        System.out.println("Вы ввели массив: " + Arrays.toString(arr_new));

        System.out.println("Положительные числа массива" + sortPositive(arr_new));
        System.out.println("Отрицательные числа массива" + sortNegative(arr_new));

    }

    public static int[] array_gen(int element, BufferedReader br) throws Exception {//метод создает массив с нумным колличесвом ячеек
        int[] array = new int[element];//создаем массив из ячекек, колличество ячеек равно element
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());//заполняем массив
        }
        return array;
    }

    public static String sortPositive(int[] arr_new) {
        String positive = "";
        for (int elem : arr_new) {
                if (elem >= 0) {
                    positive += " " + (String.valueOf(elem));
                    continue;
                }
        }
            return positive;
    }
    public static String sortNegative(int[] arr_new) {
        String negative = "";
        for (int elem : arr_new) {
            if (elem <= 0) {
                negative += " " + (String.valueOf(elem));
                continue;
            }
        }
        return negative;
    }
}
