package Transport;

import Transport.exception.DiagnosticFailedException;

public class Car extends transport<DriverB> {


    private TypeOfBody typeOfBody;


    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody,DriverB driver) {
        super(brand, model, engineVolume,driver);
        this.typeOfBody = typeOfBody;
    }



    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение ");
    }

    @Override
    public boolean diagnostics() throws DiagnosticFailedException {
        if (getDriver() != null && getDriver().isHasDriverLicense) {
            return true;
        } else {
            throw new DiagnosticFailedException();
        }
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова авто: " +typeOfBody);
        }
    }


    @Override
    public void pitStop() {
        System.out.println("Пит-Стоп у автомобиля");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 70;
        int maxBound = 120;
        int theBestTimeInMins = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для атомобиля в минутах: " + theBestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound = 100;
        int maxBound = 160;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для автомобиля: " + maxSpeed);
    }



}
