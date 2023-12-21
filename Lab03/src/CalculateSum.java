public class CalculateSum {
    public static void main(String[] args) {
        // Дійсне x від 0,5 до 1,4 з кроком 0,1
        for (double x = 0.5; x < 1.5; x += 0.1) {
            // Обчислення суми
            double sumL = calcSum(x);

            // Виведення результату
            System.out.printf("Для x = %.1f, сума = %.5f%n", x, sumL);
        }
    }

    // Метод для обчислення суми
    private static double calcSum(double x) {
        double sumL = 0.0;

        // Цикл для обчислення кожного члена послідовності
        for (int n = 0; n <= 10; n++) {
            sumL += Math.pow(x, n) / factorial(n); //Match.pow для збільшення по степеню
        }

        return sumL;
    }

    // Метод для обчислення факторіалу
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
