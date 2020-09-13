package org.crazyit.ball;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
 * ���浯����Ϸ�������ĸ���
 *
 * @author yangenxiong yangenxiong2009@gmail.com
 * @author Kelvin Mak kelvin.mak125@gmail.com
 * @version 1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class BallComponent {
    // ����x����
    private int x = -1;
    // ����y����
    private int y = -1;
    // ����ͼƬ
    private Image image = null;
    // ����ͼƬ�ٶ�
    private int speed = 5;
    //HEI:ͼ���Ⱥ͸߶�
    private int imgHeight = 0;
    private int imgWidth = 0;


    /**
     * ������
     *
     * @param path String ͼƬ·��
     */
    public BallComponent(String path) throws IOException {
        super();
        this.image = ImageIO.read(new File(path));
    }

    /**
     * ������
     *
     * @param panelWidth  int ������
     * @param panelHeight int ����߶�
     * @param path        String ͼƬ·��
     */
    public BallComponent(int panelWidth, int panelHeight, String path)
            throws IOException {
        super();
        // ��ȡͼƬ
        this.image = ImageIO.read(new File(path));
        // ����x����
        this.x = (int) ((panelWidth - image.getWidth(null)) / 2);
        this.y = (int) (panelHeight - image.getHeight(null));
        //HEI:���ÿ�Ⱥ͸߶�
        this.imgWidth = image.getWidth(null);
        this.imgHeight = image.getHeight(null);
    }


    /**
     * ������
     *
     * @param x    int ͼ���x����
     * @param y    int ͼ���y����
     * @param path String ͼƬ·��
     */
    public BallComponent(String path, int x, int y) throws IOException {
        super();
        // ��ȡͼƬ
        this.image = ImageIO.read(new File(path));
        this.x = x;
        this.y = y;
    }

    /**
     * HEI
     * ��ȡͼƬ�߶ȺͿ��
     */

    public int getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(int imgHeight) {
        this.imgHeight = imgHeight;
    }

    public int getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(int imgWidth) {
        this.imgWidth = imgWidth;
    }


    /**
     * ��ȡx����
     *
     * @return int x����
     */
    public int getX() {
        return this.x;
    }

    /**
     * ��ȡy����
     *
     * @return int y����
     */
    public int getY() {
        return this.y;
    }

    /**
     * ��ȡͼƬ�ٶ�
     *
     * @return int ͼƬ�ٶ�
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * ����x����
     *
     * @param x int x����
     * @return void
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * ����y����
     *
     * @param y int y����
     * @return void
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * ����ͼƬ
     *
     * @return Image ͼƬ
     */
    public Image getImage() {
        return this.image;
    }
}