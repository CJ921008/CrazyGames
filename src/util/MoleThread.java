package util;

import javax.swing.JLabel;

public class MoleThread extends Thread {
	private JLabel jlabel = new JLabel();
	private int speed;
	
	public MoleThread(JLabel jlabel,int speed){
		this.jlabel=jlabel;
		this.speed=speed;
	}
	@Override
	public void run() {
		while (true) {
			try {
				jlabel.setLocation(jlabel.getX(), 465);
				Thread.sleep(500/speed);
				jlabel.setLocation(jlabel.getX(), 450);
				Thread.sleep(500/speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
