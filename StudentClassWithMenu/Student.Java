
public class Student {
	private int sid;
	private String sname;
	private int marks[]=new int[3];
	public Student (int sid,String sname,int marks[]) {
    this.sid=sid;
    this.sname=sname;
    this.marks=marks;
    }
	
	public void setId(int sid){
		this.sid=sid;
	}
	public void setName(String sname){
		this.sname=sname;
	}
	public void setId(int [] marks){
		this.marks=marks;
	}
	
	public int getId() {
		return sid;
	}
	public String getName() {
		return sname;
	}
	
	public int[] getMarks() {
		return marks;
	}
	
	public String toString() {
		String str ="";
		str+= "Student ID: "+sid+" Student Name: "+sname+" Student Marks: M1: "+ marks[0]+" M2: "+ marks[1]+" M3:"+ marks[2];
	   return str;
	}
	

}
