package org.crazyit.ball;

import java.io.IOException;

import javax.swing.JFrame;

/**
 * ��Ϸ�����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @author Kelvin Mak kelvin.mak125@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class BallGame {
	/**
	 * ��ʼ��Ϸ
	 * 
	 * @return void
	 */
	/*
	* �����޸�:�����
	* �޸�����:
	* 	1.������ÿһ֡С��λ�Ƶľ���Ϊ1,ͨ���ı仭��ˢ�¶�ʱ����ʱ�����,�ı�С����ƶ��ٶ�(ʱ��Խ��С���ƶ�Խ��)
	*
	* */
	public static void main(String[] args) throws IOException {
		BallFrame ballFrame = new BallFrame();
		ballFrame.pack();
		ballFrame.setVisible(true);
		ballFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
