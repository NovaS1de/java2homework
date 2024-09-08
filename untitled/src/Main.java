import java.util.Scanner;
public class Main {

    // Метод для изменения целого числа
    public static int modifyInteger(int n) {
        // Если число положительное, прибавляем 1, иначе возвращаем его без изменений
        if (n > 0) {
            return n + 1;
        }
        return n;
    }

    // Метод для подсчета количества положительных чисел
    public static int countPositiveNumbers(int a, int b, int c) {
        int count = 0;
        if (a > 0) count++;
        if (b > 0) count++;
        if (c > 0) count++;
        return count;
    }

    // Метод для проверки здоровья персонажа
    public static boolean isCharacterHealthy(int health) {
        return health > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Модификация числа
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();
        int modifiedNumber = modifyInteger(n);
        System.out.println("Измененное число: " + modifiedNumber);

        // 2. Подсчет положительных чисел
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        int positiveCount = countPositiveNumbers(a, b, c);
        System.out.println("Количество положительных чисел: " + positiveCount);

        // 3. Большее из двух чисел
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        int largerNumber = maxOfTwo(x, y);
        System.out.println("Большее из двух чисел: " + largerNumber);

        // 4. Проверка здоровья персонажа
        System.out.print("Введите здоровье персонажа: ");
        int health = scanner.nextInt();
        boolean isHealthy = isCharacterHealthy(health);
        System.out.println("Персонаж здоров: " + isHealthy);

        scanner.close();
    }
}