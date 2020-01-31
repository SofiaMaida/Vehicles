import ar.com.ada.collision.subclase.ElectricaVehiculo;
import ar.com.ada.collision.subclase.SportVehiculo;
import ar.com.ada.collision.subclase.Truck;
import ar.com.ada.collision.superclase.Vehiculo;

public class App {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[12];

        vehiculos[0] = new Vehiculo("Renault", "Sandero", 2015 );
        vehiculos[1] = new Vehiculo("Ford", "Ka", 2000 );
        vehiculos[2] = new Vehiculo("Peugeot", "207", 2018 );
        vehiculos[3] = new ElectricaVehiculo("Tesla", "Model 3", 2010, 120);
        vehiculos[4] = new ElectricaVehiculo("Audi", "e-tron", 2018, 130);
        vehiculos[5] = new ElectricaVehiculo("Jaguar", "I-PACE", 2017, 150);
        vehiculos[6] = new SportVehiculo("Ferrari", "Testarossa", 2018, 6000);
        vehiculos[7] = new SportVehiculo("Chevrolet", "Camaro", 2016, 400);
        vehiculos[8] = new SportVehiculo("Ford", "Mustang", 2019, 550);
        vehiculos[9] = new Truck("Mercedes-Benz", "Axor 2541", 2018, 225);
        vehiculos[10] = new Truck("Iveco", "2000", 2014, 50);
        vehiculos[11] = new Truck("Scania", "XT", 2018, 75);

                for (int i = 0; i < vehiculos.length; i++) {
                    System.out.println("Vehiculo " + i + " valor: " + vehiculos[i].technicalSheet());
                }


    }
}

