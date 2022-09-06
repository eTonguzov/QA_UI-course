package summ_positive_numbers;
//Вывести сумму всех положительных чисел массива
//Посчитать сумму элементов кратных 5

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SummPositive {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите колличесто элеметнов массива");
        int element = Integer.parseInt(br.readLine());

        System.out.println("Введите ваши чила в массив");
        int[] arr_new = array_gen(element,br);

        System.out.println("Сумма положительных чисел равна: " + summ_positive(arr_new));
        System.out.println("Сумма чисел кратных 5 равна: " + summ_aliquot5(arr_new));
        System.out.println("Последний элемент " + last_min_element(arr_new));
    }
    public static int[] array_gen(int element, BufferedReader br) throws Exception {//метод создает массив с нумным колличесвом ячеек
        int [] array = new int[element];//создаем массив из ячекек, колличество ячеек равно element
        for(int i = 0; i<array.length; i++){
            array[i] = Integer.parseInt(br.readLine());//заполняем массив
        }
        return array;
    }
    public static int summ_positive(int [] arr_new){
        int summ = 0;
        for (int i: arr_new) {
            if (i > 0) {
                summ += i;
            } else continue;
        }
        return summ;
    }
    public static int summ_aliquot5(int [] arr_new){
        int summ_aliquot5 = 0;
        for(int i: arr_new) {
            if (i % 5 == 0) {
                summ_aliquot5 += 1;
            } else continue;
        }
            return summ_aliquot5;
    }
    public static int last_min_element(int [] arr_new){
        int min = Integer.MAX_VALUE;
        for(int i: arr_new) {
            if (i < min) {
                min = i;
            } else continue;
        }
            return min;
    }
}
