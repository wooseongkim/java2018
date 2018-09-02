class Shape { // ���� Ŭ����
	public Shape next; // �׸� 5-22�� �ڵ带 ���� �ʿ��� �κ�
	public Shape() { next = null; } // �׸� 5-22�� �ڵ带 ���� �ʿ��� �κ�
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	@Override
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class UsingOverride {
	public static void main(String [] args) {
		Shape start, last, obj;
		
		// ��ũ�� ����Ʈ�� ���� �����Ͽ� ����
		start = new Line(); // Line ��ü ����
		last = start;
		obj = new Rect();
		last.next = obj; // Rect ��ü ����
		last = obj;
		obj = new Line(); // Line ��ü ����
		last.next = obj;
		last = obj;
		obj = new Circle(); // Circle ��ü ����
		last.next = obj;
		
		// ��� ���� ���
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}
}