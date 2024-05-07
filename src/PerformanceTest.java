public class PerformanceTest {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        testLargeArray();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Перфоманс тест выполнен за: " + duration + "ms");

        if (duration > 1000) { // предположим, что тест должен выполниться менее чем за 1 секунду
            System.err.println("Перфоманс тест провалился: длительность больше 1000ms");
            System.exit(1);
        }
    }

    private static void testLargeArray() {
        int size = 1000000;
        int[] largeArray = new int[size];
        for (int i = 0; i < size; i++) {
            largeArray[i] = i;
        }
        NumberProcessor.sum(largeArray);
        NumberProcessor.mult(largeArray);
        NumberProcessor.min(largeArray);
        NumberProcessor.max(largeArray);
    }
}
