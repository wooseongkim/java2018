import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel(); // �� ���̺� ������Ʈ ����
	
	public KeyCodeEx() {
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300,150);
		setVisible(true);
		
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		c.setFocusable(true);
		c.requestFocus();
	}
	
	// Key ������ ����
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			// la�� �Էµ� Ű�� Ű �̸� ���ڿ��� ����Ͽ� ����ڿ��� ������
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+"Ű�� �ԷµǾ���");

			if(e.getKeyChar() == '%') // �Էµ� Ű��  % �� ���
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1) // �Էµ� Ű�� <F1> �ΰ�
				contentPane.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String [] args) {
		new KeyCodeEx();
	}
}