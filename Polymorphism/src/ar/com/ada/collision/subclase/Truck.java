package ar.com.ada.collision.subclase;

import ar.com.ada.collision.superclase.Vehiculo;

import java.util.Objects;

public class Truck extends Vehiculo {
    private Integer maxLoad;

    public Truck() {
    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxLoad = maxLoad;
    }

    @Override
    public String technicalSheet() {

        if (maxLoad <= 100) {
            return "\nVehiculo camion -> Ficha tecnica: " + this.toString() +
                    "\nPara iniciar un negocio de flete, está muy bien este auto\n";
        } else {
            return "\nVehiculo camion -> Ficha tecnica: " + this.toString() +
                    "\nTienes que usar este auto en el campo, es una máquina de trabajo!!\n";
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
        return -56 * Objects.hash(this.maxLoad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }
            Truck that = (Truck) obj;

            return this.maxLoad.equals(that.maxLoad) &&
                    super.equals(that);
        }

    }


