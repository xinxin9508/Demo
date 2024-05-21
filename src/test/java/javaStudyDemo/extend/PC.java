package javaStudyDemo.extend;

public class PC extends Computer {
    private String brand;

    public PC(String cpu, String mem, String disk, String brand) {
        super(cpu, mem, disk);
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        getDetail();
        return brand;
    }
}

class NotePad extends Computer {
    public String color;

    public NotePad(String cpu, String mem, String disk, String color) {
        super(cpu, mem, disk);
        this.color = color;
    }

    public String getColor() {
        getDetail();
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Test {
    public static void main(String[] args) {
        PC pc = new PC("12400f","16g","2T","ROG");
        NotePad notePad = new NotePad("12600k","8g","1T","白色");


        System.out.println("电脑的品牌为" + pc.getBrand());
        System.out.println("电脑的颜色为" + notePad.getColor());
//        notePad.getDetail();

    }
}
