package Transport;

public class Bus extends transport<DriverD> {

    private Capacity capacity;


    public Bus(String brand, String model, double engineVolume,Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity=capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение ");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("данных по авто недостаточно");
        } else {
            System.out.println("Вместимость автобуса от : " + capacity.getFrom() + " до " + capacity.getTo());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-Стоп у автобуса");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeInMins = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автобуса в минутах: " + theBestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для автобуса: " + maxSpeed);
    }



}
