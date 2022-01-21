package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.sql.Array;

public class RandomColorCode extends JFrame {

    JPanel jPanel;
    public void paint(Graphics g) {
        super.paint(g);
        int sizeX = this.getWidth()/8;
        int sizeY=this.getWidth()/12;
        for(int x=0;x<sizeX;x++)
            for(int y=0;y<sizeY;y++) {
                g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));//This just creates a random color, you can replace this with anything else
                g.fillRect(x*sizeX,y*sizeY,sizeX,sizeY);//Creates the grid
            }
    }
}
