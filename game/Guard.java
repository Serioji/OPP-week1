package game;

import java.awt.*;

public class Guard {
    private int row;
    private int col;
    private String color;
    private int point;
    /**
     *
     * @author Vasil
     * @param  "това е визуализирането на една от пешките на име Guard върху бойното поле със нейните параметри и цвят"
     */
    public Guard(int row, int col) {
        this.row = row;
        this.col = col;

    }
    public void render(Graphics g) {

        g.setColor(Color.GREEN);
        g.fillOval(17, 48, 40, 40);
        g.setColor(Color.GREEN);
        g.fillOval(80, 48, 40, 40);
        g.setColor(Color.GREEN);
        g.fillOval(150, 48, 40, 40);
        g.setColor(Color.GREEN);
        g.fillOval(215, 48, 40, 40);
    }

}
