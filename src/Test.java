import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class Test {
	private ArrayList<Entry> entries;
	
	public Test(HttpServletRequest inHTTPRequest)
	{
		entries = new ArrayList<Entry>();
		System.out.println(inHTTPRequest.getQueryString());
		int count = 1;
		while(inHTTPRequest.getQueryString().contains("keyword"+count))
		{
			System.out.println(count);
			String keyword = inHTTPRequest.getParameter("keyword"+count);
			String definition = inHTTPRequest.getParameter("definition"+count);
			Entry temp = new Entry(keyword,definition);
			entries.add(temp);
			count++;
		}
	}
	
	public void setEntires(ArrayList<Entry> inEntries)
	{
		entries = inEntries;
	}
	public ArrayList<Entry> getEntries()
	{
		return entries;
	}
	public String toString()
	{
		String print = "";
		for(int i=0;i<entries.size();i++)
		{
			print += entries.get(i).toString()+"\n";
		}
		return print;
	}
	
	public ArrayList<Question> generateTest()
	{
		ArrayList<Question> questions = new ArrayList<Question>();
		for(int i=0;i<entries.size();i++)
		{
			Question q = new Question();
			q.setMatch(entries.get(i));
			Random rand = new Random();
			int n=i;
			int counter = 1;
			ArrayList<String> def = new ArrayList<String>();
			ArrayList<Integer> randomInts = new ArrayList<Integer>();
			while(counter < 4) {
				while(n==i || randomInts.contains(n)) 
				{
					n = rand.nextInt(entries.size());
				}
				randomInts.add(n);
				System.out.println("in generate while");
				System.out.println(entries.get(n).getDefinition());
				def.add(entries.get(n).getDefinition());
				counter++;
			}
			q.setDefinition(def);
			System.out.println("DONE WITH GROUP");
			questions.add(q);
		}
		return questions;
	}
}
