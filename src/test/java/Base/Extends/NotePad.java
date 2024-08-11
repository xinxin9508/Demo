package Base.Extends;

public class NotePad extends Computer {
    public String color;

    public NotePad() {
    }

    public NotePad(String cpu, String mem, String disk, String color) {
        super(cpu, mem, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNotePadDetails() {
        return getDetails() + " 颜色：" + color;
    }
}
