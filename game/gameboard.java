package game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class gameboard extends JFrame {
    /**
     *
     * @author Vasil
     * @param "това е игралната дъска със координатите на съответните пешки и визуализирането на дъската "
     */
    private ArrayList<Object> pieceCollection;

    public gameboard() {
        this.pieceCollection = new ArrayList<>();
        //Green
        this.pieceCollection.add(new Guard2(1, 0));
        this.pieceCollection.add(new Guard2(1, 1));
        this.pieceCollection.add(new Guard2(1, 2));
        this.pieceCollection.add(new Guard2(1, 3));
        this.pieceCollection.add(new Guard2(1, 4));
        this.pieceCollection.add(new Leader2(1, 5));
        //center
        this.pieceCollection.add(new Circle(3,3));
        //Yellow
        this.pieceCollection.add(new Leader(5, 0));
        this.pieceCollection.add(new Guard(5, 1));
        this.pieceCollection.add(new Guard(5, 2));
        this.pieceCollection.add(new Guard(5, 3));
        this.pieceCollection.add(new Guard(5, 4));
        this.pieceCollection.add(new Guard(5, 5));


        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


    }

    @Override
    public void paint(Graphics g) {
        /**
         *
         * @author Vasil
         * @param "визуализиране на игралните пешки върху бойното поле чрез два for цикъла и повикване на точната им позиция чрез row,col"
         */

        super.paint(g);
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {

                GameTile tile = new GameTile(row, col);
                tile.render(g);

                Guard p1 = new Guard(row, col);
                p1.render(g);
                Guard p2 = new Guard(row, col);
                p2.render(g);
                Leader2 p3 = new Leader2(row, col);
                p3.render(g);
                Leader p4 = new Leader(row,col);
                p4.render(g);
                Circle p5 = new Circle(3,3);
                p5.render(g);
                Guard2 p6 = new Guard2(row,col);
                p6.render(g);
                GuardOutline1.GuardOutline p7 = new GuardOutline1.GuardOutline(row, col);
                p7.render(g);
                GuardOutline2.GuardOutline p8 = new GuardOutline2.GuardOutline(row, col);
                p8.render(g);

            }
        }

    }
}