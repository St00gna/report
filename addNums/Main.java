package addNums;
public class Main {
    public static void main(String[] args) {
        int iterations = 1000;
        long startTime = System.nanoTime();

        for (int j = 0; j < iterations; j++) {
            long result = 0;
            for (int i = 0; i < 1000000; i++) {
                result += i;
            }
        }

        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime) / iterations;

        System.out.println("Average time on Java: " + executionTime + " ns");
    }
}
