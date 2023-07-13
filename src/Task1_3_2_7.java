import java.util.Arrays;
class Task1_3_2_7 {

    // Метод для поиска наибольшего элемента массива.
    static int largest() {
        int v1 = 12;
        int v2 = 75;
        int v3 = -7;
        int v4 = 12405;
        int v5 = 980;

        int arr[] = {v1, v2, v3, v4, v5};  // Или так можно: int[] arr = new int[] { v1, v2, v3, v4, v5 };
        System.out.println("Задаем массив arr[], используя метод largest: " + Arrays.toString(arr));

        int i;

        // Объявляем переменную для максимального элемента: max.
        int max = arr[0];

        // Перебираем элементы массива и сравниваем каждый элемент с текущим максимумом.
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Задание: \n7.  Напишите метод, который возвращает наибольший элемент " +
                "массива\n\nРешение: ");

        System.out.println("наибольший элемент массива: " + largest());
    }
}