import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // Action �̺�Ʈ ������ �ޱ�
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);

	}	
	// ���� Ŭ������ Action �����ʸ� �ۼ��Ѵ�.
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) 
				b.setText("�׼�");
			else 
				b.setText("Action");
			
			// InnerClassListener�� ����� JFrame�� ����� ȣ���� �� ����
			InnerClassListener.this.setTitle(b.getText()); // �������� Ÿ��Ʋ�� ��ư ���ڿ��� ����Ѵ�. 
		}
	}	
	public static void main(String [] args) {
		new InnerClassListener();
	}
} 