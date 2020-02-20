package CompositeDesignPattern;

public class Rectangle extends Composite
{

	@Override
	public void buildshape()
	{
		System.out.println("draw a rectangle");
		
		shape.add(new Line());
		shape.add(new Line());
		shape.add(new Line());
		shape.add(new Line());
		
		// TODO Auto-generated method stub
		
	}

}
