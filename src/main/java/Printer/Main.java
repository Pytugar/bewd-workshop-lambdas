package Printer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Print getallen = (int[] n) -> {
            List<Integer> gedeeld = new ArrayList<>();
            for (int num : n) {
                if (num % 2 == 0) {
                    int deelbaar = num / 2;
                    gedeeld.add(deelbaar);
                }
            }
            System.out.println(gedeeld);
        };
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        getallen.printGetal(numbers);
    }
}
