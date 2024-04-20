package ElectronicDevice;

public class Phone extends ElectronicDevice{

    private String networkType;

    private String chargerType;

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    @Override
    public void printAllInformation() {
        System.out.println("El nombre del dispositivo es: " + getName());
        System.out.println("El modelo del dispositivo es: " + getModel());
        System.out.println("El tipo de red es: " + getNetworkType());
        System.out.println("La entrada del cargador es: " + getChargerType());
        printDescription();
        printPrice();
    }

    public Phone(String networkType, String chargerType, String name, String model, float price, String description) {
        this.networkType = networkType;
        this.chargerType = chargerType;
        setName(name);
        setModel(model);
        setPrice(price);
        setDescrition(description);
    }
}
