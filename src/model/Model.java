package model;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable {
    ArrayList<MyShape> array;
    MyShape currentShape;

    public Model() {
        array = new ArrayList<>();
    }
    public void addShape() {
        currentShape = new MyShape(new Rectangle2D.Double());
        array.add(currentShape);
    }
    public void setFrame(Point2D[] point) {
        currentShape.setFrame(point);
        setChanged();
        notifyObservers();
    }
    public void draw(Graphics2D g2) {
        for (MyShape x : array) {
            x.draw(g2);
        }
    }
}
