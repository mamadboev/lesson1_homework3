package models;

public class List {
    private String maker;
    private String model;
    private String price;

    public List(String maker, String model, String price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public List() {
    }

    @Override
    public String toString() {
        return "List{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
