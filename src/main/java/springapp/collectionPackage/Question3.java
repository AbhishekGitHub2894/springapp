package springapp.collectionPackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question3 {
	
	private int id;  
	private String name;  
	private Map<Answer2,User> Answer2;  
	  
	//getters and setters  
	  
	  
	public void displayInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answer2....");  
	    Set<Entry<Answer2, User>> set=Answer2.entrySet();  
	    Iterator<Entry<Answer2, User>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<Answer2, User> entry=itr.next();  
	        Answer2 ans=entry.getKey();  
	        User user=entry.getValue();  
	        System.out.println("Answer2 Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	    }  
	}

	public Question3(int id, String name, Map<Answer2, User> Answer2) {
		super();
		this.id = id;
		this.name = name;
		this.Answer2 = Answer2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Answer2, User> getAnswer2() {
		return Answer2;
	}

	public void setAnswer2(Map<Answer2, User> Answer2) {
		this.Answer2 = Answer2;
	} 

}
