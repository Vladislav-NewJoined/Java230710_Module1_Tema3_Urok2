import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task1_3_2_9 {
    public static void main(String[] args) {
        System.out.println("Задание: \n9.  Напишите метод, который принимает массив чисел, а возвращает исходный " +
                "массив, но без отрицательных чисел\n\nРешение: ");

        System.out.println("\nМетод getPositives создан. Из него получаем следующие выходные данные:");
        List<Integer> getPositives = getPositives();
        System.out.println("Исходный массив без отрицательных чисел: " + getPositives.toString());
    }

    //  Создаем метод для обработки исходного массива
    static List<Integer> getPositives() {
        int v1 = 0;
        int v2 = 1;
        int v3 = 2;
        int v4 = 3;
        int v5 = 4;
        int v6 = -5;
        int v7 = -6;
        int v8 = 7;

        int[] inputs = new int[] { v1, v2, v3, v4, v5, v6, v7, v8 };
        List<Integer> getPositives = new ArrayList<>();
        System.out.println("Исходный массив: " + Arrays.toString(inputs));

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] >= 0)
                getPositives.add(inputs[i]);

        }
        return getPositives;
    }
}