import javax.swing.*;

public class MenuEx extends JFrame {
	public MenuEx() {
		setTitle("Menu ����� ����");
		createMenu(); // �޴� ����, �����ӿ� ����
		setSize(250,200);
		setVisible(true);
	}
	
	// �޴��� ����� �����ӿ� �����Ѵ�.
	private void createMenu() {
		JMenuBar mb = new JMenuBar(); // �޴��� ����
		JMenu screenMenu = new JMenu("Screen"); // Screen �޴� ����

		// Screen �޴��� �޴������� ���� ����
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator(); // �и��� ����
		screenMenu.add(new JMenuItem("Exit"));

		// �޴��ٿ� �޴� ����
		mb.add(screenMenu); // Screen �޴� ����
		mb.add(new JMenu("Edit")); // Edit �޴� ���� ����
		mb.add(new JMenu("Source")); // Source �޴� ���� ����
		mb.add(new JMenu("Project")); // Project �޴� ���� ����
		mb.add(new JMenu("Run")); // Run �޴� ���� ����

		// �޴��ٸ� �����ӿ� ����
		setJMenuBar(mb);
	}
	
	public static void main(String [] args) {
		new MenuEx();
	}
}