class A {
	public A() {
		System.out.println("������A");
	}
	public A(int x) {
		System.out.println("�Ű�����������A" + x);
	}
}
class B extends A {
	public B() {
		System.out.println("������B");
	}
	public B(int x) {
		super(x);
		System.out.println("�Ű�����������B" + x);
	}
}
public class ConstructorEx4 {
	public static void main(String[] args) {
		B b;
		b = new B(5);
	}
}