package ex5_anonymous;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ex2_Frame {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		JButton btn = new JButton("버튼");
		
		f.setSize(300, 300);
		f.add(btn);
		f.setVisible(true);
		
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 //System.out.println("hi");
				System.exit(0);
			}
		});
		
	}//main
}
