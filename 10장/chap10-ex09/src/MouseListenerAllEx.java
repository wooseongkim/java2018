import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event"); // �޽��� ��� ���̺� ������Ʈ
	
	public MouseListenerAllEx() {
		setTitle("MouseListener�� MouseMotionListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener	listener = new MyMouseListener(); // ������ ��ü ����
		c.addMouseListener(listener); 		// MouseListener ������ ���
		c.addMouseMotionListener(listener); // MouseMotionListener ������ ���
		
		c.add(la);
		setSize(300,200);
		setVisible(true);
	}
	
	// Mouse �����ʿ� MouseMotion �����ʸ� ��� ���� ������ �ۼ�
	class MyMouseListener implements MouseListener, MouseMotionListener {
		// MouseListener�� 5�� �޼ҵ� ����
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed ("+e.getX()+","+e.getY()+")"); // ���콺�� ������ ��ġ (x,y) ���� ���
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased("+e.getX()+","+e.getY()+")"); // ���콺�� ������ ��ġ (x,y) ���� ���
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource(); // ���콺�� �ö� ������Ʈ�� �˾Ƴ���.
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource(); // ���콺�� ������ ������Ʈ�� �˾Ƴ���.
			c.setBackground(Color.YELLOW);
		}
		
		// MouseMotionListener�� 2�� �޼ҵ� ����
		public void mouseDragged(MouseEvent e) { // ���콺�� �巡��Ǵ� ���� ��� ȣ��
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
		}
		public void mouseMoved(MouseEvent e) { // ���콺�� �����̴� ���� ��� ȣ��
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
		}
	}
	
	public static void main(String [] args) {
		new MouseListenerAllEx();
	}
}