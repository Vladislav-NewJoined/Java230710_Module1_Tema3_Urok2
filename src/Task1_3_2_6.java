import java.util.Scanner;

public class Task1_3_2_6 {
    public static void main(String[] args) {
        System.out.println("Задание: \n6.  Напишите метод, который возвращает входящую строку, " +
                "делая ее ЗаБоРчИкОм\n\nРешение: ");

        getConvertedString();
        System.out.println();
    }

    static void getConvertedString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку (например 'Структура фвйлов'): ");
        String inputStr = scanner.nextLine();
        char chars[] = inputStr.toCharArray();
        int size = chars.length;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        System.out.print("Преобразованная строка: ");
        for (int i = 0; i < size; i++) {
            System.out.print(chars[i]);
        }
        return;
    }
}