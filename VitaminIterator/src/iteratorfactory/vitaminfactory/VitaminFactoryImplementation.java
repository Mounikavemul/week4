package iteratorfactory.vitaminfactory;

public class VitaminFactoryImplementation implements VitaminCollection 
{
    String vitaminDetails[] = {"Dosage: Dialy and Special Purpose","Form: Some vitamins are chewables,Liqid,pills etc","UsedFor: Kids, Adults"};
	@Override
	public Iterator getIterator() {
		return new VitaminIterator();
	}
	
	private class VitaminIterator implements Iterator
	{
		int index=0;

		@Override
		public boolean hasNext() 
		{
			if(index<vitaminDetails.length)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return vitaminDetails[index++];
			else
				return null;
		}
		
	}
}
