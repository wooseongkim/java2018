import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OptionPaneEx extends JFrame {
	public OptionPaneEx() {
		setTitle("�ɼ� �� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(500,200);
		c.add(new MyPanel(), BorderLayout.NORTH);
		setVisible(true);
	}
	
	class MyPanel extends Panel {
		private JButton inputBtn = new JButton("Input Name");
		private JTextField tf = new JTextField(10);
		private JButton confirmBtn = new JButton("Confirm");
		private JButton messageBtn = new JButton("Message");
		
		public MyPanel() {
			setBackground(Color.LIGHT_GRAY);
			add(inputBtn);
			add(confirmBtn);
			add(messageBtn);
			add(tf);
			
			inputBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// �Է� ���̾�α� ����
					String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
					if(name != null)
						tf.setText(name); // ����ڰ� �Է��� ���ڿ��� �ؽ�Ʈ�ʵ� â�� ���
				}
			});

			confirmBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Ȯ�� ���̾�α� ����
					int result = JOptionPane.showConfirmDialog(null, 
							"����� ���Դϱ�?", "Confirm", JOptionPane.YES_NO_OPTION);

					// ����ڰ� ������ ��ư�� ���� ���ڿ��� �ؽ�Ʈ�ʵ� â�� ���
					if(result == JOptionPane.CLOSED_OPTION)
						tf.setText("Just Closed without Selection");
					else if(result == JOptionPane.YES_OPTION)
						tf.setText("Yes");
					else
						tf.setText("No");
				}
			});
			
			messageBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// �޽��� ���̾�α� ����
					JOptionPane.showMessageDialog(null, "�����ϼ���", "Message", JOptionPane.ERROR_MESSAGE); 
				}
			});
		}
	}

	public static void main(String [] args) {
		new OptionPaneEx();
	}
}