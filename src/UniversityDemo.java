
public class UniversityDemo {

	public static void main(String[] args) {
		//college c=new college("KLE56","KLETECH",123);
		//c.workingdays();
		college RLS=new college("RLS23","RLSTU",123);
		RLS.workingdays();
		RLS.create("civil",230,10);
		RLS.create("mech",500,12);
		RLS.create();
		RLS.No_Branches();
		RLS.No_Students();
		RLS.FSalary();

		System.out.println("-----------------------");
		college SDM=new college("SDM324", "SDM",300);
		SDM.workingdays();
		SDM.create("civil",500,20);
		SDM.create("mech",550,20);
		SDM.create();
		SDM.No_Branches();
		SDM.No_Students();
		SDM.FSalary();
	}
}
