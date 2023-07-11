import java.util.Scanner;

public class Task1_3_2_5 {
    public static void main(String[] args) {
        System.out.println("Задание : \n3.\tНапишите метод, который возвращает самую длинную из пяти строк" +
                "\n\nРешение: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String s1 = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String s2 = scanner.nextLine();
        System.out.print("Введите третью строку: ");
        String s3 = scanner.nextLine();
        System.out.print("Введите четвертую строку: ");
        String s4 = scanner.nextLine();
        System.out.print("Введите пятую строку: ");
        String s5 = scanner.nextLine();

        findLongestString(s1, s2, s3, s4, s5);
    }

    static String findLongestString(String s1, String s2, String s3, String s4, String s5) {
        String longest = s1;
        if (s2.length() > longest.length()) {
            longest = s2;
        }
        if (s3.length() > longest.length()) {
            longest = s3;
        }
        if (s4.length() > longest.length()) {
            longest = s4;
        }
        if (s5.length() > longest.length()) {
            longest = s5;
        }
        System.out.println("Самая длинная строка из пяти: " + longest);

        return longest;
    }
}