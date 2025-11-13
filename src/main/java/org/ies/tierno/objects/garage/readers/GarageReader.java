package org.ies.tierno.objects.garage.readers;

import org.ies.tierno.objects.garage.model.Garage;
import org.ies.tierno.objects.garage.model.Vehicle;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scanner;
    private final VehicleReader vehicleReader;

    public GarageReader(Scanner scanner, VehicleReader vehicleReader) {
        this.scanner = scanner;
        this.vehicleReader = vehicleReader;
    }

    public Garage read() {
        System.out.println("Introduce los datos del taller");

        System.out.println("Nombre:");
        String name = scanner.nextLine();

        System.out.println("Dirección:");
        String address = scanner.nextLine();

        Vehicle[] vehicles = readVehicles();

        return new Garage(
                name,
                address,
                vehicles
        );
    }

    private Vehicle[] readVehicles() {
        int numVehicles;
        do {
            System.out.println("¿Cuántos vehículos hay en el taller?");
            numVehicles = scanner.nextInt();
            scanner.nextLine();
        } while (numVehicles < 1);

        Vehicle[] vehicles = new Vehicle[numVehicles];
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = vehicleReader.read();
        }
        return vehicles;
    }
}
