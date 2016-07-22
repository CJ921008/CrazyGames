package util;

import java.util.Random;

import javax.swing.JLabel;

public class CloudThread extends Thread {
	private JLabel jlabel=new JLabel();
	private int speed;
	public CloudThread (JLabel jlabel,int speed){
		this.jlabel=jlabel;
		this.speed=speed;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Random random=new Random();
				boolean go=random.nextBoolean();
				jlabel.setLocation(jlabel.getX()+(go?2:-1),jlabel.getY());
				Thread.sleep(500/speed);				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}
	
}
