/*
 * CrazyStartUI.java
 *
 * Created on __DATE__, __TIME__
 */

package ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import util.CloudThread;
import util.MoleThread;

/**
 * 
 * @author __USER__
 */
public class CrazyStartUI extends javax.swing.JFrame {

	/** Creates new form CrazyStartUI */
	public CrazyStartUI() {
		initComponents();
		setLocationRelativeTo(null);
		myInit();
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLayeredPane1 = new javax.swing.JLayeredPane();
		jLabelMole = new javax.swing.JLabel();
		jLabelEarthhole = new javax.swing.JLabel();
		jLabelTree = new javax.swing.JLabel();
		jLabelFan = new javax.swing.JLabel();
		jLabelMill = new javax.swing.JLabel();
		jLabelCloud1 = new javax.swing.JLabel();
		jLabelCloud2 = new javax.swing.JLabel();
		jLabelCloud3 = new javax.swing.JLabel();
		jLabelCloud4 = new javax.swing.JLabel();
		jLabelStart = new javax.swing.JLabel();
		jLabelTitle = new javax.swing.JLabel();
		jLabelBigicon = new javax.swing.JLabel();
		jLabelSun = new javax.swing.JLabel();
		jLabelMeadow = new javax.swing.JLabel();
		jLabelSky = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabelMole.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/mole.png"))); // NOI18N
		jLabelMole.setBounds(134, 465, 24, 34);
		jLayeredPane1.add(jLabelMole, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelEarthhole.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/ui/controls/earth_hole.png"))); // NOI18N
		jLabelEarthhole.setBounds(0, 490, 384, 27);
		jLayeredPane1.add(jLabelEarthhole,
				javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelTree.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/tree.png"))); // NOI18N
		jLabelTree.setBounds(40, 350, 51, 94);
		jLayeredPane1.add(jLabelTree, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelFan.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/fan.png"))); // NOI18N
		jLabelFan.setBounds(290, 380, 42, 42);
		jLayeredPane1.add(jLabelFan, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelMill.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/mill.png"))); // NOI18N
		jLabelMill.setText("jLabel1");
		jLabelMill.setBounds(300, 390, 23, 39);
		jLayeredPane1.add(jLabelMill, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelCloud1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/cloud4.png"))); // NOI18N
		jLabelCloud1.setBounds(300, 90, 48, 34);
		jLayeredPane1.add(jLabelCloud1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelCloud2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/cloud4.png"))); // NOI18N
		jLabelCloud2.setBounds(250, 10, 48, 34);
		jLayeredPane1.add(jLabelCloud2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelCloud3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/cloud5.png"))); // NOI18N
		jLabelCloud3.setBounds(90, 20, 54, 36);
		jLayeredPane1.add(jLabelCloud3, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelCloud4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/cloud5.png"))); // NOI18N
		jLabelCloud4.setBounds(30, 140, 54, 36);
		jLayeredPane1.add(jLabelCloud4, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelStart.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/start.png"))); // NOI18N
		jLabelStart.setBounds(100, 250, 194, 61);
		jLayeredPane1.add(jLabelStart, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/title.png"))); // NOI18N
		jLabelTitle.setBounds(80, 180, 242, 50);
		jLayeredPane1.add(jLabelTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelBigicon.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/bigicon.png"))); // NOI18N
		jLabelBigicon.setBounds(154, 73, 90, 90);
		jLayeredPane1
				.add(jLabelBigicon, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelSun.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/sun.png"))); // NOI18N
		jLabelSun.setBounds(130, 50, 137, 137);
		jLayeredPane1.add(jLabelSun, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelMeadow.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/meadow.png"))); // NOI18N
		jLabelMeadow.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {

			}
		});
		jLabelMeadow.setBounds(0, 0, 384, 512);
		jLayeredPane1.add(jLabelMeadow, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabelSky.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ui/controls/sky.png"))); // NOI18N
		jLabelSky.setBounds(0, 0, 384, 512);
		jLayeredPane1.add(jLabelSky, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
		// GEN-END:initComponents

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CrazyStartUI().setVisible(true);
			}
		});
	}

	private void myInit() {
		jLabelStart.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				new CrazyLoadingUI(1).setVisible(true);
				CrazyStartUI.this.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				changeImage("start_press.png");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				changeImage("start.png");
			}

		});
		new MoleThread(jLabelMole, 2).start();
		new CloudThread(jLabelCloud1, 1).start();
		new CloudThread(jLabelCloud2, 2).start();
		new CloudThread(jLabelCloud3, 1).start();
		new CloudThread(jLabelCloud4, 3).start();
	}

	private void changeImage(String iconName) {
		ImageIcon icon = new ImageIcon(getClass().getResource(
				"controls/" + iconName));
		jLabelStart.setIcon(icon);
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabelBigicon;
	private javax.swing.JLabel jLabelCloud1;
	private javax.swing.JLabel jLabelCloud2;
	private javax.swing.JLabel jLabelCloud3;
	private javax.swing.JLabel jLabelCloud4;
	private javax.swing.JLabel jLabelEarthhole;
	private javax.swing.JLabel jLabelFan;
	private javax.swing.JLabel jLabelMeadow;
	private javax.swing.JLabel jLabelMill;
	private javax.swing.JLabel jLabelMole;
	private javax.swing.JLabel jLabelSky;
	private javax.swing.JLabel jLabelStart;
	private javax.swing.JLabel jLabelSun;
	private javax.swing.JLabel jLabelTitle;
	private javax.swing.JLabel jLabelTree;
	private javax.swing.JLayeredPane jLayeredPane1;
	// End of variables declaration//GEN-END:variables

}