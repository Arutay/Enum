package Transport;

public class Truck extends transport<DriverC> {


    private Weight weight;


    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение ");
    }

    @Override
    public void printType() {
        if (weight == null) {
            System.out.println("данных по авто недостаточно");
        } else {
            String from = weight.getFrom() == 0.0 ? "" : "от " + weight.getFrom() + " ";
            String to = weight.getTo() == 0.0 ? "" : "до " + weight.getTo();

            System.out.println("Грузоподъемность авто: " +from + to);
        }
    }


    @Override
    public void pitStop() {
        System.out.println("Пит-Стоп у грузовика");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 90;
        int maxBound = 140;
        int theBestTimeInMins = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах: " + theBestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для грузовика: " + maxSpeed);
    }
}
