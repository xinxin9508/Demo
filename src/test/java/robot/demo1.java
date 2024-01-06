package robot;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class demo1 {

    public static void main(String[] args) throws IOException, AWTException {
        screencature();
    };

    public static void screencature() throws AWTException, IOException {
        Dimension dimension =  Toolkit.getDefaultToolkit().getScreenSize(); //获取当前屏幕尺寸
        Rectangle rectangle = new Rectangle(dimension);
        BufferedImage bufferedImage = new Robot().createScreenCapture(rectangle);
        ImageIO.write(bufferedImage,"png",new File("./screenshot.png")); //保存截图
    }
}
