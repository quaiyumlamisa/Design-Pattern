package CompositeDesignPattern;

public class Flag extends Composite
{

	public void buildshape() 
	{
		System.out.println("draw a flag");
		// TODO Auto-generated method stub
		shape.add(new Line());
		shape.add(new Line());
		shape.add(new Line());
		shape.add(new Line());
		shape.add(new Circle());
		
		
	}
}
