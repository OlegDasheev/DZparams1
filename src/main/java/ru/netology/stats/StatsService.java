package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public long averageSum(long[] purchases) {
        long sum = calculateSum(purchases);
        return sum / 12;
    }

    public long findMax(long[] purchases) {
        long currentMaxMonth = 1;
        long currentMax = purchases[0];
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] >= currentMax) {
                currentMax = purchases[i];
                currentMaxMonth = i + 1;
            }
        }
        return currentMaxMonth;
    }

    public long findMin(long[] purchases) {
        long currentMinMonth = 1;
        long currentMin = purchases[0];
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] <= currentMin) {
                currentMin = purchases[i];
                currentMinMonth = i + 1;
            }
        }
        return currentMinMonth;
    }

    public long monthsBelowAverageSum(long[] purchases) {
        long currentBelowAvarage = 0;
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        for (long perchase : purchases) {
            if (perchase < averageSum(purchases)) {
                currentBelowAvarage += 1;
            }
        }
        return currentBelowAvarage;
    }

    public long monthsAboveAverageSum(long[] purchases) {
        long currentAboveAvarage = 0;
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        for (long perchase : purchases) {
            if (perchase > averageSum(purchases)) {
                currentAboveAvarage += 1;
            }
        }
        return currentAboveAvarage;
    }
}