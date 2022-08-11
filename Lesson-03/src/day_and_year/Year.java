package day_and_year;
import java.io.*;
import java.lang.*;
//Description:
//С некоторого момента прошло 234 дня.
//Сколько полных недель прошло за этот периуд?
//А месяцев?

public class Year {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите колличесво дней прошедших с некоторго момента");
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        int day = 0;
        while (true) {
            try {
                String str = bufferReader.readLine();
                day = Integer.parseInt(str);
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Извините, но это не число");
            }
        }
        int week = day/7;
        int month = 30;//в среднем
        System.out.println("Колличество полных недель прошедших за этот периуд: " + week);
        System.out.println("Колличество полных месяцев прошедших за этот периуд: " + month);
    }
}
