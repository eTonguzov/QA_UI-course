package number_info_3;
//Description:
//Пользователь вводит двузначное число. Найти:
//а. число десятков в нем
//б. число едениц в нем
//в. сумму его цифр
//г. произведение его цифр
import java.io.*;

public class Number {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите двузначное число");
        int num = 0;
        while (true){
            try{
                String str = bufferedReader.readLine();
                num = Integer.parseInt(str);
                break;//если все норм, выходим из цикла while
            } catch (NumberFormatException exception){
                System.out.println("Вы ввели не число");
            }
        }
        int ten = num/10;
        int unit = num/1;
        int sum = (num/10)+(num%10);
        int multi = (num/10)*(num%10);
        System.out.printf("Число десятков в чсила " + num + " = " + ten +  "\n" + "Число едениц = " + unit + "\n" + "Сумма цифр = " + sum + "\n" + "Произведение цисел = " + multi);
    }
}
