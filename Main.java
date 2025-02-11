import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    // Создаем объект Scanner для считывания ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    // Вводим значение диагонали
        System.out.print("Введите длину диагонали квадрата: ");
    double diagonal = scanner.nextDouble();

    // Вычисляем площадь квадрата по формуле
    double ploshad = Math.pow(diagonal, 2) / 2;

    // Выводим результат
        System.out.println("Площадь квадрата с диагональю " + diagonal + " равна: " + ploshad);

    // Закрываем сканер
        scanner.close();
}

}