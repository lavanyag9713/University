
public interface University {

	void No_Branches();
	void No_Students();
	void FSalary();
}
 class college implements University
{
	 int i=0;
	String CollegeCode;
	String CollegeName;
	int noOfwrk;
	
	Faculty[] f=new Faculty[2];
	Dept[] d=new Dept[2];
	
	public college(String collegeCode, String collegeName,int noOfwrk)
	{
		this.CollegeCode = collegeCode;
		this.CollegeName = collegeName;
		this.noOfwrk=noOfwrk;
	}
	public void workingdays(){
		if(noOfwrk<250)
			System.out.println("college is not fit");
		else 
			System.out.println("college is fit");
	}
	public void No_Branches() {
		System.out.println("Branches available");
		System.out.println("1)Computer Science");
		System.out.println("2)ENC");
		System.out.println("3)Mechanical");
		System.out.println("4)civil");
	}
	public void No_Students() {
	  int total_stud=0,i;
	  for(i=0;i<d.length;i++)
	  {
		  total_stud=total_stud+d[i].NoOfStudents;
	  }
	  System.out.println("total no of students=" + total_stud);
	}
	public void  FSalary() {
		for(int i=0;i<f.length;i++)
		{
			if(f[i].post=="professor")
				Faculty.Salary=50000;
			else if(f[i].post=="attender")
				Faculty.Salary=10000;
			else
				Faculty.Salary=5000;
			System.out.println("Faculty salary=" + Faculty.Salary);
		}
	}
//overload
	void create()
	{
		for(int i=0;i<f.length;i++)
		{
			f[0]=new Faculty("abc",23,"professor");
			f[1]=new Faculty("xyz",56,"attender");
		}
	}
	void create(String name, int noOfStudents, int noOfCourses)
	{
		d[i++]=new Dept(name, noOfStudents, noOfCourses);
	}
}
final class Faculty 
{
	String name;
	int EmpID;
	String post;
	static double Salary=10000;
	public Faculty(String name, int empID, String post) {
		super();
		this.name = name;
		EmpID = empID;
		this.post = post;
	}
}
final class Dept
{
	String name;
	int NoOfStudents;
	int NoOfCourses;
	public Dept(String name, int noOfStudents, int noOfCourses) {
		super();
		this.name = name;
		NoOfStudents = noOfStudents;
		NoOfCourses = noOfCourses;
	}
}

