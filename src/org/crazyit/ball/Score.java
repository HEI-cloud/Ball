package org.crazyit.ball;

import javax.swing.*;

public class Score extends JTextField {

    private int score = 0;

    /**
     * @return �ܷ�
     */
    public int getScore() {
        return score;
    }

    /**
     * �����ۼ�
     */
    public void setScore(int score) {
        this.score += score;
    }
}
