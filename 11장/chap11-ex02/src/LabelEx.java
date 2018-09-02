import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// ���ڿ� ���̺� ����
		JLabel textLabel = new JLabel("����մϴ�.");
		
		// �̹��� ���̺� ����
		ImageIcon beauty = new ImageIcon("images/beauty.jpg"); // �̹��� �ε�
		JLabel imageLabel = new JLabel(beauty); // �̹��� ���̺� ����
		
		// ���ڿ��� �̹����� ��� ���� ���̺� ����
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif"); // �̹��� �ε�
		JLabel label = new JLabel("��������� ��ȭ�ϼ���", 
			normalIcon, SwingConstants.CENTER); // ���̺� ����

		// ����Ʈ�ҿ� 3���� ���̺� ����
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400,600);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new LabelEx();
	}
}