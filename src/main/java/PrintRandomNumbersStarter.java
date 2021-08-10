import java.util.concurrent.*;



public class PrintRandomNumbersStarter {

    GenerateAndPrintRandomNumbers generateAndPrintRandomNumbers = new GenerateAndPrintRandomNumbers();

    public void start() {
        ExecutorService poolThreads = Executors.newFixedThreadPool(2);
        poolThreads.submit(new ProducerTask(generateAndPrintRandomNumbers));
    poolThreads.submit(new ConsumerTask(generateAndPrintRandomNumbers));
    }

}
