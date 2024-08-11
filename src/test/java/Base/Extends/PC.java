package Base.Extends;

public class PC extends Computer {
    public String brand;

    public String getBrand() {
        return brand;
    }

    public PC() {

    }

    public PC(String cpu, String mem, String disk, String brand) {
        super(cpu, mem, disk);
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPCDetails() {
        return getDetails() + " 品牌：" + brand;
    }
}
