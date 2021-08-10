public class ProducerTask implements Runnable {

   GenerateAndPrintRandomNumbers generateAndPrintRandomNumbers;

    ProducerTask(GenerateAndPrintRandomNumbers generateAndPrintRandomNumbers) {
       this.generateAndPrintRandomNumbers = generateAndPrintRandomNumbers;
    }
    @Override
    public void run() {
            generateAndPrintRandomNumbers.produce();
        }
}
