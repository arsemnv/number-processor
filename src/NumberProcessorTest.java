public class NumberProcessorTest {

    public static void main(String[] args) {
        try {
            testMin();
            testMax();
            testSum();
            testMult();
        } catch (AssertionError e) {
            System.err.println("Тест провалился: " + e.getMessage());
            System.exit(1);
        }
    }

    private static void testMin() {
        int[] numbers = {1, 4, 2, 3};
        assert NumberProcessor.min(numbers) == 1 : "Ожидаемый минимум 1";
    }

    private static void testMax() {
        int[] numbers = {1, 4, 2, 3};
        assert NumberProcessor.max(numbers) == 4 : "Ожидаемый максимум 4";
    }

    private static void testSum() {
        int[] numbers = {1, 4, 2, 3};
        assert NumberProcessor.sum(numbers) == 10 : "Ожидаемая сумма 10";
    }

    private static void testMult() {
        int[] numbers = {1, 4, 2, 3};
        assert NumberProcessor.mult(numbers) == 24 : "Ожидаемый результат умножения 24";
    }
}
