interface MyFunction { // �Լ��� �������̽�
	int calc(int x, int y); // ���ٽ����� ������ �߻� �޼ҵ�
}

public class LambdaEx1 {
	public static void main(String[] args) {
		MyFunction add = (x, y) -> { return x + y; }; // ���ٽ�
		MyFunction minus = (x, y) -> x - y; // ���ٽ�. {}�� return ����

		System.out.println(add.calc(1, 2)); // �� ���ϱ�
		System.out.println(minus.calc(1, 2)); // �� ���ϱ�
	}
}