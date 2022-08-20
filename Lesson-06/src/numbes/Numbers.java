package numbes;//Description:
//Написать метод который принимает на вход натуральное число
//и возвращает true если число четное.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Numbers {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while (true) {
            try {
                n = Integer.parseInt(bufferedReader.readLine());
                break;
            } catch (Exception exception) {
                System.out.println("Это не число");
            }
        }
        System.out.println(odd_or_even(n));
    }
    public static boolean odd_or_even(int n) {
        if (n % 2 == 0) {
            return true;
        } else return false;
    }
}
