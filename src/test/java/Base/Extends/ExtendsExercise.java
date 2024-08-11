package Base.Extends;

public class ExtendsExercise {
    public static void main(String[] args) {
        PC pc = new PC();
        NotePad notePad = new NotePad();
        pc.cpu = "12400f";
        pc.mem = "16GB";
        pc.disk = "2tb";
        pc.brand = "华硕";
        System.out.println(pc.getPCDetails());

        PC pc1 = new PC("12600", "21G", "1TB", "微星");
        System.out.println(pc1.getPCDetails());

        notePad.cpu = "8155";
        notePad.mem = "12GB";
        notePad.disk = "512G";
        notePad.color = "白色";
        System.out.println(notePad.getNotePadDetails());

        NotePad notePad1 = new NotePad("9633", "8GB", "128G", "黑色");
        System.out.println(notePad1.getNotePadDetails());
    }
}
