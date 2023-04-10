import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class GuardarCasa {

    public static void main(String[] args) {
        int width = 600;
        int height = 400;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();

        // Dibuja el cielo
        GradientPaint gradient = new GradientPaint(0, 0, Color.CYAN, 0, height, Color.BLUE);
        g2.setPaint(gradient);
        g2.fillRect(0, 0, width, height / 2);

        // Dibuja el pasto
        g2.setColor(Color.GREEN);
        g2.fillRect(0, height / 2, width, height / 2);

        // Dibuja el cuerpo de la casa
        g2.setColor(new Color(255, 228, 196));
        g2.fillRect(150, 150, 300, 200);

        // Dibuja el techo de la casa
        g2.setColor(new Color(139, 69, 19));
        int[] xPoints = {150, 300, 450};
        int[] yPoints = {150, 100, 150};
        Polygon polygon = new Polygon(xPoints, yPoints, 3);
        g2.fillPolygon(polygon);

        // Dibuja la puerta de la casa
        g2.setColor(Color.RED);
        g2.fillRect(275, 250, 50, 100);

        // Dibuja la ventana de la casa
        g2.setColor(Color.WHITE);
        g2.fillRect(175, 200, 50, 50);
        g2.fillRect(375, 200, 50, 50);

        // Guarda la imagen en un archivo JPEG
        try {
            File outputfile = new File("casa.jpg");
            ImageIO.write(image, "jpg", outputfile);
            System.out.println("Todo bien");
        } catch (IOException e) {
            System.out.println("Error al guardar la imagen: " + e.getMessage());
        }
    }
}