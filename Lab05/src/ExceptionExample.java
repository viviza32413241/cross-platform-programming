import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            String userInput = getUserInput();
            processInput(userInput);
        } catch (InvalidInputException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    private static String getUserInput() throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок без символа '@': ");
        String input = scanner.nextLine();

        if (input.contains("@")) {
            throw new InvalidInputException("Рядок містить заборонений символ '@'.");
        }

        return input;
    }

    private static void processInput(String input) {
        System.out.println("Ваш введений рядок: " + input);
        // Інші дії з обробки введеного рядка
    }
}
