import java.util.LinkedList;


public class GenerateAndPrintRandomNumbers {

    private volatile LinkedList<Integer> randomNumbers = new LinkedList<>();

public void produce() {
  int randomMax = (int)(Math.random()*100);
    System.out.println("range: 0 - randomMax");
    for (int i = 0; i < randomMax; ++i) {
        int random = (int) (Math.random()*randomMax);
 synchronized(this) {
            randomNumbers.add(random);
        }
 }
}

    public synchronized void consume() {
  if (randomNumbers.size() > 0) {
      System.out.println(randomNumbers.getFirst() + " List size: = " + randomNumbers.size());
      randomNumbers.removeFirst();
  }
}

}
