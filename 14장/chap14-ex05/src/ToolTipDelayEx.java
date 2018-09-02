import javax.swing.*;
import java.awt.*;

public class ToolTipDelayEx extends JFrame {
	public ToolTipDelayEx() {
		setTitle("���� ���� �ð� ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// ü�� �̹��� ���̺� ����
		JLabel cherryLabel = new JLabel(new ImageIcon("images/cherry.jpg"));
		cherryLabel.setToolTipText("ü�� �̹��� ���"); // ���� �ޱ�
		
		// ��� �̹��� ���̺� ����
		JLabel appleLabel = new JLabel(new ImageIcon("images/apple.jpg"));
		appleLabel.setToolTipText("��� �̹��� ���"); // ���� �ޱ�
		
		c.add(cherryLabel);
		c.add(appleLabel);
		
		// ToolTipManager ��ü�� ���
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0); // �ʱ� ���� ��� ���� �ð��� 0�ʷ� ����
		m.setDismissDelay(10000); // ���� ���� �ð��� 10�ʷ� ����
		
		setSize(400,220);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ToolTipDelayEx();
	}
} 