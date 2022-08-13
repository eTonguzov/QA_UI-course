package number_info;

//Description:
//Дано двузначное число. Определить:
//1. Является ли сумма его цифр двузначным числом
//2. Больше ли самого числа сумма двух цифр

import java.io.*;

public class Number {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите, двузначное число:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num, summ, ost;//заранее объявляем переменные что бы потом были видны
        while (true) {
            try {
                num = Integer.parseInt(bufferedReader.readLine());
                if ((num < 99) && num > (9) || ((num > (-99) )&& num < (-9))){
                    break;
                } else System.out.println("Вы ввели не двухзначное число");
            } catch (Exception exception) {
                System.out.println("Это не число");
            }
        }
        if (num > 0) {
            ost = num % 10;
            summ = ((num - ost) / 10) + ost;
            System.out.println(summ > 9 ? "Сумма чисел " + num + " двузначна и равна " + summ : summ < 9 ? "Сумма чисел " + num + " однозначна и равна" + summ : "сумма чисел равна числу");
        } else {
            ost = num % 10;
            summ = ((Math.abs(num) - Math.abs(ost)) / 10) + Math.abs(ost);
            System.out.println(summ > 9 ? "Сумма чисел " + num + " двузначна и равна " + summ + " по модулю" : summ < 9 ? "Сумма чисел " + num + " однозначна и равна " + summ + " по модулю" : "сумма чисел равна числу");
        }
    }
}