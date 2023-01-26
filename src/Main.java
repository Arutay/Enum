import Transport.*;
import com.sun.jdi.connect.Transport;
import jdk.jfr.Category;

public class Main {
    public static void main(String[] args) {

        Car kia = new Car("Kia", "Stinger", 3.3, TypeOfBody.SEDAN);
        Car hyundai = new Car("Hyundai", "Genesis G90", 5.0, TypeOfBody.SEDAN);


        Truck kamazTruck1 = new Truck("Камаз", "5490", 12,Weight.N1);
        Truck kamazTruck2 = new Truck("Камаз", "6520", 10, Weight.N2);

        Bus kamazBus1 = new Bus("Камаз", "12312", 7, Capacity.MEDIUM);
        Bus kamazBus2 = new Bus("Камаз", 1231, 6, Capacity.LARGE);


        Driver driverB = new DriverB("Иванов Иван Иванович", true, 11);
        Driver driverC = new DriverC("Петров Петр Петрович", true, 12);
        Driver driverD = new DriverD("Семенов Семен Семенович", true, 10);



    }

    private static void printInfo(Driver <?> driver, transport Transport) {
        System.out.println(
                "Водитель " +driver.getName()+
                        " управляет автомобилем " + Transport.getBrand() + " " + Transport.getModel() + " " +
                        " и будет учавствовать в заезде"
        );

        Transport.printType();
    }
}