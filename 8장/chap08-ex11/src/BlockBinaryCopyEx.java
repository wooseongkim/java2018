import java.io.*;
public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg"); // ���� ���� ��θ�
		// ������ 7������ File("c:\\Users\\Public\\Pictures\\Sample Pictures\\desert.jpg");�� ����϶�.

		File dest = new File("c:\\Temp\\copyimg.jpg"); // ���� ����
		try {
			FileInputStream fi = new FileInputStream(src); // ���� �Է� ����Ʈ ��Ʈ�� ����
			FileOutputStream fo = new FileOutputStream(dest); // ���� ��� ����Ʈ ��Ʈ�� ����
			byte [] buf = new byte [1024*10]; // 10KB ����
			while(true) {
				int n = fi.read(buf); // ���� ũ�⸸ŭ �б�. n�� ���� ���� ����Ʈ
				fo.write(buf, 0, n); // buf[0]���� n ����Ʈ ����
				if(n <buf.length)
					break; // ���� ũ�⺸�� �۰� �о��� ������ ���� ���� ����. ���� ����
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		} catch (IOException e) { System.out.println("���� ���� ����"); }
	}
}