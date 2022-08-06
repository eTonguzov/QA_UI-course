package num_factorial;
import java.io.*;
import java.math.BigInteger;

public class NumFactorial {
    public static void main(String[] args) throws Exception{
        System.out.println("Введите число, факториал которого хотите расчитатить");
        InputStream inputStream = System.in;// Присваиваем в переменную inputStream объект класса InputStream, ссылка на который содержится в System.in.
        Reader inputStreamReader = new InputStreamReader(inputStream);//Здесь сосоздается и присваивается в переменную объект типа InputStreamReader, InputStreamReader - это переходник между байтовыми и символьными потоками,
        BufferedReader buffReader = new BufferedReader(inputStreamReader); //Здесь создается и присваивается в переменную объект типа bufferedReader, BufferReader используется как как символьный поток для ввода данных.
        //BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));//короткая запись
        int num = 0;//переменная под пользователя
        BigInteger count = BigInteger.ONE;//переменная класса BigInteger которая равна константе BigInteger.ONE = 1

        try {
            String str= buffReader.readLine();
            num = Integer.parseInt(str);
            //int count = 1;
            for(int i =1; i<=num; i++){
                count = count.multiply(BigInteger.valueOf(i));//здесь мы умножаем переменную count в каждой итерации на(i).
                // Но все мат. операции можно произвести только при помощи методов класса BigInteger. BigInteger.valueOf(i) - здес мы преобразуем переменную типа int в переменную класса BigInteger
            }
        }
        catch (NumberFormatException exception){
            System.out.println("Введите число!");
        }
        System.out.println("Факториал числа " + num + " равен " + count);

    }
}
