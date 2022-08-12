package circle_and_square;
//Description:
//Даны, радиус круга и сторона квадрата. У какой фигуры площадь больше?

import java.io.*;

public class Сircle_and_Square {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите радиус круга в мм");
        double r = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Введите длинну стороны квадрата в мм");
        int a = Integer.parseInt(bufferedReader.readLine());

        double circle_s = Math.PI*Math.pow(r,2);

        double square_s = Math.pow(a,2);

        System.out.println(square_s<circle_s?"Площадь круга больше площади квадрата, и равна " + circle_s + " мм2":square_s>circle_s?"Площадь квадрата больше площади круга и равна " + square_s + " мм2":"Площади равны");
    }
}
