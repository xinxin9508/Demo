package javaStudyDemo;

public class Method01 {
    public static void main(String[] args) {
        int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
        MyTool tool = new MyTool();
        tool.mytool(map);
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                System.out.println(map[i][j]);
//            }
//        }
    }
}
class MyTool{
    public void mytool(int[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }
    }

}