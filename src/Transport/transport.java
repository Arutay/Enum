package Transport;

import Transport.exception.DiagnosticFailedException;

public abstract class transport{

    private final String brand;
    private final String model;
    private double engineVolume;
    private final T driver;



    public transport(String brand, String model, double engineVolume) {

        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;

        setEngineVolume(engineVolume);
    }

    public T getDriver() {
        return driver;
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }



    public abstract void  startMove();
    public abstract void  finishMove();

    public abstract boolean diagnostics() throws DiagnosticFailedException;



    @Override
    public String toString() {
        return "марка = " + brand + ", " +
                "модель = " + model + ", " +
                "объем двигателя = " + engineVolume;


    }


    public abstract void printType();
}
