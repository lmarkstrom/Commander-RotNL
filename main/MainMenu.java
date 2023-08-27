package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMenu extends JPanel implements ActionListener{
    private Dimension dim = GameFrame.dim;
    private Color bgColor = new Color(165, 120, 114);
    private GameFrame window;
    private JLayeredPane layers;
    

    public MainMenu(GameFrame window){
        this. window = window;
        this.setPreferredSize(dim);
        this.setBackground(bgColor);
        
        layers = new JLayeredPane();
        layers.setPreferredSize(dim);
        setUpMenu();
        this.add(layers);
    }

    private void setUpMenu(){
        // Background image
        /* 
        Image dimg = background.getScaledInstance(background.getWidth()*3, background.getHeight()*3, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(dimg);
        JLabel bg = new JLabel(icon);
        bg.setBounds(0, 0, width, height);
        */
        
        // Start game button
        JButton startNewGame = new JButton("START NEW GAME");
        startNewGame.setActionCommand("start");
        startNewGame.addActionListener(this);
        startNewGame.setBounds(0, 200, 200, 50);

        // Exit
        JButton exit = new JButton("EXIT");
        exit.setActionCommand("exit");
        exit.addActionListener(this);
        exit.setBounds(0, 250, 200, 50);
        
        //layers.add(bg, JLayeredPane.DEFAULT_LAYER);
        layers.add(startNewGame, JLayeredPane.POPUP_LAYER);
        layers.add(exit, JLayeredPane.POPUP_LAYER);
        layers.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { 
        String actionStr = e.getActionCommand();
        if(actionStr.equals("start")){
            window.switchToGame();
        }else if(actionStr.equals("exit")){
            System.out.println("exit");
            window.dispose();
            window.setVisible(false);
            System.exit(0);
        }
    }
}