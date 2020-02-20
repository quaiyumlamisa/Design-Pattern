package CompositeDesignPattern;


import java.util.ArrayList;

public abstract class Composite implements Ishape
{
	
  ArrayList<Ishape>shape=new ArrayList<Ishape>();
  
  
  public abstract void buildshape();
  
 
  
  public void draw()
  {
	buildshape();
	
	for(int i=0;i<shape.size();i++)
	{
		shape.get(i).draw();
	}
	  
  }
  
}
