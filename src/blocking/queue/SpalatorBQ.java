package blocking.queue;
import java.util.concurrent.BlockingQueue;

public class SpalatorBQ extends Thread {
    String nume;
    BlockingQueue<String> carWashPark;

    public SpalatorBQ(String nume, BlockingQueue<String> carWashPark) {
        this.nume = nume;
        this.carWashPark = carWashPark;
    }

    @Override
    public void run() {
        while(true) {
            String carToWashFromPark = null;
            try {
                System.out.println(carWashPark);
                System.out.println("Spalator " + nume + " sunt liber sa spal.");
                carToWashFromPark = carWashPark.take();
                System.out.println("Spalatorul " + nume + " s-a apucat sa spele masina." + carToWashFromPark);
                System.out.println(carWashPark);
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


