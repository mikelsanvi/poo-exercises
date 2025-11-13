package org.ies.tierno.objects.garage.model;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private String name;
    private String address;
    private Vehicle[] vehiles;

    public Garage(String name, String address, Vehicle[] vehiles) {
        this.name = name;
        this.address = address;
        this.vehiles = vehiles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Vehicle[] getVehiles() {
        return vehiles;
    }

    public void setVehiles(Vehicle[] vehiles) {
        this.vehiles = vehiles;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(name, garage.name) && Objects.equals(address, garage.address) && Objects.deepEquals(vehiles, garage.vehiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, Arrays.hashCode(vehiles));
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", vehiles=" + Arrays.toString(vehiles) +
                '}';
    }
}
