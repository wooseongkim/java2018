import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.event.*;
import java.awt.*;

public class MenuAndFileDialogEx extends JFrame {
	private JLabel imageLabel = new JLabel();
	
	public MenuAndFileDialogEx() {
		setTitle("Menu�� JFileChooser Ȱ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(imageLabel);
		createMenu();
		setSize(350,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		
		// Open �޴������ۿ� Action �����ʸ� ����Ѵ�.
		openItem.addActionListener(new OpenActionListener());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	
	// Open �޴��������� ���õǸ� ȣ��Ǵ� Action ������
	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;
		
		public OpenActionListener() {
			chooser = new JFileChooser(); // ���� ���̾�α� ����
		}
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"JPG & GIF Images", // ���� �̸����� ��µ� ���ڿ�
					"jpg", "gif"); // ���� ���ͷ� ���Ǵ� Ȯ����. *.jpg. *.gif�� ������

			chooser.setFileFilter(filter); // ���� ���̾�α׿� ���� ���� ����
			int ret = chooser.showOpenDialog(null); // ���� ���̾�α� ���
			if(ret != JFileChooser.APPROVE_OPTION) { // ����ڰ� â�� ������ �ݾҰų� ��� ��ư�� ���� ���
				JOptionPane.showMessageDialog(null, "������ �������� �ʾҽ��ϴ�", 
									"���", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			// ����ڰ� ������ �����ϰ� "����" ��ư�� ���� ���
			String filePath = chooser.getSelectedFile().getPath(); // ���� ��θ� ����
			imageLabel.setIcon(new ImageIcon(filePath)); // �̹��� ���
			pack(); // �̹����� ũ�⿡ ���߾� ������ ũ�� ����
		}
	}
	public static void main(String [] args) {
		new MenuAndFileDialogEx();
	}
}