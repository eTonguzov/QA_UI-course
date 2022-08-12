package number_info;

//Description:
//Дано двузначное число. Определить:
//1. Является ли сумма его цифр двузначным числом
//2. Больше ли самого числа сумма двух цифр


import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception exception){
            System.out.println("Это не число");
        }

    }
}
