import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class ProducerTask implements Runnable {

    /*Добавление строчки while (true) в метод run зациклит поток на выполнение метода produce,
     для наглядности поток выполняет метод один раз.
    */

    private GenerateRandomNumbersWithPrint generateRandomNumbersWithPrint;

    @Override
    public void run() {
            generateRandomNumbersWithPrint.produce();
        }
    }
