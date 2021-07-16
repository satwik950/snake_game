package com.company;

import javax.swing.*;
// this class is used to create a window based application and it has default attributes to support the same
public class GameFrame extends JFrame {

    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
