import java.util.LinkedList;


public class GenerateRandomNumbersWithPrint {

   /*
   в данный класс вынесена логика добавления и удаления числа из списка.
   в методе produce синхронизирована только часть метода, ответственная за добавление данных в список.
   bufferMaxSize не дает размеру списка выйти за рамки допустимого значения.
    */

    private final int bufferMaxSize = 1000;
    private volatile LinkedList<Integer> randomNumbers = new LinkedList<>();


    public void produce() {

        int randomMax = (int) (Math.random() * 100);
        System.out.println(String.format("range: 0 - %s", randomMax));
        for (int i = 0; i < randomMax; ++i) {
            int random = (int) (Math.random() * randomMax);
            synchronized (this) {
                while (randomNumbers.size() == bufferMaxSize) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                randomNumbers.add(random);
                notify();
            }

        }
    }

    public synchronized void consume() {

        while (randomNumbers.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(randomNumbers.getFirst() + " List size: = " + randomNumbers.size());
        randomNumbers.removeFirst();
        notify();

    }

}
