import Transport.*;
import Transport.exception.DiagnosticFailedException;
import com.sun.jdi.connect.Transport;
import jdk.jfr.Category;

public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB(
                "Водитель категории В",
                true,
                1
        );

        Car car = new Car(
                "Бренд 1",
                "Модель 1",
                1.6,
                DriverB,
                TypeOfBody.SEDAN

        );


        Car car2 = new Car(
                "Бренд 2",
                "Модель 2",
                1.6,
                TypeOfBody.SEDAN,
                null
        );

        DriverD driverD = new DriverD(
                "Водитель категории D",
                true,
                1
        );

        Bus bus = new Bus(
                "Бренд 1",
                "Модель 2",
                1.6,
                Capacity.LARGE,
                driverD
        );

        DriverC driverC = new DriverC(
                "Водитель категории С",
                true,
                1

        );

        Truck truck = new Truck(
                "Бренд 1",
                "Модель 1",
                1.6,
                Weight.N1,
                driverC
        );


        try {
            System.out.println( car.diagnostics());
        } catch (DiagnosticFailedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println( car2.diagnostics());
        } catch (DiagnosticFailedException e) {
            e.printStackTrace();
        }


    }

    private static void printInfo(transport<?> Transport) {

        Transport.maxSpeed();
        Transport.pitStop();
        Transport.theBestCircleTime();


        System.out.println("Водтель " + Transport.getDriver().getName());
    }
}