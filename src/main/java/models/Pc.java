package models;

public class Pc  {
    private String code;
    private String model;
    private String speed;
    private String ram;
    private String hd;
    private String cd;
    private String price;

    @Override
    public String toString() {
        return "pc{" +
                "code='" + code + '\'' +
                ", model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                ", ram='" + ram + '\'' +
                ", hd='" + hd + '\'' +
                ", cd='" + cd + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Pc(String maker, String model, String price) {
    }

    public Pc(String code, String model, String speed, String ram, String hd, String cd, String price) {
        this.code = code;
        this.model = model;
        this.speed = speed;
        this.ram = ram;
        this.hd = hd;
        this.cd = cd;
        this.price = price;
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

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
