
public class Entry {
	private String word;
	private String definition;
	
	//default constructor
	public Entry()
	{
		word = "";
		definition = "";
	}
	
	//constructor
	public Entry(String inWord, String inDefinition)
	{
		word = inWord;
		definition = inDefinition;
	}
	
	//sets word
	public void setWord(String inWord)
	{
		word = inWord;
	}
	
	//sets definition
	public void setDefinition(String inDefinition)
	{
		definition = inDefinition;
	}
	
	//returns word
	public String getWord()
	{
		return word;
	}
	
	//returns definition
	public String getDefinition()
	{
		return definition;
	}
	
	public String toString()
	{
		return word + " " +definition;
	}
}
