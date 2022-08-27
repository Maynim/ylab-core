package ru.maynim.lecture_1.task_1;

public class Main {

    private static final int RND_GEN_MULTIPLIER = 16807;
    private static final int RND_GEN_MODULE = 2147483647;

    private static long seed = System.nanoTime();

    private static final String FORMAT = "%-3d";

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random() % 25 + 10;
            }
        }

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int sumOfAllElements = 0;

        for (int[] subArray : array) {
            for (int curElement : subArray) {
                sumOfAllElements += curElement;

                if (curElement <= minValue) {
                    minValue = curElement;
                }
                if (curElement >= maxValue) {
                    maxValue = curElement;
                }

                System.out.format(FORMAT, curElement);
            }
            System.out.println();
        }
        System.out.println();

        double avgValue = (double) sumOfAllElements / (array.length * array[0].length);

        System.out.println("Минимальный элемент: " + minValue);
        System.out.println("Максимальный элемент: " + maxValue);
        System.out.println("Среднее арифметическое всех элементов: " + avgValue);
    }

    /**
     * Генерирует и возвращает псевдослучайное число.
     * <p>
     * Для реализации использовался мультипликативный конгруэнтный метод.
     */
    public static int random() {
        seed = seed * RND_GEN_MULTIPLIER % RND_GEN_MODULE;
        return (int) seed;
    }
}
