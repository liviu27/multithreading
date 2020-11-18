public class Spalator extends Thread {
    String nume;
    CarWashPark carWashPark;

    public Spalator(String nume, CarWashPark carWashPark) {
        this.nume = nume;
        this.carWashPark = carWashPark;
    }

    @Override
    public void run() {
        while(true) {
            String carToWashFromPark = carWashPark.getCarToWashFromPark(nume);
            System.out.println("Spalatorul " + nume + " s-a apucat sa spele masina." + carToWashFromPark);
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


