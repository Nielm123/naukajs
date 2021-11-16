package com.demo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.Path2D;

class Figury extends JPanel {
    @Override
    public void paint(Graphics g) {

        setSize(500, 500);

        // Prostokąt
        g.drawRect(200, 50, 200, 25);
        g.setColor(Color.CYAN);
        g.fillRect(200, 50, 200, 25);

        // Koło
        g.drawOval(300, 300, 200, 200);
        g.setColor(Color.GREEN);
        g.fillOval(300, 300, 200, 200);

        // Wielobok
        int[] pentagonXs = {250, 350, 300, 200, 150};
        int[] pentagonYs = {100, 200, 300, 300, 200};
        g.drawPolygon(pentagonXs, pentagonYs, pentagonXs.length);
        g.setColor(Color.YELLOW);
        g.fillPolygon(pentagonXs, pentagonYs, pentagonXs.length);

        // Lamana
        g.setColor(Color.BLACK);
        int[] wartx = {50, 100, 130, 130, 70};
        int[] warty = {50, 35, 100, 35, 100};
        g.drawPolygon(wartx, warty, wartx.length);

        // Krzywa
        g.setColor(Color.RED);
        Graphics g2d = (Graphics2D) g;
        Path2D.Double curve = new Path2D.Double();
        curve.moveTo(40, 400);
        curve.curveTo(25, 250, 100, 300, 120, 400);
        ((Graphics2D) g2d).draw(curve);
        curve.moveTo(120,400);
        curve.curveTo(50, 350, 150, 200, 200, 333);
        ((Graphics2D) g2d).draw(curve);
    }

    public static void main(String[] args) {

        JFrame MainFrame = new JFrame();
        MainFrame.setSize(800, 800);

        Figury CirclePanel = new Figury();

        MainFrame.add(CirclePanel);
        MainFrame.setVisible(true);
    }
}