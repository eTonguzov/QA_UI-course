package two_number;
//Description
//Даны два числа. Если квадратный корень второго числа, меньше первого,
//то увеличить первое число в 5 раз.

import java.io.*;

public class T_number {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num_1, num_2;
        while (true) {
            try {
                System.out.println("Введите первое число");
                num_1 = Integer.parseInt(bufferedReader.readLine());
                break;
            } catch (Exception exception) {
                System.out.println("Вы ввели не число");
            }
        }
            while (true) {
                try {
                    System.out.println("Введите второе число");
                    num_2 = Integer.parseInt(bufferedReader.readLine());
                    break;
                } catch (Exception exception) {
                    System.out.println("Вы ввели не число");
                }
            }
            if((Math.pow(num_2,2))<num_1){
                num_1*=5;
            }
        System.out.println("Первое число " + num_1 + " Второе число " +  num_2);
        }
    }
