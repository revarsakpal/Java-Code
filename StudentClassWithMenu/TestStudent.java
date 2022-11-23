import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		Student student[]=new Student[5];
		
		while(true) {
			Menu.displayMenu();
			int choice=sc.nextInt();
			switch(choice){
			case 1:StudentService.addStudentInfo(student,count);count++; break;
			case 2:float per=StudentService.calPercentage(student,count);
			        System.out.println("Percentage"+per);  
			       if(per==0) {System.out.println("student not found");}
			        else {
			        	//System.out.println("Percentage:"+per);
			        	System.out.println("and GPA is:"+StudentService.calculateGPA(per));}break;
	    		case 3:Student find=StudentService.findStudent(student,count);
	    		  if(find==null) {System.out.println("Student not Found");}
	    		  else {System.out.println(find);}
	    		  break;
			case 4:StudentService.showAllStudents(student,count);break;
			case 5:System.out.println("Bye!!");break;
				
			}if(choice==5) {break;}
		}
	}

}
