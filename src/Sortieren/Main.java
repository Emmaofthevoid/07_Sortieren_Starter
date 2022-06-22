package Sortieren;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 9, 6, 4, 2, 1, 4, 56, 7, 47};

        BubbleSort sorter = new BubbleSort();
        System.out.println(Arrays.toString(numbers));
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
