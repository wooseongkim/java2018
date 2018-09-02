import java.util.*;
class Student { 
	private int id;
	private String tel;
	public Student(int id, String tel) { this.id = id; this.tel = tel; }
	public int getId() { return id; }
	public String getTel() { return tel; }	
}

public class HashMapStudentEx {
	public static void main(String[] args) {
		// (�л� �̸�, Student ��ü)�� �����ϴ� �ؽø� ����
		HashMap<String, Student> map = new HashMap<String, Student>();	
		map.put("Ȳ����", new Student(1, "010-111-1111")); // 3���� �л� ���� 
		map.put("���繮", new Student(2, "010-222-2222"));
		map.put("�賲��", new Student(3, "010-333-3333"));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸�?");
			String name = scanner.nextLine(); // ����ڷκ��� �̸� �Է�
			if(name.equals("exit")) 
				break; // while ���� ��� ���α׷� ����
			Student student = map.get(name);  // �̸��� �ش��ϴ� Student ��ü �˻�
			if(student == null)
				System.out.println(name + "�� ���� ����Դϴ�.");
			else
				System.out.println("id:" + student.getId() + ", ��ȭ:" + student.getTel());
		}
		scanner.close();
	}
}