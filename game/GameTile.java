package game;

import java.awt.*;

public class GameTile{
    private int row;
    private int col;
    private int tileSize;
    private static Color orange = new Color(255, 165, 0);
    private static Color grey = new Color(128, 128, 128);
    /**
     *
     * @author Vasil
     * @param "това е конструктора за големината на ходните полета и инициализирането им на бойното поле"
     */
    public GameTile(int row, int col) {

        this.row = row;
        this.col = col;
        this.tileSize = 100;
    }
//Тръгна Със for цикли до определен момент динамично и след това цялата дъска стана бяла и го правя статично извиняваи Коце предварително
    public void render(Graphics g) {
        /**
         *
         * @author Vasil
         * @param "това е визуализирането на бойното поле със съответния му цвят и параметри за изчисляването на големината му"
         */

        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;


                    g.setColor(orange);
                    g.fillRect(0, 1 ,69,100);
                    g.setColor(Color.black);
                    g.fillRect(69,  32,69 ,69);
                    g.setColor(Color.white);
                    g.fillRect(134,  32,69 ,69);
                    g.setColor(Color.black);
                    g.fillRect(200,  32,69 ,69);
                    g.setColor(orange);
                    g.fillRect(269,  32,69 ,69);
                    g.setColor(grey);
                    g.fillRect(0,  100,69 ,69);
                    g.setColor(grey);
                    g.fillRect(68,  100,66 ,69);
                    g.setColor(Color.white);
                    g.fillRect(135,  100,65 ,69);
                    g.setColor(grey);
                    g.fillRect(200,  100,69 ,69);
                    g.setColor(grey);
                    g.fillRect(269 ,100 ,69,69);
                    g.setColor(Color.white);
                    //nice
                    g.fillRect(0,169,69,69);
                    g.setColor(Color.white);
                    g.fillRect(69,169,65,69);
                    g.setColor(Color.white);
                    g.fillRect(134,169,66,69);
                    g.setColor(Color.white);
                    g.fillRect(200,169,69,69);
                    g.setColor(Color.white);
                    g.fillRect(269,169,69,69);
                    g.setColor(grey);
                    g.fillRect(0,  237,69 ,69);
                    g.setColor(grey);
                    g.fillRect(68,  237,69 ,69);
                    g.setColor(Color.white);
                    g.fillRect(134,  237,69 ,69);
                    g.setColor(grey);
                    g.fillRect(202,  237,69 ,69);
                    g.setColor(grey);
                    g.fillRect(272,  237,66 ,69);
                    g.setColor(Color.black);
                    g.fillRect(0,  305,66 ,69);
                    g.setColor(orange);
                    g.fillRect(66,  305,68 ,69);
                    g.setColor(Color.white);
                    g.fillRect(135,  305,68 ,69);
                    g.setColor(orange);
                    g.fillRect(202,  305,69 ,69);
                    g.setColor(Color.black);
                    g.fillRect(271,  305,67 ,69);

    }

                }










