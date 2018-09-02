class GStack<T> { // ���׸� ���� ����. ���׸� Ÿ�� T
	int tos; 
	Object [] stck; // ���ÿ� ��Ҹ� ������ ���� �迭
	public GStack() {
		tos = 0; 
		stck = new Object [10];
	}
	public void push(T item) {
		if(tos == 10) // ������ �� ���� �� �̻� ��Ҹ� ������ �� ����
			return;  
		stck[tos] = item;
		tos++;
	}
	@SuppressWarnings("unchecked")
	public T pop() {
		if(tos == 0) // ������ ��� �־� ���� ��Ұ� ����
			return null;
		tos--; 
		return (T)stck[tos]; // Ÿ�� �Ű� ���� Ÿ������ ĳ���� 
	}
}
public class GenericMethodEx {
	public static <T> GStack<T> reverse(GStack<T> a) {// T�� Ÿ�� �Ű� ������ ���׸� �޼ҵ�
		GStack<T> s = new GStack<T>(); // ���� a�� �ݴ�� ������ ���� GStack ����
		while (true) {
			T tmp;
			tmp = a.pop(); // ���� ���ÿ��� ��� �ϳ��� ����
			if (tmp == null) // ������ �����
				break; // �Ųٷ� ����� �۾� ����
			else
				s.push(tmp); // �� ���ÿ� ��Ҹ� ����
		}
		return s; // �� ������ ����
	}

	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>(); // Double Ÿ���� GStack ����

		for (int i=0; i<5; i++) { // 5���� ��Ҹ� ���ÿ� push
			gs.push(new Double(i));
		}
		gs = reverse(gs);	
		for (int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}
	}
}