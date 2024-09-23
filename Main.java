import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Запрос высоты треугольника у пользователя
        System.out.print("Введите высоту треугольника: ");
        int height = scanner.nextInt();
        
        // Внешний цикл для строк
        for (int i = 1; i <= height; i++) {
            // Внутренний цикл для пробелов
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" "); // Печатаем пробелы
            }
            // Внутренний цикл для звездочек
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Печатаем звездочки
            }
            // Переход на новую строку после каждой строки треугольника
            System.out.println();
        }
        
        scanner.close();
    }
}
