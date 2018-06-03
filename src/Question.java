import java.util.ArrayList;

public class Question {
	private ArrayList<String> definition;
	private Entry match;
	
	public Question()
	{
		match = new Entry();
		definition = new ArrayList<String>();
	}
	
	public Question(ArrayList<String> definition, Entry match) {
		super();
		this.definition = definition;
		this.match = match;
	}
	
	/**
	 * @return the definition
	 */
	public ArrayList<String> getDefinition() {
		return definition;
	}
	/**
	 * @param definition the definition to set
	 */
	public void setDefinition(ArrayList<String> definition) {
		this.definition = definition;
	}
	/**
	 * @return the match
	 */
	public Entry getMatch() {
		return match;
	}
	/**
	 * @param match the match to set
	 */
	public void setMatch(Entry match) {
		this.match = match;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String def = "";
		for(int i=0;i<definition.size();i++)
		{
			def += definition.get(i);
			if(i!=definition.size()-1) def += ",";
		}
		return "Question [definition=" + def + ", match=" + match + "]";
	}
	
	
	
	
}
