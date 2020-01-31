package ar.com.ada.collision.subclase;

import ar.com.ada.collision.superclase.Vehiculo;

import java.util.Objects;

public class SportVehiculo extends Vehiculo {
    private Integer rpm;

    public SportVehiculo() {}

    public SportVehiculo(Integer rpm) {
        this.rpm = rpm;
    }

    public SportVehiculo(String brand, String model, Integer year, Integer rpm) {
        this.rpm = rpm;
        this.brand = brand;
        this.model = model;
        this. year = year;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    @Override
    public String technicalSheet() {
       if (rpm <= 50) {
           return "\nVehiculo sport -> Ficha tecnica: " + this.toString() +
                   "\nEl auto es muy bonito, pero solo sirve para salir a pasear\n";
       } else if (rpm >= 51 && rpm <= 300) {
           return "\nVehiculo sport -> Ficha tecnica: " + this.toString() +
                   "\nCon este auto puedes desafiar a cualquiera en la pista\n";

       } else if (rpm >= 301 && rpm <= 600) {
           return "\nVehiculo sport -> Ficha tecnica: " + this.toString() +
                   "\nSi tienes este auto, debes considerar participar en NASCAR\n";
       } else {
           return "\nVehiculo sport -> Ficha tecnica: " + this.toString() +
                   "\n¿Eres parte del elenco de rápidos y furiosos?\n";
       }
    }

    @Override
    public String toString() {
        return "\nVehiculo: " + this.brand +
                "\nModelo: " + this.model +
                "\nAño: " + this.year;
    }

    @Override
    public int hashCode() {
        return -56 * Objects.hash(this.rpm);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        SportVehiculo that = (SportVehiculo) obj;

       return this.rpm.equals(that.rpm) &&
                super.equals(that);
    }


}
