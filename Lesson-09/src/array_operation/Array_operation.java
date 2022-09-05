package array_operation;

import java.io.*;
import java.util.*;
//определить:
//1. cумму всех элементов массива
//2. произведение всех элементов массива
//3. Сумму кавадратов всех элементов массива
//4. Сумму превых 6 элементов массива
public class Array_operation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите колличесто элеметнов массива");
        int element = Integer.parseInt(br.readLine());

        System.out.println("Введите ваши чила в массив");
        int[] arr_new = array_gen(element,br);
        System.out.println("Вы ввели массив: " + Arrays.toString(arr_new));
        System.out.println("Сумма элементов массива равна: " + summa(arr_new));
        System.out.println("Произведение элементов массива равно: " +  multiple(arr_new));
        System.out.println("Сумма квадратов всех элементов массива равно: " + pow(arr_new));
        System.out.println("Сумма превых 6 элементов массива " + sum_first_six(arr_new));

    }
    public static int[] array_gen(int element, BufferedReader br) throws Exception {//метод создает массив с нумным колличесвом ячеек
        int [] array = new int[element];//создаем массив из ячекек, колличество ячеек равно element
        for(int i = 0; i<array.length; i++){
            array[i] = Integer.parseInt(br.readLine());//заполняем массив
        }
        return array;
    }
    public static int summa(int[] array){
        int summ = 0;
        for(int i: array){
            summ+=array[i-1];
        }
        return summ;
    }
    public static int multiple(int[] array){
        int mult = 1;
        for(int i: array){
            mult*=array[i-1];
        }
    return mult;
    }
    public static int pow(int[] array){
        int pow_summa = 0;
        for(int i: array){
            pow_summa+=Math.pow(array[i-1],2);
        }
        return pow_summa;
    }
    public static int sum_first_six(int[] array){
        int summ = 0;
        int count = 0;
        for (int i: array) {
            summ+=array[i - 1];
            count++;
            if (count >= 6) {
                break;
            }
        }
        return summ;
    }

}
