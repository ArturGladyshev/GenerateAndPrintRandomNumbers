import java.util.concurrent.*;


public class PrintRandomNumbersStarter {

    public void start() {
        GenerateRandomNumbersWithPrint generateRandomNumbersWithPrint = new GenerateRandomNumbersWithPrint();
        ExecutorService poolThreads = Executors.newFixedThreadPool(2);
        poolThreads.submit(new ProducerTask(generateRandomNumbersWithPrint));
        poolThreads.submit(new ConsumerTask(generateRandomNumbersWithPrint));
    }

}
