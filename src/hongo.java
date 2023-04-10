import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class hongo {
	
	private static int width = 800;
    private static int height = 800;
    
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
    static Color black = Color.black;
    static Color white = Color.white;
    static Color red = Color.red;
    static Color beige = new Color(255, 228, 196);
    static Color darkBeige = new Color(139, 115, 85);
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);
    	
    	 putPixel(1, 6, black);
         putPixel(1, 7, black);
         putPixel(1, 8, black);
         putPixel(1, 9, black);
         putPixel(1, 10, black);
         putPixel(1, 11, black);
         putPixel(2, 12, black);
         putPixel(3, 12, black);
         putPixel(4, 12, black);
         putPixel(5, 11, black);
         putPixel(6, 11, black);
         putPixel(7, 11, black);
         putPixel(8, 11, black);
         putPixel(9, 11, black);
         putPixel(10, 11, black);
         putPixel(11, 11, black);
         putPixel(12, 11, black);
         putPixel(2, 5, black);
         putPixel(2, 4, black);
    	putPixel(3, 3, black);
        putPixel(4, 2, black);
        putPixel(5, 2, black);
        putPixel(6, 1, black);
        putPixel(7, 1, black);
        putPixel(8, 1, black);
        putPixel(9, 1, black);
        putPixel(10, 1, black);
        putPixel(11, 1, black);
        putPixel(12, 2, black);
        putPixel(13, 2, black);
        putPixel(14, 3, black);
        putPixel(15, 4, black);
        putPixel(15, 5, black);
        putPixel(16, 6, black);
        putPixel(16, 7, black);
        putPixel(16, 8, black);
        putPixel(16, 9, black);
        putPixel(16, 10, black);
        putPixel(16, 11, black);
        putPixel(15, 12, black);
        putPixel(14, 12, black);
        putPixel(14, 13, black);
        putPixel(14, 14, black);
        putPixel(13, 12, black);
      
       
        putPixel(13, 15, black);
        putPixel(12, 16, black);
        putPixel(11, 16, black);
        putPixel(10, 16, black);
        putPixel(9, 16, black);
        putPixel(8, 16, black);
        putPixel(7, 16, black);
        putPixel(6, 16, black);
        putPixel(5, 16, black);
        putPixel(4, 15, black);
        putPixel(3, 14, black);
        putPixel(3, 13, black);
        putPixel(8, 12, black);
    	
    	fillRect(6, 2, 4, 1, red);
    	fillRect(6, 3, 4, 1, red);
    	fillRect(5, 4, 6, 1, red);
    	fillRect(4, 5, 8, 1, red);
    	fillRect(2, 6, 5, 1, red);
    	fillRect(10, 6, 6, 1, red);
    	fillRect(2, 7, 4, 1, red);
    	fillRect(11, 7, 2, 1, red);
    	fillRect(15, 7, 1, 1, red);
    	fillRect(4, 8, 2, 1, red);
    	fillRect(11, 8, 1, 1, red);
        fillRect(3, 9, 4, 1, red);
        fillRect(10, 9, 2, 1, red);
        fillRect(2, 10, 11, 1, red);
        fillRect(15, 10, 1, 1, red);
        fillRect(2, 11, 3, 1, red);
        fillRect(13, 11, 3, 1, red);
        
        fillRect(4, 13, 10, 2, beige);
        fillRect(5, 12, 8, 1, beige);
        fillRect(5, 15, 8, 1, beige);
        putPixel(7, 12, black);
        putPixel(7, 13, black);
        putPixel(10, 12, black);
        putPixel(10, 13, black);
        drawSquareGrid(PIXEL_SIZE, Color.white);
        
        try {       
            ImageIO.write(image, "jpg", new File("hongo.jpg"));
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
    