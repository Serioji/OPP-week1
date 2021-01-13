package game;

import java.awt.*;

public class Circle {
    private int row;
    private int col;
    private String color;
    private int point;
    /**
     *
     * @author Vasil
     * @param "това е метода за създаване на кръгчето по средата както е описано на домашната"
     */
    public Circle(int row,int col){
        this.row = row;
        this.col = col;

    }

    public void render(Graphics g) {


        g.setColor(Color.GRAY);
        g.fillOval(154, 190, 25, 25);
    }

}
