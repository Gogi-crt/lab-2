import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Запрос высоты треугольника у пользователя
        int height;
        while (true) {
            System.out.print("Введите высоту треугольника (положительное число): ");
            height = scanner.nextInt();
            if (height > 0) {
                break; // Выход из цикла, если введено корректное значение
            }
            System.out.println("Пожалуйста, введите положительное число.");
        }
        
        // Запрос символа для рисования треугольника
        System.out.print("Введите символ для рисования треугольника: ");
        char symbol = scanner.next().charAt(0);
        
        // Внешний цикл для строк
        for (int i = 1; i <= height; i++) {
            // Внутренний цикл для пробелов
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" "); // Печатаем пробелы
            }
            // Внутренний цикл для заданного символа
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(symbol); // Печатаем заданный символ
            }
            // Переход на новую строку после каждой строки треугольника
            System.out.println();
        }
        
        scanner.close();
    }
}

