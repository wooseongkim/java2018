import javax.swing.*;
import java.awt.*;

public class ToolTipEx extends JFrame {
	private Container contentPane;
	
	public ToolTipEx() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400,150);
		setVisible(true);
	}
	
	// ���ٸ� �����Ͽ� ����Ʈ���� NORTH�� �����Ѵ�.
	private void createToolBar() {
		JToolBar bar = new JToolBar("Kitae Menu"); // ���� ����
		bar.setBackground(Color.LIGHT_GRAY);
		
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("������ �����մϴ�."); // New ��ư�� ���� �ޱ�
		bar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
		openBtn.setToolTipText("������ ���ϴ�."); // ���� ��ư�� ���� �ޱ�
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("������ �����մϴ�."); // ���� ��ư�� ���� �ޱ�
		bar.add(saveBtn);		
		bar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("ã�����ϴ� ���ڿ��� �Է��ϼ���"); // �ؽ�Ʈ�ʵ忡 ���� �ޱ�
		bar.add(tf);
		contentPane.add(bar, BorderLayout.NORTH);
	}
	
	public static void main(String [] args) {
		new ToolTipEx();
	}
}