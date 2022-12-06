package ru.netology.sqr;

public class SQRService {
    public int calculate(int min, int max) {

            int total = 0;
            for (int i = 10; i < 100; i++) {
                int amount = i * i;
                if (amount >= min & amount <= max) {
                    total = total + 1;

                }
            }
        return total;
    }
}
