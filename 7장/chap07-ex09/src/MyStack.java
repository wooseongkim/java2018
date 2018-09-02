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
class GenericMethodEx {
	static <T> void toStack(T[] a, GStack<T> gs) {
		for (int i=0; i<a.length; i++) {
			gs.push(a[i]);
		}
	}
}

public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>(); // String Ÿ���� GStack ����
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n=0; n<3; n++)
			System.out.println(stringStack.pop()); // stringStack ���ÿ� �ִ� 3 ���� ���ڿ� ��
		
		GStack<Integer> intStack = new GStack<Integer>(); // Integer Ÿ���� GStack ����
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
	
		for(int n=0; n<3; n++)
			System.out.println(intStack.pop()); // intStack ���ÿ� �ִ� 3 ���� ���� ��
	}
}