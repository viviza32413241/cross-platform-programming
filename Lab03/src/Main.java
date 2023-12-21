public class Main {
    public static void main(String[] args) {
        int n = 4;
        double[] x = {5.0, 7.0, 20.0, 10.0, 8.0, 15.0, 12.0, 9.0, 4.0, 21.0, 18.0, 25.0, 13.0};

        if (n >= 1 && 3 * n <= x.length) {
            double sum = 0.0;
            int startIndex = 2 * n - n;
            double maxFirstThird = x[0];


            for (int i = 1; i < n; i++) {
                if (x[i] > maxFirstThird) {
                    maxFirstThird = x[i];
                }
            }

            for (int i = startIndex; i < x.length; i++) {
                if (x[i] > maxFirstThird) {
                    sum += x[i];
                }
                System.out.println("Кількість разів циклу: " + i);
            }

            System.out.println("Сума елементів другої третини масиву, які перевершують максимальний елемент першої третини: " + sum);
        } else {
            System.out.println("Помилка: некоректне значення n або розмір масиву x.");
        }
    }
}
