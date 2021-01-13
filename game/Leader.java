package game;

import java.awt.*;

public class Leader {
    private int row;
    private int col;
    private String color;
    private int point;

    /**
     *
     * @author Vasil
     * @param  "това е визуализирането на една от пешките на име Leader върху бойното поле със нейните параметри и цвят"
     */

    public Leader(int row, int col) {
        this.row = row;
        this.col = col;


    }
    public void render(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillRect(287, 50, 35, 35);
    }
}
