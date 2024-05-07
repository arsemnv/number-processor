import java.io.*;
import java.util.Arrays;

public class NumberProcessor {
    public static void main(String[] args) {
        try {
            int[] numbers = readNumbersFromFile("numbers.txt");
            System.out.println("Минимальное: " + min(numbers));
            System.out.println("Максимальное: " + max(numbers));
            System.out.println("Сумма: " + sum(numbers));
            System.out.println("Произведение: " + mult(numbers));
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public static int[] readNumbersFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return 
Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
    }

    public static int min(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        return Arrays.stream(numbers).min().orElseThrow();
    }

    public static int max(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        return Arrays.stream(numbers).max().orElseThrow();
    }

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        return Arrays.stream(numbers).sum();
    }

    public static int mult(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        return Arrays.stream(numbers).reduce(1, (a, b) -> a * b);
    }
}

