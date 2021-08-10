public class ConsumerTask implements Runnable{
    GenerateAndPrintRandomNumbers generateAndPrintRandomNumbers;

    ConsumerTask(GenerateAndPrintRandomNumbers generateAndPrintRandomNumbers) {
        this.generateAndPrintRandomNumbers = generateAndPrintRandomNumbers;
    }
    @Override
    public void run() {
        while (true) {
            generateAndPrintRandomNumbers.consume();
        }
    }
}


