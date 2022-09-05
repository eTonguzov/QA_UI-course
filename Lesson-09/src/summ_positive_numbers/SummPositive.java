package summ_positive_numbers;
//Вывести сумму всех положительных чисел массива

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SummPositive {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите колличесто элеметнов массива");
        int element = Integer.parseInt(br.readLine());

        System.out.println("Введите ваши чила в массив");
        int[] arr_new = array_gen(element,br);

        System.out.println(summ_positive(arr_new));
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
        for (int i: arr_new){
            if(arr_new[i-1]>0){
                summ+=arr_new[i-1];
            } else continue;
        }
        return summ;
    }
}
