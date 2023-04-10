import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Tortuga {
	
	private static int width = 800;
    private static int height = 800;
    
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
   
    static Color white = Color.white;
    static Color green = new Color(34, 139, 34);
    static Color darkGreen = new Color(0, 100, 0);
    static Color black = Color.black;
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);  
    	
    	
  
        fillRect(4, 12, 10, 2, green);
        fillRect(4, 14, 2, 2, green);
        fillRect(12, 14, 2, 2, green);
        fillRect(14, 7, 2, 1, green);
        fillRect(14, 8, 3, 2, green);
        fillRect(14, 10, 2, 1, green);
        fillRect(14, 11, 1, 1, green);
        fillRect(2, 12, 2, 1, green);
        putPixel(15, 8, black);
        fillRect(8, 6, 2, 1, darkGreen);
        fillRect(6, 7, 6, 1, darkGreen);
        fillRect(5, 8, 8, 1, darkGreen);
        fillRect(4, 9, 10, 3, darkGreen);
        drawSquareGrid(PIXEL_SIZE, Color.white);
        
        try {       
            ImageIO.write(image, "jpg", new File("Tortuga.jpg"));
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