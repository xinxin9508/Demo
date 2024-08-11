package Base.Extends;

public class Computer {
    public String cpu;
    public String mem;
    public String disk;

    public Computer() {
    }

    public Computer(String cpu, String mem, String disk) {
        this.cpu = cpu;
        this.mem = mem;
        this.disk = disk;
    }

    public String getDetails() {
        return "cpu:" + cpu + " 内存:" + mem + " 硬盘:" + disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
}
