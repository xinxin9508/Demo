package javaStudyDemo.ClassAndMethodHomeWork;

public class HomeWork08 {
    public static void main(String[] args) {
        Music music = new Music("七里香", 3.14);
        music.getinfo();
        music.play();
    }
}
class Music{

    String name;
    double times;
    public Music(String name, double times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println("开始播放音乐=" + name + "时长=" + times);
     }

     public void getinfo(){
         System.out.println("音乐名称=" + name + "\t" + "音乐时长=" + times);
     }
}