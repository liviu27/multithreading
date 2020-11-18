package blocking.queue;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainBQ {
    public static void main(String[] args) {
        BlockingQueue<String> carWashPark = new ArrayBlockingQueue<>(5);


        SpalatorBQ spalatorBQ = new SpalatorBQ("Gigel", carWashPark);
        SpalatorBQ spalatorBQ2 = new SpalatorBQ("Fanel", carWashPark);
//        Spalator spalator3 = new Spalator("Ionel", carWashPark);

        DirtyCarProducerBQ dirtyCarProducerBQ = new DirtyCarProducerBQ(carWashPark);

        dirtyCarProducerBQ.start();
        spalatorBQ.start();
        spalatorBQ2.start();
//        spalator3.start();

    }
}
