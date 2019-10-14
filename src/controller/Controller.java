package controller;

import graphics.Frame;
import graphics.Panel;
import model.Model;
import model.MyShape;

import java.awt.*;
import java.awt.geom.Point2D;

public class Controller {
    private MyShape shape;
    private Model model;

    Point2D[] point = new Point2D[2];
    public Controller() {
        this.model = new Model();
        Panel panel = new Panel(this);
        model.addObserver(panel);
        Frame frame = new Frame(panel);
    }
    public void press(Point2D p) {
        point[0] = p;
        model.addShape();
    }
    public void action(Point2D p) {
        point[1] = p;
        model.setFrame(point);
    }
    public void draw(Graphics2D g2) {
        model.draw(g2);
    }
}