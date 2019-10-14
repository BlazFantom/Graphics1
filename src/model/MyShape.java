package model;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

public class MyShape {
    private RectangularShape shape;

    public MyShape(RectangularShape shape) {
        this.shape = shape;
    }
    public void setFrame(Point2D[] p){
        shape.setFrameFromDiagonal(p[0], p[1]);

    }

    public void draw(Graphics2D g2) {
        g2.draw(shape);
    }


}
