package ElectronicDevice;

public class Laptop extends ElectronicDevice{

    private int nUSBPorts;
    private String cpuModel;
    private String screenPanelType;

    public String getScreenPanelType() {
        return screenPanelType;
    }

    public void setScreenPanelType(String screenPanelType) {
        this.screenPanelType = screenPanelType;
    }

    public int getnUSBPorts() {
        return nUSBPorts;
    }

    public void setnUSBPorts(int nUSBPorts) {
        this.nUSBPorts = nUSBPorts;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    @Override
    public void printAllInformation() {
        System.out.println("El nombre del dispositivo es: " + getName());
        System.out.println("El modelo del dispositivo es: " + getModel());
        System.out.println("La cantidad de puertos USB es : " + getnUSBPorts());
        System.out.println("El modelo del procesador es : " + getCpuModel());
        printDescription();
        printPrice();
    }

    public Laptop(int nUSBPorts, String cpuModel, String screenPanelType, String name, String model, float price, String description) {
        this.nUSBPorts = nUSBPorts;
        this.cpuModel = cpuModel;
        this.screenPanelType = screenPanelType;
        setName(name);
        setModel(model);
        setPrice(price);
        setDescrition(description);
    }
}
