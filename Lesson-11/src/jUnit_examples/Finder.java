package jUnit_examples;

public class Finder {

    public int findMaximumElement(int[] input) {

        int maxElement = input[0];//максимальный элемент массива первый[0]

        for (int i = 1; i < input.length; i++) {
            if (maxElement < input[i]) {
                maxElement = input[i];
            }
        }
        return maxElement;
    }
}
