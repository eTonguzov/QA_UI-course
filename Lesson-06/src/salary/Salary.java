package salary;
//Description:
//Имеется зарплата сотрудника - натуральное число. Реализавать функцию, которая рассчитывает премию сотрудника - вещественное чисо


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Salary {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер вашей заработной платы: ");
        int salary;
        while (true) {
            try {
                salary = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e){
                System.out.println("Это не число");

            }
        }
        String bonus = String.valueOf(bonus(salary));
        System.out.println("Ваша премия составит: " + bonus + " рублей!");
    }
    public static int bonus(int salary){
        if(salary<40000){
            return salary+(int)Math.round(salary*0.5);//округляем не целочисленное значение и приводим к типу int
        }
        else if(40000<=salary&&salary<80000){
            return salary+(int)Math.round(salary*0.7);
        }
        else return salary+(int)Math.round(salary*1.1);
    }
}
