import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class ConsumerTask implements Runnable {

    private GenerateRandomNumbersWithPrint generateRandomNumbersWithPrint;

    @Override
    public void run() {
        while (true) {
            generateRandomNumbersWithPrint.consume();
        }
    }
}


