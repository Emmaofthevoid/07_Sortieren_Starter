package Sortieren;

public class BubbleSort {

    public void sort(int[] numbers) {
        //Äußere schleife
        for (int n = numbers.length - 1; n > 0; n--) {
            // Innere Schleife
            for (int i = 0; i < n; i++) {
                if (numbers[i] > numbers[i+1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }
}
