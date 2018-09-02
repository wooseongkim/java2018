@FunctionalInterface
interface MyFunction<T> { // ���׸� Ÿ�� T�� ���� �Լ��� �������̽�
	void print(T x); // ���ٽ����� ������ �߻� �޼ҵ�
}

public class LambdaEx5 {
	public static void main(String[] args) {
		MyFunction<String> f1 = (x) -> System.out.println(x.toString());
		f1.print("ABC"); // String ��ü�� ���ٽĿ� �Ѱ��ش�.
		
		MyFunction<Integer> f2 = (x) -> System.out.println(x.toString());
		f2.print(Integer.valueOf(100));	// Integer ��ü�� ���ٽĿ� �Ѱ��ش�.
	}
}