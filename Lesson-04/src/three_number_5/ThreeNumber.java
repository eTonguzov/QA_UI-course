package three_number_5;
//Description:
//Даны три вещественных числа a, b, c
//1. Выполняется ли неравенство A<B<C
//2. Выполняется ли неравенство B>A>C

import java.io.*;

public class ThreeNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        while (true) {
            try {
                System.out.println("Введите, первое число");
                String str = bufferedReader.readLine();//считываем строку
                a = Integer.parseInt(str);
                break;
            } catch (Exception exception) {
                System.out.println("Вы ввели не число, пожалуйста попробуйте снова");
            }
        }
        while (true) {
            try {
                System.out.println("Введите,второе число");
                String str = bufferedReader.readLine();//считываем строку
                b = Integer.parseInt(str);
                break;
            } catch (Exception exception) {
                System.out.println("Вы ввели не число, пожалуйста попробуйте снова");
            }
        }
        while (true) {
            try {
                System.out.println("Введите, третье число");
                String str = bufferedReader.readLine();//считываем строку
                c = Integer.parseInt(str);
                break;
            } catch (Exception exception) {
                System.out.println("Вы ввели не число, пожалуйста попробуйте снова");
            }
        }
        System.out.println((a < b) && (b < c) ? "Выполнятся неравенство A(" + a + ")<B(" + b + ")<C(" + c + ")" : (a > b) && (b > c) ? "Выполнятеся неравенство A(" + a + ")>B(" + b + ")>C(" + c + ")" : (a < b) && (b > c) ? "Выполнятеся неравенство A(" + a + ")<B(" + b + ")>C(" + c + ")" : "Цисла равны");

    }
}
