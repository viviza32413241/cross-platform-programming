import java.util.LinkedList;

public class DatabaseWithLinkedList {
    public static void main(String[] args) {
        LinkedList<Student> studentDatabase = new LinkedList<>();

        // Додавання студентів до бази даних
        studentDatabase.add(new Student("John", "Doe", 20, 2, 75.5));
        studentDatabase.add(new Student("Jane", "Smith", 22, 3, 82.0));
        studentDatabase.add(new Student("Bob", "Johnson", 21, 2, 68.3));

        // Виведення бази даних
        System.out.println("Student Database:");
        for (Student student : studentDatabase) {
            System.out.println(student);
        }

        // Додавання нового студента в початок списку
        studentDatabase.addFirst(new Student("Alice", "Williams", 19, 1, 90.2));

        // Виведення бази даних після додавання нового студента
        System.out.println("\nStudent Database after adding a new student at the beginning:");
        for (Student student : studentDatabase) {
            System.out.println(student);
        }

        studentDatabase.removeFirst();
    }
}
