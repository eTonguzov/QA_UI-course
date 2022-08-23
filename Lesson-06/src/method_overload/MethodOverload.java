package method_overload;
//Реализовать функцию, которая принимает на вход два числа n и m и возвращает n^m.
//Реализовать перегрузку для разных типов данных.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MethodOverload {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        double n_double = Double.parseDouble(br.readLine());
        double m_double = Double.parseDouble(br.readLine());
        overload(n,m);
        overload(n_double,m_double);

    }
    public static int overload(){
        return Math.pow(();

    }
    public static double overload(double a){

    }
}
