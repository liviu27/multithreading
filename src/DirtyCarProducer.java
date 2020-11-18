import java.util.Random;

public class DirtyCarProducer extends Thread{
    CarWashPark carWashPark;

    public DirtyCarProducer(CarWashPark carWashPark) {
        this.carWashPark = carWashPark;
    }

    @Override
    public void run() {
        while (true) {
            Random randomCar = new Random();
            String car = "car" + randomCar.nextInt();
            carWashPark.putCarIntoCarWashPark(car);
        }
    }
}
