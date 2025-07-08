public class EmployeeInformation {
	public static void main(String[] args) {
		
		//Employee id as input
		int empid=Integer.parseInt(args[0]);
		
		//Employee details
		int[] empno= {1001,1002,1003,1004,1005,1006,1007};
		String[] empname= {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String[] dept= {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		char[] designcode= {'e','c','k','r','m','e','c'};
		int[] basic= {20000,30000,10000,12000,50000,23000,29000};
		int[] hra= {8000,12000,8000,6000,20000,9000,12000};
		int[] it= {3000,9000,1000,2000,20000,4400,10000};
		
		//DA Dearness Allowance
		int[] da={20000,32000,12000,15000,40000};
		String[] design= {"Engineer","Consultant","Clerk","Receptionist","Manager"};
		
		boolean found=false;
		
        //Calculate salary
		for(int i=0;i<empno.length;i++) {
			if(empno[i]==empid) {
				found=true;
				String designation="";
				int davalue=0;
				switch(designcode[i]) {
					case 'e':
						designation=design[0];
						davalue=da[0];
						break;
					case 'c':
						designation=design[1];
						davalue=da[1];
						break;
					case 'k':
						designation=design[2];
						davalue=da[2];
						break;
					case 'r':
						designation=design[3];
						davalue=da[3];
						break;
					case 'm':
						designation=design[4];
						davalue=da[4];
						break;
				}
				int salary =basic[i]+hra[i]-it[i]+davalue;
				System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
				System.out.println(empid+"\t"+empname[i]+"\t\t"+dept[i]+"\t\t"+designation+"\t\t"+salary);
			}
		}
		if(!found) {
			System.out.println("There is no employee with empid:"+empid);
		}
	}
}