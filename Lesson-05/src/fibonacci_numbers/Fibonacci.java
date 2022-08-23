package fibonacci_numbers;
//Description:
//Образуется посл-ть чисел Фибонначи (1, 1, 2, 3, 5, 8...)
//Дано натуральное число n.
//1. Найти k-й член последовательности Фибонначи
//2. Получить первые n членов последовательноти Фибоннначи
//3. Верно ли, что сумма превых n чисел посл-ти Фиббоначи есть четное число?
import java.io.*;
import java.math.*;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите колличество чисел Фиббоначи которые вы хотите сгенерировать");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (true) {
            try {
                n = Integer.parseInt(bufferedReader.readLine());//Ввод колличества чисел которые хотим сгенерировать
                break;
            } catch (Exception e) {
                System.out.println("Это или не целое число, или вообще не число");
            }
        }
        System.out.println(generation_fib(n));//Вызываем метод generation, в которой передаем число n, печатем результат(какойто масссив)
        ArrayList<BigInteger> arr_new = generation_fib(n);//Добавляем в новй массив arr_new значения из метода Generation

        System.out.println("Ведите, порядковый номер элемента(от 1 до ∞, который хотите получить: ");
        while (true) {//цикл на ввод числа(получение n -го элемента
            try {
                System.out.println(element(Integer.parseInt(bufferedReader.readLine()), arr_new));//передаем методу, ввод числа и массив Arr_new
                break;
            } catch (Exception e) {
                System.out.println("Это или не целое число, или вообще не число");
            }
        }
        System.out.println("Введите порядковый номер первых n чисел, сумму которых хотите получить: ");
        BigInteger summa = BigInteger.ZERO;//0
        while (true) {//проверка на ввод числа, (порядковый номер)
            try {
                System.out.println(summa(Integer.parseInt(bufferedReader.readLine()), arr_new, summa));
                break;
            } catch (Exception e) {//десь я обрабатываю все ошибки в одной куче
                System.out.println("Это или не целое число, или вообще не число");
            }
        }
        System.out.println("Введите порядковый номер последнего элемента, последовательность которых хотите получить");
        int z = 0;
        while(true){
            try {
                z = Integer.parseInt(bufferedReader.readLine());
                break;
            }catch (Exception e){
                System.out.println("Это или не целое число, или вообще не число");
            }
        }
        ArrayList <BigInteger> y = generation_fib(n);//присваиваем в переменную у сгенерированный массив,(из метода)
        porydok(z, y);//передаем на вход z и наш новый массив
    }
    public static ArrayList<BigInteger> generation_fib(int n){
        ArrayList<BigInteger> arr = new ArrayList<>();//создаем неограниченный массив
        arr.add(0, BigInteger.ZERO);//0
        arr.add(1, BigInteger.ONE);//1

        for (int i = 2; i <= (n - 1); i++) {
            arr.add(arr.get(i - 2).add(arr.get(i - 1)));
        }
        return arr;
    }
    public static BigInteger element(int k, ArrayList<BigInteger> arr) {
        return arr.get(k - 1);
    }
    public static String summa(int sum, ArrayList<BigInteger> arr, BigInteger summa) {
        for (int i = 0; i < sum; i++) {
            summa = summa.add(arr.get(i));
        }
        BigInteger a = summa.mod(BigInteger.TWO);
        a.intValue();
        if( a.intValue()==0){
            return  "Сумма первых " + sum + " элементов, пос-ти чисел Фибонначи равна: "  + summa + " и да, она четная";
        }
        else return "Сумма первых " + sum + " элементов, пос-ти чисел Фибонначи равна: "  + summa + " и да, она не четная";

    }
    public static ArrayList<BigInteger> porydok(int z, ArrayList<BigInteger> y) {
        for (int i = 0; i <= (z - 1); i++) {
            System.out.print(y.get(i) + " ");
        }
        return y;
    }
}