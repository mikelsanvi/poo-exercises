package org.ies.tierno.objects.garage.readers;

import org.ies.tierno.objects.garage.model.Vehicle;
import org.ies.tierno.objects.garage.model.VehicleType;

import java.util.Scanner;

public class VehicleReader {

    private final Scanner scanner;

    public VehicleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Vehicle read() {
        System.out.println("Introduce los datos del vehículo:");

        VehicleType vehicleType = null;
        do {
            System.out.println("Tipo de vehiculo:");
            System.out.println("1. Moto");
            System.out.println("2. Coche");
            System.out.println("3. Camión");
            int index = scanner.nextInt();
            scanner.nextLine();
            if (index == 1) {
                vehicleType = VehicleType.Motorbike;
            } else if (index == 2) {
                vehicleType = VehicleType.Car;
            } else if (index == 3) {
                vehicleType = VehicleType.Truck;
            } else {
                System.out.println("Opción inválida");
            }
        } while (vehicleType == null);

        System.out.println("Máxima velocidad:");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Color:");
        String color = scanner.nextLine();

        System.out.println("Matrícula:");
        String plate = scanner.nextLine();

        return new Vehicle(
                vehicleType,
                maxSpeed,
                color,
                plate
        );

    }
}
