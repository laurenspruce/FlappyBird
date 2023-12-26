package Loz;

import javax.swing.*;
import java.awt.*;


public class BirdRenderer extends JPanel {

    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        FlappyBird.flappyBird.repaint(g);
    }

}
