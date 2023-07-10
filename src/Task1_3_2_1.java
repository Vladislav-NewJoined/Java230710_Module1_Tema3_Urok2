import java.util.Scanner;

public class Task1_3_2_1 {
    public static void main(String[] args) {
        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
                "из двух целых чисел\n\nРешение: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();

        int max = findMax(x, y);

        int maximum = printMax(max);
    }

    static int findMax(int a, int b) {
        int maximum;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }
        return maximum;
    }

    static int printMax(int max) {
        System.out.println("Наибольшее число: " + max);
        return max;
    }
}