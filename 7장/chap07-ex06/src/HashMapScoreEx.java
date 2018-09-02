import java.util.*;
public class HashMapScoreEx {
	public static void main(String[] args) {
		// �̸��� ������ ������ HashMap �÷��� ����
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		// 5���� ���� ����
		scoreMap.put("�輺��", 97); 
		scoreMap.put("Ȳ����", 88); 
		scoreMap.put("�賲��", 98);
		scoreMap.put("���繮", 70);		
		scoreMap.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��� ���� :" + scoreMap.size());
		
		// ��� ����� ���� ���. scoreMap�� ��� �ִ� ��� (key, value) �� ���
		Set<String> keys = scoreMap.keySet();  // ��� key�� ���� Set �÷��� ����
		Iterator<String> it = keys.iterator();  // Set�� �ִ� ��� key�� ������� �˻��ϴ� Iterator ����
		while(it.hasNext()) {
			String name = it.next();            // ���� Ű. �л� �̸�
			int score = scoreMap.get(name);  // ���� �˾Ƴ���
			System.out.println(name + " : " + score);
		}
	}
}