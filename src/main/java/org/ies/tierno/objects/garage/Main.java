package org.ies.tierno.objects.garage;

import org.ies.tierno.objects.garage.model.Garage;
import org.ies.tierno.objects.garage.readers.GarageReader;
import org.ies.tierno.objects.garage.readers.VehicleReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var vehicleReader = new VehicleReader(scanner);
        var garageReader = new GarageReader(scanner, vehicleReader);

        Garage garage = garageReader.read();

        System.out.println(garage);
    }
}
