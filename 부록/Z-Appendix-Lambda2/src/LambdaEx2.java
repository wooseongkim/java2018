interface MyFunction { // �Լ��� �������̽�
	int calc(int x); // ���ٽ����� ������ �߻� �޼ҵ� 
}

public class LambdaEx2 {
	public static void main(String[] args) {
		MyFunction square = x -> x * x;
		System.out.println(square.calc(2));
	}
}
