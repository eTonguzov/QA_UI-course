package reverse_array;
//Вывести элементы массива в обратном порядке

import java.io.*;
import java.util.*;

public class Revers_Array {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите колличесто элеметнов массива");

        int element = Integer.parseInt(br.readLine());
        System.out.println("Введите ваши чила в массив");

        int[] arr_new = array_gen(element,br);
        System.out.println("Вы ввели массив: " + Arrays.toString(arr_new));

        int[] output_massive = revers_arr(arr_new);
        System.out.println(Arrays.toString(output_massive));


        }
    public static int[] array_gen(int element, BufferedReader br) throws Exception {//метод создает массив с нумным колличесвом ячеек
        int [] array = new int[element];//создаем массив из ячекек, колличество ячеек равно element
        for(int i = 0; i<array.length; i++){
            array[i] = Integer.parseInt(br.readLine());//заполняем массив
        }
        return array;
    }
    public static int[] revers_arr(int[] array){
            int[] reverse_arr = new int[array.length];//

            for(int y = 0; y<array.length; y++){
                for (int i = array.length-1; i>=0; i--){
                        reverse_arr[y] = array[i];
                    }
                }
        return reverse_arr;
    }

}
