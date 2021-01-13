package game;

import java.awt.*;

public class Leader2 {
    private int row;
    private int col;
    private int point;

    /**
     *
     * @author Vasil
     * @param  "това е визуализирането на една от пешките на име Leader2 върху бойното поле със нейните параметри и цвят"
     */

    public Leader2(int row, int col) {
        this.row = row;
        this.col = col;



    }
    public void render(Graphics g) {

        g.setColor(Color.GREEN);
        g.fillRect(17, 323, 35, 35);
    }

}
