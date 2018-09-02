import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag=false; // �������� ���� ����� ǥ���ϴ� �÷���. true : ���� ����
	
	public RandomThread(Container contentPane) { 
		this.contentPane = contentPane;
	}
	
	public void finish() { // ������ ���� ����� flag�� ǥ��
		flag = true;
	} 
	
	@Override
	public void run() {
		while(true) { 
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("java"); //�� ���̺� ����
			label.setSize(80, 30); // ���̺��� ũ�� 80x30
			label.setLocation(x, y); // ���̺��� ����Ʈ�� ���� ������ ��ġ�� ����
			contentPane.add(label); // ���̺��� ����Ʈ�ҿ� �߰�
			contentPane.repaint(); // ����Ʈ���� �ٽ� �׷� �߰��� ���̺��� ���̰� ��
			try {
				Thread.sleep(300); // 0.3�� ���� ���� �ܴ�.
				if(flag==true) {
					contentPane.removeAll(); // ����Ʈ�ҿ� �ִ� ��� ���̺� ����
					label = new JLabel("finish"); 
					label.setSize(80, 30); // ��Java�� ���̺��� ũ�� 80x30
					label.setLocation(100, 100); // ���̺��� ����Ʈ�� ���� ������ ��ġ�� ����
					label.setForeground(Color.RED);
					contentPane.add(label); // ��finish�� ���̺� �ޱ�
					contentPane.repaint(); // ����Ʈ���� �ٽ� �׷� �߰��� ���̺��� ���̰� ��
					return; // ������ ����
				}
			}
			catch(InterruptedException e) { return; }
		}
	}
}

public class ThreadFinishFlagEx extends JFrame {
	private RandomThread th; // ������ ���۷���
	
	public ThreadFinishFlagEx() {
		setTitle("ThreadFinishFlagEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		c.addMouseListener(new MouseAdapter() { // ���콺 ������ ���
			@Override
			public void mousePressed(MouseEvent e) {
				th.finish(); // RandomThread ������ ���� ���
			}
		});
		setSize(300,200);
		setVisible(true);

		th = new RandomThread(c); // ������ ����, �����忡 ����Ʈ�� ����
		th.start(); // ������ ����
	}

	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}
}