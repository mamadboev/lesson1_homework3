package models;

public class Printer {
    private String code;
    private String model;
    private String color;
    private String type;
    private String price;

    @Override
    public String toString() {
        return "printer{" +
                "code='" + code + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Printer(String code, String model, String color, String type, String price) {
        this.code = code;
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    public Printer() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
