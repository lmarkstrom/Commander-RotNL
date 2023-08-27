package main;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{
    private JPanel cards;
    private CardLayout cardLayout;

    private MainMenu menuPanel;
    private GamePanel gamePanel;

    // Constants
    public static final Dimension dim = new Dimension(800, 600);

    public GameFrame(){
        cards = new JPanel(new CardLayout());
        cardLayout = (CardLayout) cards.getLayout();

        menuPanel = new MainMenu(this); 
        gamePanel = new GamePanel();

        cards.add(menuPanel, "mainmenu");
        cards.add(gamePanel, "gamePanel");  

        this.add(cards);

        // Show the menu panel initially
        cardLayout.show(cards, "menu");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("COMMANDER: Rise of the Northern Lion");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    // Method to switch to the gamepanel
    public void switchToGame() {
        cardLayout.show(cards, "gamePanel");
    }

    // Method to switch to the menupanel
    public void switchToMenu() {
        cardLayout.show(cards, "mainmenu");
    }
}
