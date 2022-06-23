package task20;

import java.util.*;

public class StateAndCapital {
	String state;
	String capital;
	StateAndCapital(String state,String capital){
		this.state=state;
		this.capital=capital;
		
	} public String getstate()
    {
        return state;
    }
  
    public String getcapital()
    {
        return capital;
    }
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String st=sc.nextLine();
	String st1=sc.nextLine();

	List<StateAndCapital> s = new ArrayList<StateAndCapital>();
	for(int i=0;i<=5;i++) {
       s.add(new StateAndCapital(st,st1));
	}
       Map<String,String> mp = new HashMap<String,String>();
  	 	for (StateAndCapital stu : s) {
           mp.put(stu.getstate(), stu.getcapital());
       }
       
       System.out.println(mp);
       
       
       
       
       
       
       
       

//		for(int i=0;i<5;i++) {
//			s.add(new StateAndCapital(sc.nextLine(state,capital)));	
//	        lt.add(new Student(1, "Geeks"));
//
//		}System.out.println(s);
//		
		
	}
	}
