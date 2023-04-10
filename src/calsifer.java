import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class calsifer {

    private static int width = 720;
    private static int height = 720;

    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;

    static Color black = Color.black;
    static Color white = Color.white;
    static Color red = Color.red;
    static Color orange = Color.orange;
    static Color yellow = Color.yellow;
    static Color pastelPink = new Color(255, 182, 193);

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    public static void paint() {
        drawBackground(PIXEL_SIZE, Color.black);

        
        fillRect(2, 6, 15, 9, orange);
        fillRect(4, 15, 12, 2, orange);
        fillRect(1, 10, 1, 3, orange);
        fillRect(6, 2, 3, 4, orange);
        fillRect(13, 3, 3, 4, orange);
        fillRect(2, 5, 1, 1, orange);
        fillRect(9, 5, 1, 1, orange);
        
        fillRect(4, 17, 11, 1, red);
        fillRect(3, 15, 1, 2, red);
        fillRect(2, 14, 1, 1, red);
        fillRect(1, 13, 1, 1, red);
        fillRect(0, 10, 1, 3, red);
        fillRect(1, 8, 1, 2, red);
        fillRect(1, 5, 1, 2, red);
        fillRect(2, 3, 1, 2, red);
        fillRect(3, 5, 1, 1, red);
        fillRect(4, 6, 1, 1, red);
        fillRect(5, 4, 1, 2, red);
        fillRect(6, 2, 1, 2, red);
        fillRect(7, 0, 1, 2, red);
        fillRect(8, 2, 1, 1, red);
        fillRect(9, 3, 1, 2, red);
        fillRect(10, 4, 1, 2, red);
        fillRect(11, 5, 1, 1, red);
        fillRect(12, 4, 1, 2, red);
        fillRect(13, 3, 1, 1, red);
        fillRect(14, 1, 1, 2, red);
        fillRect(15, 3, 1, 2, red);
        fillRect(16, 5, 1, 5, red);
        fillRect(17, 9, 1, 5, red);
        fillRect(16, 14, 1, 3, red);
        fillRect(15, 16, 1, 1, red);
        

        fillRect(5, 15, 9, 1, yellow);
        fillRect(4, 13, 10, 2, yellow);
        fillRect(3, 12, 11, 1, yellow);
        fillRect(4, 11, 11, 1, yellow);
        fillRect(4, 9, 12, 2, yellow);
        fillRect(4, 8, 5, 1, yellow);
        fillRect(5, 7, 3, 1, yellow);
        fillRect(11, 8, 5, 1, yellow);
        fillRect(12, 7, 2, 1, yellow);
        fillRect(15, 7, 1, 1, yellow);
        fillRect(7, 12, 5, 1, red);
        fillRect(6, 13, 7, 2, red);
        fillRect(7, 15, 5, 1, red);
        
        fillRect(5, 8, 3, 3, white);
        fillRect(11, 8, 3, 3, white);
        fillRect(6, 9, 1, 1, black);
        fillRect(12, 9, 1, 1, black);
        fillRect(8, 14, 3, 2, pastelPink);
        
       

        drawSquareGrid(PIXEL_SIZE, Color.black);

        try {
            ImageIO.write(image, "jpg", new File("Calsifer.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void putPixel(int x, int y, Color c) {
        g.setColor(c);
        g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
    }

    private static void fillRect(int x, int y, int width, int height, Color c) {
        g.setColor(c);
        g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width * PIXEL_SIZE, height * PIXEL_SIZE);
    }

    private static void drawSquareGrid(int size, Color c) {
        g.setColor(c);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }

    private static void drawBackground(int size, Color c) {
        g.setColor(c);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }

    public static void main(String[] args) {
        g = image.createGraphics();
        paint();
    }
}