interface MyFunction {
	void print();
}

public class LambdaEx3 {
	public static void main(String[] args) {
		MyFunction f = () -> { // ���ٽ� �ۼ�
			System.out.println("Hello");
		};
		
		f.print(); // ���ٽ� ȣ��
		
		f = () -> System.out.println("�ȳ�"); // ���ٽ� �ۼ�
		
		f.print(); // ���ٽ� ȣ��	
	}
}