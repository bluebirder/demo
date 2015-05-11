/* 
 * @(#)Gardener.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.abstractfactory;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Robin
 */
public class Gardener extends JFrame implements ActionListener, ItemListener {
    private static final long serialVersionUID = -3279705435834522974L;

    private Checkbox Elegant, Practical, LasyBoy;
    private Button Center, Border, Shade, Quit;
    private Garden garden = null;
    private GardenPanel gardenPlot;
    private String borderPlant = "", centerPlant = "", shadePlant = "";

    public Gardener() {
        super("屋顶花园规划");
        setGUI();
    }

    // ----------------------------------
    private void setGUI() {
        setBackground(Color.lightGray);
        setLayout(new GridLayout(1, 2));
        Panel left = new Panel();
        add(left);
        Panel right = new Panel();
        add(right);
        left.setLayout(new GridLayout(4, 1));
        left.add(new JLabel("花园类型"));
        CheckboxGroup grp = new CheckboxGroup();
        Elegant = new Checkbox("典雅型", grp, false);
        Practical = new Checkbox("实用型", grp, false);
        LasyBoy = new Checkbox("懒人型", grp, false);
        left.add(Elegant);
        left.add(Practical);
        left.add(LasyBoy);
        Elegant.addItemListener(this);
        LasyBoy.addItemListener(this);
        Practical.addItemListener(this);
        right.setLayout(new GridLayout(2, 1));
        gardenPlot = new GardenPanel();
        gardenPlot.setBackground(Color.white);
        Panel botRight = new Panel();
        right.add(gardenPlot);
        right.add(botRight);
        Center = new Button("中间");
        Border = new Button("墙边");
        Shade = new Button("花台");
        Quit = new Button("退出");
        botRight.add(Center);
        Center.addActionListener(this);
        botRight.add(Border);
        Border.addActionListener(this);
        botRight.add(Shade);
        Shade.addActionListener(this);
        botRight.add(Quit);
        Quit.addActionListener(this);
        setBounds(200, 200, 400, 300);
        setVisible(true);
    }

    // ----------------------------------
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == Center)
            setCenter();
        if (obj == Border)
            setBorder();
        if (obj == Shade)
            setShade();
        if (obj == Quit)
            System.exit(0);
    }

    // ----------------------------------
    private void setCenter() {
        if (garden != null) {
            centerPlant = garden.getCenter().getName();
        }
        gardenPlot.repaint();
    }

    private void setBorder() {
        if (garden != null)
            borderPlant = garden.getBorder().getName();
        gardenPlot.repaint();
    }

    private void setShade() {
        if (garden != null)
            shadePlant = garden.getShade().getName();
        gardenPlot.repaint();
    }

    // ----------------------------------
    @Override
    public void itemStateChanged(ItemEvent e) {
        Checkbox ck = (Checkbox) e.getSource();
        garden = new GardenMaker().getGarden(ck.getLabel());
        shadePlant = "";
        centerPlant = "";
        borderPlant = "";
        gardenPlot.repaint();
    }

    // ----------------------------------
    static public void main(String[] argv) {
        new Gardener();
    }

    // --------------------------------
    private class GardenPanel extends Panel {
        private static final long serialVersionUID = -8379476449152416769L;

        @Override
        public void paint(Graphics g) {
            Dimension sz = getSize();
            g.setColor(Color.lightGray);
            g.fillArc(0, 0, 80, 80, 0, 360);
            g.setColor(Color.black);
            g.drawRect(0, 0, sz.width - 1, sz.height - 1);
            g.drawString(centerPlant, 100, 50);
            g.drawString(borderPlant, 75, 120);
            g.drawString(shadePlant, 10, 40);
        }
    }
}
