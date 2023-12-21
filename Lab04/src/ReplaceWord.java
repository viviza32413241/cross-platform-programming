public class ReplaceWord {
    public static void main(String[] args) {
        // Оригінальний рядок
        String line = "This is a small string";

        // Заміна слова "small" на "very large"
        String newLine = line.replace("small", "very large");

        // Виведення результату
        System.out.println("Оригінальний рядок: " + line);
        System.out.println("Новий рядок: " + newLine);
    }
}
