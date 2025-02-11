import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        final double PI = 3.14159;

        // Создаем объект Scanner для считывания ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Вводим значения x и y
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение y: ");
        double y = scanner.nextDouble();

        // Вычисляем результат по формуле
        double result = 16 * y + PI - 5 * (x + 2 * Math.pow(x, 2) + 16 * Math.pow(x, 3));

        // Выводим результат
        System.out.println("Результат вычисления: " + result);

        // Закрываем сканер
        scanner.close();
    }
}