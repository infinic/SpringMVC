package web.model;


public class Car {

    private int id;
    private String manufacturer;
    private String model;
    private int released;

    public Car(int id, String manufacturer, String model, int released) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.released = released;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }
}
