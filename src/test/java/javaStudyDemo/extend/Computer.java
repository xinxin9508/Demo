package javaStudyDemo.extend;

public class Computer {
    private String cpu;
    private String mem;
    private String disk;

    public Computer(String cpu, String mem, String disk) {
        this.cpu = cpu;
        this.mem = mem;
        this.disk = disk;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void getDetail() {
        System.out.println("电脑的CPU" + cpu + " 电脑的内存" + mem + " 电脑的硬盘" + disk);

    }
}
