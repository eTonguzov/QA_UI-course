package java_exceptions;
import java.util.*;

    public class Main {
        public static void main(String[] args) {

            int[] array = new int[10];
            Random r = new Random();

            try {
                for(int i = 0; i <= 10; i++) {
                    array[i] = r.nextInt(100);
                }
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Границ не видим!!!");
            }

            try {
                for(int i = 0; i <= array.length; i++) {
                    System.out.print(array[i] + " ");
                }
            }
            catch(ArrayIndexOutOfBoundsException ex) {
                System.out.println("Опять?!");
            }
        }
    }

