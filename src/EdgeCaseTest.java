public class EdgeCaseTest {

    public static void main(String[] args) {
        try {
            testEmptyArray();
        } catch (Exception e) {
            System.err.println("Эдж кейс тест провалился: " + e.getMessage());
            System.exit(1);
        }
    }

    private static void testEmptyArray() {
        int[] empty = {};

        try {
            NumberProcessor.min(empty);
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Массив не должен быть пустым") : "Ожидали IllegalArgumentException для пустого массива в _min";
        }

        try {
            NumberProcessor.max(empty);
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Массив не должен быть пустым") : "Ожидали IllegalArgumentException для пустого массива в _max";
        }

        assert NumberProcessor.sum(empty) == 0 : "Ожидаемая сумма пустого массива 0";
        assert NumberProcessor.mult(empty) == 0 : "Ожидаемый продукт умножения пустого массива 0";
    }
}
