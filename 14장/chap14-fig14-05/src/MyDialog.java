import java.awt.*;
import javax.swing.*;

public class MyDialog {

	public static void main(String[] args) {
		JDialog dialog = new JDialog(); // ���̾�α� ����
		dialog.setTitle("���� ���̾�α�"); // Ÿ��Ʋ �ޱ�
		dialog.add(new JButton("click!")); // ���̾�α׿� ��ư ����
		dialog.setSize(300,300); // ���̾�α� ũ�� ����
		dialog.setVisible(true); // ���̾�α� ȭ�� ���

	}

}
