package ar.com.ada.collision.subclase;

import ar.com.ada.collision.superclase.Vehiculo;

import java.util.Objects;

public class ElectricaVehiculo extends Vehiculo {
    private Integer potency;

    public ElectricaVehiculo() {
    }

    public ElectricaVehiculo(Integer potency) {
        this.potency = potency;
    }

    public ElectricaVehiculo(String brand, String model, Integer year, Integer potency) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.potency = potency;
    }

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    @Override
    public String technicalSheet() {
        if (this.year < 2007) {
            return "\nVehiculo electrico " + "\nNo existe modelo para este año\n";
        } else {
            return "\nVehiculo electrico -> Ficha tecnica: " + this.toString() + " Es un año de ultima tecnologia\n";
        }
    }

    @Override
    public String toString() {
        return "\nVehiculo: " + this.brand +
                "\nModelo: " + this.model +
                "\nAño: " + this.year +
                "\nPotencia: " + this.potency;
    }

    @Override
    public int hashCode() {
        return -56 * Objects.hash(this.potency);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

            ElectricaVehiculo that = (ElectricaVehiculo) obj;

            //boolean tmp = this.potency.equals(that.potency);

            return this.potency.equals(that.potency);
        }
}
