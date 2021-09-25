package iteratorfactory.vitaminfactory;

public class VitaminFactoryTest {

	public static void main(String[] args) 
	{
	  VitaminFactoryImplementation vitaminFactory=new VitaminFactoryImplementation();
	  Iterator i=vitaminFactory.getIterator();
	  while(i.hasNext())
	  {
		  String s=(String)i.next();
		  System.out.println(s);
	  }
	}

}
