package pack;

import java.util.Iterator;
import java.util.List;

public class Student {
private int sid;
private String sname;
//private Address a;
private List<String> Mobile;



/*public Student(int sid, String sname, Address a) {
	//super();
	this.sid = sid;
	this.sname = sname;
	this.a = a;
}*/

/*public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}

public Student() {
System.out.println("default Constructor");	
}

public Student(int sid, String sname) {
	//super();
	this.sid = sid;
	this.sname = sname;
}*/






public void display()
{
	System.out.println("sid:"+this.sid+"\n"+"sname:"+this.sname+"\n");
	Iterator i=Mobile.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}

public Student(int sid, String sname, List<String> mobile) {
	super();
	this.sid = sid;
	this.sname = sname;
	Mobile = mobile;
}
	
}
