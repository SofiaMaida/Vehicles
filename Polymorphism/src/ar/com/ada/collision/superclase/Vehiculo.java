package ar.com.ada.collision.superclase;

import java.util.Objects;

public class Vehiculo {
    protected String brand;
    protected String model;
    protected Integer year;

    public Vehiculo() {}

    public Vehiculo(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String technicalSheet() {
        return "\nVehiculo simple -> Ficha tecnica " + this.toString() +
        "Este vehiculo no tiene una categoria asignada\n";
    }

    @Override
    public String toString() {
        return "\nVehiculo: \nBrand = " + this.brand + "\nModelo = " + this.model + "\nAño = " + this.year + "\n";
    }

    @Override
    public int hashCode() {
        return -56 * Objects.hash(this.brand, this.model, this.year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !((obj) instanceof Vehiculo)) {
            return false;
        }
        Vehiculo that = (Vehiculo) obj;

        return this.year.equals(that.year) &&
                this.brand.equals(that.brand) &&
                this.model.equals(that.model);
    }

}

