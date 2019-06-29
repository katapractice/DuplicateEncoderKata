package controller;

public class Controller
{
	
	public Controller()
	{
		
	}
	
	
	public void start()
	{
		System.out.println(encode("recede"));
	}
	
	
	private String encode(String word)
	{
		String returnMe = "";
		
		char masterArray[] = word.toLowerCase().toCharArray();
		
		for(int x = 0; x < word.length(); x++)
		{
			int count = 0;
			char compareLetter = masterArray[x];
			for(int y = 0; y < word.length(); y++)
			{
				if(x !=y )
				{
					if(compareLetter == masterArray[y])
					{
						count++;
					}
				}
			}
			
			if(count > 0)
			{
				returnMe = returnMe.concat(")");
			}
			else
			{
				returnMe = returnMe.concat("(");
			}
			
		}
		
		return returnMe;
	}
	
	
	
	private String neatSolution(String word)
	{
		word = word.toLowerCase();
	    String result = "";
	    for (int i = 0; i < word.length(); ++i) 
	    {
	      char c = word.charAt(i);
	      /*
	       * This makes use of the ternary operator
	       * result = testCondition ? ifTrue : ifFalse
	       * 
	       * lastIndexOf gets the last appearance of the letter, indexOf gets the first appearance of the letter
	       * The two are only the same (and thus passing the test) if the index is the same IE the letter occurs only once.
	       */
	      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
	    }
	    return result;
	 }
	
	
	
}
