
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Kurama {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 1280;
    private static int height = 1280;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    
    static Color white 		= Color.white;
    static Color blue  		= Color.blue;
    static Color red   		= Color.red;
    static Color darkBlue 	= new Color(5,56,100);
    static Color softBlue 	= new Color(113,168,221);
    static Color darkOrange = new Color(212,60,54);
    static Color softOrange = new Color(252,109,3);
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    // Definimos la matriz de colores    
    private final static Color[][] PIXELS = {
        {white, white, 	white, 	white, 	white},
        {white, blue, 	blue, 	blue, 	white},
        {white, blue,	red,	blue, 	white},
        {white, blue, 	blue, 	blue, 	white},
        {white, white, 	white, 	white, 	white}
    };
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, softBlue);     
        drawHorizontalLine(3, 30, 28, Color.black);
        drawHorizontalLine(3, 30, 27, Color.black);
        drawHorizontalLine(4, 29, 26, Color.black);
        drawHorizontalLine(4, 28, 25, Color.black);
        drawHorizontalLine(3, 28, 24, Color.black);
        drawHorizontalLine(3, 29, 23, Color.black);
        drawHorizontalLine(3, 29, 22, Color.black);
        drawHorizontalLine(3, 30, 21, Color.black);
        drawHorizontalLine(3, 30, 20, Color.black);
        drawHorizontalLine(3, 31, 19, Color.black);
        drawHorizontalLine(2, 27, 18, Color.black);
        drawHorizontalLine(2, 29, 17, Color.black);
        drawHorizontalLine(2, 30, 16, Color.black);
        drawHorizontalLine(5, 30, 15, Color.black);
        drawHorizontalLine(5, 30, 14, Color.black);
        drawHorizontalLine(5, 30, 13, Color.black);
        drawHorizontalLine(6, 30, 12, Color.black);
        drawHorizontalLine(5, 29, 11, Color.black);
        drawHorizontalLine(5, 27, 10, Color.black);
        drawHorizontalLine(5, 27, 9, Color.black);
        drawHorizontalLine(5, 27, 8, Color.black);
        drawHorizontalLine(4, 27, 7, Color.black);
        drawHorizontalLine(4, 26, 6, Color.black);
        drawHorizontalLine(4, 26, 5, Color.black);
        drawHorizontalLine(4, 26, 4, Color.black);
        fillRect(24, 2, 3, 1, Color.black);
        fillRect(22, 3, 5, 1, Color.black);
        fillRect(20, 29, 2, 1, Color.black);
        fillRect(23, 29, 3, 1, Color.black);
        fillRect(7, 29, 3, 1, Color.black);
        fillRect(11, 29, 9, 1, Color.black);
        fillRect(13, 30, 7, 1, Color.black);
        
        fillRect(4, 21, 7, 4, darkOrange);
        fillRect(5, 25, 5, 1, darkOrange);
        fillRect(12, 22, 9, 2, darkOrange);
        drawHorizontalLine(4, 8, 27, softOrange);
        drawHorizontalLine(11, 11, 27, softOrange);
        drawHorizontalLine(11, 11, 26, softOrange);
        drawHorizontalLine(11, 11, 25, softOrange);
        drawHorizontalLine(13, 15, 27, softOrange);
        drawHorizontalLine(17, 19, 27, softOrange);
        drawHorizontalLine(17, 19, 28, softOrange);
        drawHorizontalLine(17, 19, 29, softOrange);
        drawHorizontalLine(18, 19, 26, softOrange);
        drawHorizontalLine(18, 19, 25, softOrange);
        drawHorizontalLine(13, 18, 25, softOrange);
        drawHorizontalLine(12, 19, 24, softOrange);
        drawHorizontalLine(13, 19, 23, softOrange);
        drawHorizontalLine(15, 17, 22, softOrange);
        drawHorizontalLine(15, 17, 21, softOrange);
        drawHorizontalLine(12, 21, 20, softOrange);
        drawHorizontalLine(10, 22, 19, softOrange);
        drawHorizontalLine(9, 16, 17, softOrange);
        drawHorizontalLine(18, 24, 17, softOrange);
        drawHorizontalLine(9, 15, 18, softOrange);
        drawHorizontalLine(17, 17, 18, softOrange);
        drawHorizontalLine(19, 23, 18, softOrange);
        drawHorizontalLine(3, 6, 17, softOrange);
        drawHorizontalLine(3, 7, 18, softOrange);
        drawHorizontalLine(4, 8, 19, softOrange);
        drawHorizontalLine(4, 9, 20, softOrange);
        drawHorizontalLine(5, 11, 21, softOrange);
        drawHorizontalLine(6, 10, 22, softOrange);
        drawHorizontalLine(7, 10, 23, softOrange);
        drawHorizontalLine(8, 8, 24, softOrange);
        drawHorizontalLine(13, 14, 26, softOrange);
        drawHorizontalLine(13, 15, 28, softOrange);
        drawHorizontalLine(13, 15, 29, softOrange);
        fillRect(9, 16, 1, 1, softOrange);
        fillRect(15, 16, 1, 1, softOrange);
        fillRect(19, 16, 6, 1, softOrange);
        fillRect(26, 13, 3, 4, softOrange);
        fillRect(26, 17, 1, 1, softOrange);
        fillRect(27, 12, 3, 1, softOrange);
        fillRect(6, 13, 1, 2, softOrange);
        fillRect(23, 25, 5, 1, softOrange);
        fillRect(24, 26, 5, 1, softOrange);
        fillRect(23, 20, 7, 1, softOrange);
        fillRect(22, 21, 7, 2, softOrange);
        fillRect(16, 15, 2, 1, softOrange);
        fillRect(16, 14, 2, 1, softOrange);
        fillRect(15, 13, 3, 1, softOrange);
        fillRect(13, 12, 5, 1, softOrange);
        fillRect(12, 11, 7, 1, softOrange);
        fillRect(10, 10, 10, 1, softOrange);
        fillRect(8, 9, 13, 1, softOrange);
        fillRect(7, 8, 15, 1, softOrange);
        fillRect(6, 7, 5, 1, softOrange);
        fillRect(5, 6, 5, 1, softOrange);
        fillRect(5, 5, 2, 1, softOrange);
        fillRect(19, 7, 4, 1, softOrange);
        fillRect(20, 6, 4, 1, softOrange);
        fillRect(21, 5, 4, 1, softOrange);
        fillRect(22, 4, 4, 1, softOrange);
        fillRect(24, 3, 2, 1, softOrange);
        fillRect(22, 15, 3, 1, softOrange);
        fillRect(23, 14, 1, 1, softOrange);
        fillRect(24, 13, 1, 1, softOrange);
        fillRect(14, 5, 1, 1, softOrange);
        fillRect(14, 6, 2, 1, darkOrange);
        fillRect(7, 28, 3, 1, darkOrange);
        fillRect(9, 27, 1, 1, darkOrange);
        fillRect(11, 28, 1, 1, darkOrange);
        fillRect(21, 28, 1, 1, darkOrange);
        fillRect(23, 28, 3, 1, darkOrange);
        fillRect(23, 27, 7, 1, darkOrange);
        fillRect(23, 26, 1, 1, darkOrange);
        fillRect(22, 24, 1, 1, darkOrange);
        fillRect(22, 23, 7, 1, darkOrange);
        fillRect(28, 22, 1, 1, darkOrange);
        fillRect(29, 20, 1, 2, darkOrange);
        fillRect(25, 18, 3, 1, darkOrange);
        fillRect(27, 17, 2, 1, darkOrange);
        fillRect(29, 13, 1, 4, darkOrange);
        fillRect(26, 10, 1, 2, darkOrange);
        fillRect(6, 15, 1, 1, darkOrange);
        fillRect(7, 14, 1, 3, darkOrange);
        fillRect(7, 4, 14, 1, softBlue);
        fillRect(10, 5, 3, 1, softBlue);
        fillRect(11, 6, 2, 1, softBlue);
        fillRect(17, 6, 2, 1, softBlue);
        fillRect(16, 5, 4, 1, softBlue);
        
        fillRect(13, 14, 2, 2, red);
        fillRect(12, 14, 1, 2, white);
        fillRect(19, 13, 2, 2, red);
        fillRect(21, 13, 1, 2, white);
        fillRect(14, 4, 1, 1, Color.black);
        
        drawSquareGrid(PIXEL_SIZE, softBlue);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("Kurama.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
   	    g.setColor(c);
    	for(int i=a;i<=b;i++){
    		 putPixel(x, i, c);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
    	g.setColor(c);
        for(int i=a;i<=b;i++){
        	 putPixel(i, y, c);
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