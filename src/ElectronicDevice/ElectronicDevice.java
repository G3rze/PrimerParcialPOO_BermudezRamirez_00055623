package ElectronicDevice;

public abstract class ElectronicDevice implements IElectronicDevice {

    private String name;
    private String model;
    private float price;
    private String descrition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    @Override
    public void printPrice() {
        System.out.println("El precio del producto es: $" + price);
    }

    @Override
    public void printDescription() {
        System.out.println("La descripcion del producto es: " + descrition);
    }

    public abstract void printAllInformation();
}
