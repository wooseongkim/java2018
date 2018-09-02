interface MyFunction {
	int calc(int x, int y);
}

public final class LambdaEx4 {
	public static void main(String[] args) {
		printMultiply(3, 4, (x,y)->x*y); // ���ٽ�((x,y)->x*y)�� �Ű������� ����
	}
	
	static void printMultiply(int x, int y, MyFunction f) { // f�� (x,y)->x*y ���ٽ� ���޹���
		System.out.println(f.calc(x, y));
	}
}