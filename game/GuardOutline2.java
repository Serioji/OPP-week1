package game;

import java.awt.*;

public class GuardOutline2 {

    public static class GuardOutline {
        private int row;
        private int col;
        private String color;
        private int point;

        /**
         *
         * @author Vasil
         * @param  "това е визуализирането на outline на име GuardOutline което служи за обграждане на определената пешка във случия Guard2"
         */

        public GuardOutline(int row, int col) {
            this.row = row;
            this.col = col;

        }
        public void render(Graphics g) {

            g.setColor(Color.GREEN);
            g.fillOval(290, 324,  32, 32);
            g.setColor(Color.GREEN);
            g.fillOval(225, 324, 32, 32);
            g.setColor(Color.GREEN);
            g.fillOval(156, 324, 32, 32);
            g.setColor(Color.GREEN);
            g.fillOval(86, 324, 32, 32);
        }

    }
}