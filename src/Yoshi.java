
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Yoshi {
	
	private static int width = 640;
    private static int height = 640;
    
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
   
    static Color white = Color.white;
    static Color green = new Color(46, 206, 46, 255);
    static Color greenDark = new Color(0, 129, 0, 255);
    static Color black = Color.black;
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);  
    	
    	fillRect(0, 7, 16, 6,  black);
    	fillRect(1, 13, 1, 1,  black);
    	fillRect(2, 14, 1, 1,  black);
    	fillRect(3, 13, 10, 2,  black);
    	fillRect(4, 15, 8, 1,  black);
    	fillRect(13, 14, 1, 1,  black);
    	fillRect(14, 13, 1, 1,  black);
    	fillRect(3, 2, 10, 6,  black);
    	fillRect(4, 1, 8, 1,  black);
    	fillRect(5, 0, 2, 1,  black);
    	fillRect(9, 0, 2, 6,  black);
    	fillRect(2, 5, 12, 2,  black);
    	fillRect(1, 6, 14, 2,  black);
    	fillRect(3, 9, 9, 2,  green);
    	fillRect(4, 11, 7, 1,  green);
    	fillRect(5, 12, 5, 1,  green);
    	fillRect(4, 7, 7, 1,  green);
    	fillRect(1, 7, 2, 1,  green);
    	fillRect(2, 6, 2, 1,  green);
    	fillRect(3, 8, 3, 1,  green);
    	fillRect(7, 8, 2, 1,  green);
    	fillRect(10, 8, 2, 1,  green);
    	fillRect(5, 6, 5, 1,  green);
    	fillRect(12, 6, 2, 1,  green);
    	fillRect(13, 7, 2, 1,  green);
    	fillRect(5, 1, 2, 1,  green);
    	fillRect(9, 1, 2, 1,  green);
    	fillRect(7, 2, 2, 1,  green);
    	fillRect(4, 2, 1, 1,  green);
    	fillRect(11, 2, 1, 1,  green);
    	fillRect(5, 14, 6, 1,  greenDark);
    	fillRect(4, 13, 8, 1,  greenDark);
    	fillRect(3, 12, 2, 1,  greenDark);
    	fillRect(10, 12, 3, 1,  greenDark);
    	fillRect(3, 11, 1, 1,  greenDark);
    	fillRect(11, 11, 2, 1,  greenDark);
    	fillRect(12, 8, 1, 3,  greenDark);
    	fillRect(11, 7, 1, 1,  greenDark);
    	fillRect(10, 6, 1, 1,  greenDark);
    	fillRect(1, 8, 1, 4, white);
    	fillRect(14, 8, 1, 4, white);
    	fillRect(4, 3, 1, 3, white);
    	fillRect(5, 2, 1, 3, white);
    	fillRect(6, 2, 1, 1, white);
    	fillRect(7, 3, 2, 2, white);
    	fillRect(9, 2, 2, 1, white);
    	fillRect(10, 2, 1, 3, white);
    	fillRect(11, 3, 1, 3, white);
  
        
        
        drawSquareGrid(PIXEL_SIZE, Color.black);
        
        try {       
            ImageIO.write(image, "jpg", new File("Yoshi.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
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