import java.util.Deque;
import java.util.LinkedList;

public class CarWashPark {
    Deque<String> carsQueue = new LinkedList<>();
    public final int MAX_SIZE = 5;

    public synchronized void putCarIntoCarWashPark(String car) {
        while (carsQueue.size() >= MAX_SIZE) {
            System.out.println("Prea multe masini." + car);
            try {
                this.wait();
                System.out.println("S-a eliberat un spatiu" + car);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(carsQueue);
        carsQueue.add(car);
        this.notifyAll();
    }

    public synchronized String getCarToWashFromPark(String spalator) {
        while (carsQueue.isEmpty()) {
            try {
                System.out.println("Nu e nicio masina." +  spalator);
                this.wait();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(carsQueue);
        String car = carsQueue.removeFirst();
        System.out.println("Am prins o masina la spalat " + spalator + " " + car);
        this.notifyAll();
        return car;
    }
}
