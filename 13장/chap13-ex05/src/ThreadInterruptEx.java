import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel; // Ÿ�̸� ���� ��µ� ���̺�
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	// ������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n=0; // Ÿ�̸� ī��Ʈ ��
		while(true) { // ���� ����
			timerLabel.setText(Integer.toString(n)); // Ÿ�̸� ���� ���̺� ���
			n++; // ī��Ʈ ����
			try {
				Thread.sleep(1000); // 1�ʵ��� ���� �ܴ�.
			}
			catch(InterruptedException e) {
				return; // ���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}

public class ThreadInterruptEx extends JFrame {
	private Thread th;
	public ThreadInterruptEx() {
		setTitle("ThreadInterruptEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		// Ÿ�̸� ������� ����� Runnable ��ü ����
		// Ÿ�̸� ���� ����� ���̺� ������Ʈ�� �����ڿ� �����Ѵ�.
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable); // ������ ����
		c.add(timerLabel);
		
		// ��ư�� �����ϰ� Action ������ ���
		JButton btn =new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); // Ÿ�̸� ������ ���� ����
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); // ��ư ��Ȱ��ȭ
			}
		});
		c.add(btn);
		
		setSize(300,170);
		setVisible(true);
		
		th.start(); // ������ ���۽�Ŵ
	}
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}
}