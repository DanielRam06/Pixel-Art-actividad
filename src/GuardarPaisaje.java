import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class GuardarPaisaje {

    public static void main(String[] args) {
        int width = 600;
        int height = 400;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();

        // Invierte el cielo
        GradientPaint gradient = new GradientPaint(0, 0, new Color(118, 185, 255), 0, height, new Color(250, 228, 165));
        g2.setPaint(gradient);
        g2.fillRect(0, 0, width, height);

        // Dibuja el sol
        g2.setColor(Color.YELLOW);
        g2.fillOval(100, 50, 100, 100);

        // Dibuja las montañas
        g2.setColor(new Color(139, 69, 19));
        int[] xPoints1 = {50, 200, 350};
        int[] yPoints1 = {height / 2 + 50, height / 4 + 50, height / 2 + 50};
        Polygon polygon1 = new Polygon(xPoints1, yPoints1, 3);
        g2.fillPolygon(polygon1);

        int[] xPoints2 = {250, 400, 550};
        int[] yPoints2 = {height / 2 + 50, height / 6 + 100, height / 2 + 50};
        Polygon polygon2 = new Polygon(xPoints2, yPoints2, 3);
        g2.fillPolygon(polygon2);

        int[] xPoints3 = {475, 525, 575};
        int[] yPoints3 = {height / 2 + 50, height / 4 + 100, height / 2 + 50};
        Polygon polygon3 = new Polygon(xPoints3, yPoints3, 3);
        g2.fillPolygon(polygon3);

        // Dibuja las nubes en la parte superior derecha
        g2.setColor(Color.WHITE);
        g2.fillOval(400, 20, 50, 50);
        g2.fillOval(450, 20, 50, 50);
        g2.fillOval(430, 50, 50, 50);
        g2.fillOval(460, 50, 50, 50);
        g2.fillOval(490, 50, 50, 50);
        g2.fillOval(380, 50, 50, 50);

        // Guarda la imagen en un archivo JPEG
        try {
            File outputfile = new File("piramides.jpg");
            ImageIO.write(image, "jpg", outputfile);
            System.out.println("Todo bien");
        } catch (IOException e) {
            System.out.println("Error al guardar la imagen: " + e.getMessage());
        }
    }
}