package org.crazyit.ball;

import javax.swing.*;

public class Score extends JTextField {

    private int score = 0;

    /**
     * @return 总分
     */
    public int getScore() {
        return score;
    }

    /**
     * 分数累加
     */
    public void setScore(int score) {
        this.score += score;
    }
}
