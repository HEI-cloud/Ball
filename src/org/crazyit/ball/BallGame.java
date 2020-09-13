package org.crazyit.ball;

import java.io.IOException;

import javax.swing.JFrame;

/**
 * 游戏入口类
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @author Kelvin Mak kelvin.mak125@gmail.com
 * @version  1.0
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class BallGame {
	/**
	 * 开始游戏
	 * 
	 * @return void
	 */
	/*
	* 二次修改:林青彪
	* 修改内容:
	* 	1.更改了每一帧小球位移的距离为1,通过改变画面刷新定时器的时间参数,改变小球的移动速度(时间越短小球移动越长)
	*
	* */
	public static void main(String[] args) throws IOException {
		BallFrame ballFrame = new BallFrame();
		ballFrame.pack();
		ballFrame.setVisible(true);
		ballFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
