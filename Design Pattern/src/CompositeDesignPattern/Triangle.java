package CompositeDesignPattern;

public class Triangle extends Composite
{

	@Override
	public void buildshape() 
	{
		System.out.println("draw a triangle");
		// TODO Auto-generated method stub
		shape.add(new Line());
		shape.add(new Line());
		shape.add(new Line());
		
		
	}

}
