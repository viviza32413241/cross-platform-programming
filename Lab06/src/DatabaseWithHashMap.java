import java.util.HashMap;

public class DatabaseWithHashMap {
    public static void main(String[] args) {
        HashMap<String, Student> studentDatabase = new HashMap<>();

        // Додавання студентів до бази даних
        studentDatabase.put("Doe", new Student("John", "Doe", 20, 2, 75.5));
        studentDatabase.put("Smith", new Student("Jane", "Smith", 22, 3, 82.0));
        studentDatabase.put("Johnson", new Student("Bob", "Johnson", 21, 2, 68.3));

        // Виведення бази даних
        System.out.println("Student Database:");
        for (Student student : studentDatabase.values()) {
            System.out.println(student);
        }

        // Додавання нового студента
        studentDatabase.put("Williams", new Student("Alice", "Williams", 19, 1, 90.2));

        // Виведення бази даних після додавання нового студента
        System.out.println("\nStudent Database after adding a new student:");
        for (Student student : studentDatabase.values()) {
            System.out.println(student);
        }

        studentDatabase.size();
    }
}
