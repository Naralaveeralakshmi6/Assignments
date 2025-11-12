package language.basics;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment6 {

	public static void main(String[] args) {
		
		Map<String,Integer>  stuMarks = new LinkedHashMap<String,Integer>(); 
		stuMarks.put("Suresh", 75);
		stuMarks.put("Mahesh", 80);
		stuMarks.put("Naresh", 82);

	System.out.println("LinkedMap is " + stuMarks);
System.out.println(stuMarks.size());


		stuMarks.replace ("Suresh",75+10);
		stuMarks.replace("Mahesh", 80+10);
		stuMarks.replace("Naresh", 82+10);
		
		
		//stuMarks.computeIfPresent("Suresh",75+10);
		System.out.println("UpdatedLinkedMap is " + stuMarks);
		//System.out.println(("Stu Marks  " + stuMarks.values()+10));
		//System.out.println("emp " + +10);
	
		//System.out.println(stuMarks.);
	System.out.println((85+90+92)/3);


	
	
	
	
	
	}

}
