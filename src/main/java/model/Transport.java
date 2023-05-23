package model;

import javax.annotation.PostConstruct;
import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;

    public Transport(String car, String model) {
        this.brand = car;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @PostConstruct
    private void init() {
        System.out.println(brand + " готов к работе.");
    }

    @Override
    public String toString() {
        return ", транспортное средство " +
                " марки " + brand + ", модель " + model;
    }
}
