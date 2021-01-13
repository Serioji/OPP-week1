package game;

import java.awt.*;

public class GuardOutline1 {

    public static class GuardOutline {
        private int row;
        private int col;
        private String color;
        private int point;

        /**
         *
         * @author Vasil
         * @param  "това е визуализирането на outline на име GuardOutline което служи за обграждане на определената пешка във случия Guard"
         */
        public GuardOutline(int row, int col) {
            this.row = row;
            this.col = col;

    }
        public void render(Graphics g) {

            g.setColor(Color.YELLOW);
            g.fillOval(21, 51, 32, 32);
            g.setColor(Color.YELLOW);
            g.fillOval(84, 51, 32, 32);
            g.setColor(Color.YELLOW);
            g.fillOval(154, 51, 32, 32);
            g.setColor(Color.YELLOW);
            g.fillOval(219, 51, 32, 32);
        }

}
    }
