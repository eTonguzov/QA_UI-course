package jUnit_examples;

public class Main {

    public static void main(String[] args) {

        System.out.println("<h4>-- Maximun Element jUnit_examples.Finder --</h4>");//<h4> - заголовок 4го уровня
        Finder myFinder = new Finder();
        int[] myArray = new int[] {2, 3, 42, 12, 7};//произвольный массив
        int maxElement = myFinder.findMaximumElement(myArray);

        System.out.println("The maximum element is: " + maxElement);
    }
}