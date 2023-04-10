
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Fantasma {

    private static int width = 1200;
    private static int height = 1200;
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;

    static Color white = Color.white;
    static Color blue = Color.blue;
    static Color black = Color.black;
    static Color lightBlue = new Color(173, 216, 230);
    static Color lightGray = new Color(211, 211, 211);
    static Color darkGray = new Color(169, 169, 169);
    static Color navyBlue = new Color(0, 0, 128);
    static Color lilac = new Color(164,124,194,255);

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    public static void paint() {
        drawBackground(PIXEL_SIZE, lilac);
       
      
        fillRect(1, 12, 4, 2, navyBlue);
        fillRect(1, 13, 2, 3, blue); //si sirve
        fillRect(2, 12, 2, 3, lightBlue);
        fillRect(3, 15, 1, 1, lightBlue);
        fillRect(2, 12, 1, 1, navyBlue);
        fillRect(0, 13, 1, 2, navyBlue);
        fillRect(1, 15, 1, 1, navyBlue);
        fillRect(2, 16, 2, 1, navyBlue);
        fillRect(4, 15, 1, 1, navyBlue);
        fillRect(3, 14, 1, 1, navyBlue);
        fillRect(3, 11, 1, 1, navyBlue);   
        fillRect(11, 9, 15, 2, white);
        fillRect(11, 8, 15, 10, white);
        fillRect(9, 11, 16, 11, white);   
        fillRect(8, 25, 13, 1, black);
        fillRect(12, 26, 13, 1, black);
        fillRect(10, 27, 13, 1, black);
        fillRect(24, 10, 2, 4, black);
        fillRect(18, 10, 5, 1, black);
        fillRect(18, 11, 1, 1, black);
        fillRect(20, 11, 3, 2, black);
        fillRect(21, 13, 2, 1, black);   
        fillRect(8, 23, 15, 1, darkGray);
        fillRect(6, 22, 3, 1, darkGray);
        fillRect(4, 21, 2, 1, darkGray);
        fillRect(3, 20, 1, 1, darkGray);
        fillRect(2, 19, 1, 1, darkGray);
        fillRect(3, 18, 1, 1, darkGray);
        fillRect(4, 19, 3, 1, darkGray);
        fillRect(7, 18, 1, 1, darkGray);
        fillRect(8, 15, 1, 3, darkGray);
        fillRect(9, 11, 1, 4, darkGray);
        fillRect(12, 16, 1, 2, lightGray);
        fillRect(13, 15, 1, 1, lightGray);
        fillRect(14, 14, 4, 1, lightGray);
        fillRect(18, 15, 1, 3, lightGray);
        fillRect(15, 18, 3, 1, lightGray);
        fillRect(14, 19, 1, 1, lightGray);    
        fillRect(10, 9, 1, 2, darkGray);
        fillRect(11, 8, 1, 1, darkGray);
        fillRect(12, 7, 2, 1, darkGray);
        fillRect(13, 6, 10, 1, darkGray);
        fillRect(23, 7, 2, 1, darkGray);
        fillRect(25, 8, 1, 1, darkGray);
        fillRect(26, 9, 1, 9, darkGray);
        fillRect(25, 18, 1, 3, darkGray);
        fillRect(24, 21, 1, 1, darkGray);
        fillRect(23, 22, 1, 1, darkGray);
        fillRect(4, 20, 6, 1, lightGray);
        fillRect(6, 21, 6, 1, lightGray);
        fillRect(9, 22, 14, 1, lightGray);
        fillRect(19, 21, 5, 1, lightGray);
        fillRect(20, 20, 5, 1, lightGray);
        fillRect(22, 19, 3, 1, lightGray);
        fillRect(24, 18, 1, 1, lightGray);
        fillRect(3, 19, 1, 1, lightGray);    
        fillRect(25, 11, 1, 1, lightBlue);
        fillRect(21, 11, 1, 1, lightBlue);
        fillRect(14, 7, 9, 1, white);
        fillRect(12, 8, 13, 1, white);
        fillRect(8, 18, 1, 2, white);
        fillRect(7, 19, 1, 1, white);
        fillRect(27, 15, 1, 3, white);
        fillRect(28, 15, 1, 3, darkGray);
        fillRect(27, 14, 1, 1, darkGray);
        fillRect(26, 18, 2, 1, darkGray);
        fillRect(23, 16, 1, 2, black);
  
        drawSquareGrid(PIXEL_SIZE, lilac);

        try {
            ImageIO.write(image, "jpg", new File("Fantasma.jpg"));
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