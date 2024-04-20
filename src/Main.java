import ElectronicDevice.ElectronicDevice;
import ElectronicDevice.Phone;
import ElectronicDevice.Laptop;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    static ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();
    static Scanner sc;

    public static void main(String[] args) {

        String name;
        String model;
        String description;
        float price;
        boolean correct = false;

        sc = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("Bienvenido a ZonaDigital:");
            System.out.println("¿Que accion desea realizar?");
            System.out.println("1- Agregar nuevo telefono");
            System.out.println("2- Agregar nueva laptop");
            System.out.println("3- Modificar precio de dispostivo");
            System.out.println("4- Consultar informacion de dispositivos");
            System.out.println("5- Salir");
            System.out.println("Por favor ingrese el numeero de la opcion a realizar...");


            try {
                option = sc.nextInt();}
            catch (InputMismatchException ignored) {

            }

            switch (option) {
                case 1:
                    String networkType;
                    String chargerType;

                    System.out.println("Ingrese los datos del nuevo telefono...");
                    System.out.println("Nombre:");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Modelo:");
                    model = sc.nextLine();
                    System.out.println("Precio:");
                    price = sc.nextFloat();
                    System.out.println("Descripcion:");
                    sc.nextLine();
                    description = sc.nextLine();
                    System.out.println("Tipo de red:");
                    networkType = sc.nextLine();
                    System.out.println("Tipo de cargador:");
                    chargerType = sc.nextLine();

                    Phone newPhone = new Phone(networkType, chargerType, name, model, price, description);

                    electronicDevices.add(newPhone);

                    break;
                case 2:

                    int nUSBPorts;
                    String cpuModel;
                    String screenPanelType;

                    System.out.println("Ingrese los datos del nuevo telefono...");
                    System.out.println("Nombre:");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Modelo:");
                    model = sc.nextLine();
                    System.out.println("Precio:");
                    price = sc.nextFloat();
                    System.out.println("Descripcion:");
                    sc.nextLine();
                    description = sc.nextLine();
                    System.out.println("Numero de puertos USB:");
                    nUSBPorts = sc.nextInt();
                    System.out.println("Modelo del procesador:");
                    sc.nextLine();
                    cpuModel = sc.nextLine();
                    System.out.println("Tipo de panel:");
                    screenPanelType = sc.nextLine();

                    Laptop newLaptop = new Laptop(nUSBPorts, cpuModel, screenPanelType, name, model, price, description);

                    electronicDevices.add(newLaptop);

                    break;
                case 3:

                    System.out.println("Ingrese el modelo del dispositivo...");

                    sc.nextLine();

                    model = sc.nextLine();

                    ElectronicDevice electronicDevice = getElectronicByModel(model);

                    System.out.println("Ingrese el nuevo precio");

                    price = sc.nextFloat();

                    if (electronicDevice != null) {
                        electronicDevice.setPrice(price);
                    }

                    break;
                case 4:

                    System.out.println("Ingrese el modelo del dispositivo...");

                    sc.nextLine();

                    model = sc.nextLine();

                    ElectronicDevice showElectronicDevice = getElectronicByModel(model);

                    if (showElectronicDevice != null) {
                        showElectronicDevice.printAllInformation();
                    }

                    break;
                case 5:
                    System.out.println("Apagando Servidores...");
                    System.out.println("Cerrando la Matrix...");
                    System.out.println("Apagando...");
                    break;
                default:

            }
        } while (option != 5);
    }

    public static ElectronicDevice getElectronicByModel(String model){
        for (ElectronicDevice electronicDevice: electronicDevices){
            if (electronicDevice.getModel().equals(model)){
                return electronicDevice;
            }
        }
        return null;
    }
}
