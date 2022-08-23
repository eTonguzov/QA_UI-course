package factorial_recurs;

//Description:
//Написать программу расчитывающую факториал числа, использузуя метод рекурсии

public class Factorial_recurs {
    public static void main(String[] args) {
        System.out.println(factorial_recursy(5));

    }
    //Это самый простой пример того как работает рекурсия.
    //Метод factorial_recursy() принимает на вход число n. Если число больше 0 то начинает работать рекурсия
    //Принимаем число 5.
    //т.к оно больше 0 то возвращаем n*factorial(4)
    //что такое факториал 4х?
    //Это 4*(3!) и так далее, до того момента пока n не станет равен 0, а при n == 0 возвращается 1
    public static long factorial_recursy(long n){
        if (n==0){
            return 1;
        }
        return n*factorial_recursy(n-1);
    }
}
