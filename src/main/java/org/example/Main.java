package org.example;

import components.Dino;
import components.GamePanel;
import components.Ground;

import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame mainWindow = new JFrame();
    public static int WIDTH = 800;
    public static int HEIGHT = 800;

    public void createAndShowUI() {
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container conteiner = mainWindow.getContentPane();
        GamePanel gamePanel = new GamePanel(WIDTH, HEIGHT);
        gamePanel.addKeyListener(gamePanel);
        gamePanel.setFocusable(true);

        conteiner.setLayout(new BorderLayout());
        conteiner.add(gamePanel, BorderLayout.CENTER);
        mainWindow.setSize(WIDTH, HEIGHT);
        mainWindow.setResizable(false);
        mainWindow.setVisible(true);

        Dino aixend = new Dino();
        aixend.setJumpFactor(20);
        Ground ground = new Ground(HEIGHT);
        gamePanel.setObstacleIntervalAndSpeed(300, 7);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().createAndShowUI();
            }
        });
    }
}

