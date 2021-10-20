package models;

public class Laptop {
    private String code;
    private String model;
    private String speed;
    private String ram;
    private String hd;
    private String price;
    private String screen;

    @Override
    public String toString() {
        return "laptop{" +
                "code='" + code + '\'' +
                ", model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                ", ram='" + ram + '\'' +
                ", hd='" + hd + '\'' +
                ", price='" + price + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    public Laptop(String code, String model, String speed, String ram, String hd, String price, String screen) {
        this.code = code;
        this.model = model;
        this.speed = speed;
        this.ram = ram;
        this.hd = hd;
        this.price = price;
        this.screen = screen;
    }

    public Laptop() {
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

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

}
