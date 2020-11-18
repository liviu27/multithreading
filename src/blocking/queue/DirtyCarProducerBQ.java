package blocking.queue;


import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class DirtyCarProducerBQ extends Thread{
    BlockingQueue<String> carWashPark;

    public DirtyCarProducerBQ(BlockingQueue<String> carWashPark) {
        this.carWashPark = carWashPark;
    }

    @Override
    public void run() {
        while (true) {
            Random randomCar = new Random();
            String car = "car" + randomCar.nextInt();
            try {
                System.out.println(carWashPark);
                System.out.println("Vreau sa pun masina la spalat: " + car);
                carWashPark.put(car);
                sleep(2000);
                System.out.println("Am prins loc la spalat: " + car);
                System.out.println(carWashPark);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
