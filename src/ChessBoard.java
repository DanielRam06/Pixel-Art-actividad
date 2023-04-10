import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ChessBoard {
    private static int width = 800;
    private static int height = 800;
    private static int BOARD_SIZE = 8;
    private static int SQUARE_SIZE = width / BOARD_SIZE;

    static Color whiteColor = Color.white;
    static Color blackColor = Color.black;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    public static void drawBoard() {
        Graphics2D g = image.createGraphics();
        
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                Color squareColor;
                
                if ((row + col) % 2 == 0) {
                    squareColor = whiteColor;
                } else {
                    squareColor = blackColor;
                }
                
                g.setColor(squareColor);
                g.fillRect(col * SQUARE_SIZE, row * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            }
        }

        try {       
            ImageIO.write(image, "jpg", new File("chess_board.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        drawBoard();
    }
}
