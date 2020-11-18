public class Main {
    public static void main(String[] args) {
        CarWashPark carWashPark = new CarWashPark();
        Spalator spalator = new Spalator("Gigel", carWashPark);
        Spalator spalator2 = new Spalator("Fanel", carWashPark);
//        Spalator spalator3 = new Spalator("Ionel", carWashPark);

        DirtyCarProducer dirtyCarProducer = new DirtyCarProducer(carWashPark);

        dirtyCarProducer.start();
        spalator.start();
        spalator2.start();
//        spalator3.start();

    }
}
