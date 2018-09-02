public class Circle {
	int radius; 
	String name; 

	public Circle() { // �Ű� ���� ���� ������
		radius = 1; name = ""; // �ʵ� �ʱ�ȭ
	}
	
	public Circle(int r, String n) { // �Ű� ������ ���� ������
		radius = r; name = n; // �Ű� ������ �ʵ� �ʱ�ȭ 
	}

	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle pizza = new Circle(10, "�ڹ�����"); // ��ü ����. ��������  10����, �̸��� "�ڹ�����"�� �ʱ�ȭ
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle(); // ��ü ����, �������� 1, �̸��� ""�� �ʱ�ȭ
		donut.name = "��������"; // �̸� ����
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}
}