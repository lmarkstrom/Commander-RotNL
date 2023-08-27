package main;

import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel{
    private Dimension dim = GameFrame.dim;

    public GamePanel(){
        this.setPreferredSize(dim);
    }
}
