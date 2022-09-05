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
        System.out.println("Перевернутый массив выглядит так: " + Arrays.toString(output_massive));
        }
    public static int[] array_gen(int element, BufferedReader br) throws Exception {//метод создает массив с нумным колличесвом ячеек
        int [] array = new int[element];//создаем массив из ячекек, колличество ячеек равно element
        for(int i = 0; i<array.length; i++){
            array[i] = Integer.parseInt(br.readLine());//заполняем массив
        }
        return array;
    }
    public static int[] revers_arr(int[] array){
            for(int i = 0; i < array.length/2; i++){//от 0 до (допустим 6 /2 = 3)
                int temp = array[i];//временная переменная
                array[i] = array[array.length-i-1];//[0]=array[6-0-1] = 5
                array[array.length - i -1] = temp;
            }
        return array;
    }
}