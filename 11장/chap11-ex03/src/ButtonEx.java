import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 3���� �̹����� ���Ϸκ��� �о���δ�.
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif"); 
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif"); 
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif"); 
		
		// 3���� �̹����� ���� ��ư ����
		JButton btn = new JButton("call~~", normalIcon); // normalIcon�� �̹��� ���
		btn.setPressedIcon(pressedIcon); // pressedIcon�� �̹��� ���
		btn.setRolloverIcon(rolloverIcon); // rolloverIcon�� �̹��� ���
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ButtonEx();
	}
}