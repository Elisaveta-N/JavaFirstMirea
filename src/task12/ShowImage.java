package task12;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

//https://www.baeldung.com/java-resize-image

public class ShowImage extends JPanel{

    private final BufferedImage resizedImage;

    public ShowImage(String imgPath, int width, int height) {
        Image image = new ImageIcon(imgPath).getImage();
        setPreferredSize(new Dimension(width, height));

        resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(image, 0, 0, width, height, null);
        graphics2D.dispose();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(resizedImage, 0, 0, this);
    }

    public static void main(String[] args)  {
        int w = 800;
        int h = 500;
        String path = "C:\\Users\\Lisa\\Desktop\\Web\\Лицо.png";
        if(args.length > 0) {
            path = args[0];
        }

        JFrame frame = new JFrame();
        ShowImage it = new ShowImage(path, w, h);
        frame.add(it);

        frame.setSize(w,h);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
