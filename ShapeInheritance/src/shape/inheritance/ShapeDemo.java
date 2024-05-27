package shape.inheritance;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		s.setLength(5);
		s.setBreadth(4);
		
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());

	}

}
