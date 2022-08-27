package method_overload;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Reg {

    public static boolean checkDouble(String str) {
        Pattern patternDouble = Pattern.compile("[0-9]+\\.[0-9]+");
        Matcher matcherDouble = patternDouble.matcher(str);
        if (matcherDouble.matches()) {
            return true;
        } else return false;
    }



    public static boolean checkInt(String str) {
        Pattern patternDouble = Pattern.compile("\\d+");
        Matcher matcherDouble = patternDouble.matcher(str);
        if (matcherDouble.matches()) {
            return true;
        } else return false;
    }

    public static double calcPow(double base, double raise) {
        return Math.pow(base, raise);
    }

    public static int calcPow(int base, int raise) {
        if (raise != 0)
            return (base * calcPow(base, raise - 1));
        else
            return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число которое нужно возвести в степень: ");
        String str1 = sc.nextLine();
        System.out.print("Введите степень: ");
        String str2 = sc.nextLine();


        if(checkDouble(str1) && checkDouble(str2)) {
            double num1 = Double.parseDouble(str1);
            double num2 = Double.parseDouble(str2);
            System.out.printf("Число %d в степени %d равно %d",
                    num1, num2, calcPow(num1, num2));
        }

        else if (checkInt(str1) && (checkInt(str2))) {
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            System.out.printf("Число %d в степени %d равно %d",
                    num1, num2, calcPow(num1, num2));
        }
        else {
            System.out.println("Не число");
        }


    }
}
