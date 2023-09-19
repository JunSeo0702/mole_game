import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private final Image background;
    public MyFrame(){

        background = new ImageIcon(MyFrame.class.getResource("/img.png")).getImage();

        setTitle("mole_game");
        setSize(1600,1000);
        setLocationRelativeTo(null);
        setResizable(false); //창의 크기 변경x
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.drawImage(background, 0, 0, null);

    }
}
