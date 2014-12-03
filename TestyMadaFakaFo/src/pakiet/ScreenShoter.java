package pakiet;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
public class ScreenShoter {
 
        private Robot robot;
        private int width;
        private int height;
        private Rectangle screenRct;
        public Image image;
 
        public ScreenShoter() throws AWTException 
        {
                robot = new Robot();
                width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
                height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
                screenRct = new Rectangle(0, 0, width, height);
        }
        public Image make() 
        {
                if (robot != null) 
                {
                         image = robot.createScreenCapture(screenRct);
                         return image;
                }
                return null;
        }
}