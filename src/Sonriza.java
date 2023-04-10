import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Sonriza {

    public static void main(String[] args) {
        int width = 400;
        int height = 400;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();

        // Dibuja el smiley
        g2.setColor(Color.YELLOW);
        g2.fillOval(100, 100, 200, 200);

        g2.setColor(Color.BLACK);
        g2.fillOval(150, 150, 25, 25);
        g2.fillOval(225, 150, 25, 25);
        g2.fill(new Arc2D.Double(125, 175, 150, 100, 0, -180, Arc2D.OPEN));

        // Guarda la imagen en un archivo JPEG
        try {
            File outputfile = new File("sonrisa.jpg");
            ImageIO.write(image, "jpg", outputfile);
            System.out.println("Todo bien");
        } catch (IOException e) {
            System.out.println("Error al guardar la imagen: " + e.getMessage());
        }
    }
}