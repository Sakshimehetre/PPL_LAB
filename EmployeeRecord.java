import java.io.*;

/* Create employee bio-data using following classes
i) Personal record (which includes: Name, Address, Contact no, height, Date of Birth, Blood group, etc.)
ii) Academic record(which includes: Name, SSC_marks, HSC_marks, Degree_percentage, Qulification, year_of_passing, etc.)
iii) Professional record (which includes: Employee_Name,Employee_id, company_name,
company_Address, designation, Salary, experience, joining_date,etc.)
Write a java program to handle the common possible exceptions
on above data & print bio-data using multilevel inheritance */
class InvalidContactException extends Exception{
	InvalidContactException(String msg){
		super(msg);
	}
}
class NegativeHeightException extends Exception
{
	NegativeHeightException(String msg){
		super(msg);
	}
}
class operation
{
	public static int total;
	operation()
	{
		total = 0;
	}
	int gettotal(){
		return(total);
	}
	void settotal(int t){
		this.total = t;
	}

}
class Personal{
	private String name;
	private	String address;
	private	String contact_no;
	private	float height;
	private	String date_of_birth;
	private	String blood_group;
	void input1(){
		BufferedReader br = new
		BufferedReader(new InputStreamReader(System.in));
		try{
		System.out.println("\t Enter Employee Address = ");
		address = br.readLine();
		System.out.println("\t Enter Employee Contact Number = ");
		contact_no = br.readLine();
		if(contact_no.length()>10){
			InvalidContactException A = new InvalidContactException("Mobile Number should have 10 digits!!");
			throw(A);
		}
		System.out.println("\t Enter Employee Height = ");
		height = Integer.parseInt(br.readLine());
		if(height < 0){
			NegativeHeightException A = new NegativeHeightException("Height Cannot be Negative!!");
			throw(A);
		}
		System.out.println("\t Enter Employee Date of Birth (dd/mm/yyyy) = ");
		date_of_birth = br.readLine();
		System.out.println("\t Enter Employee Blood Group = ");
		blood_group = br.readLine();
		}
		catch(IOException e){
			System.out.println("Input/Output Operation failed");
		}
		catch(NumberFormatException e){
			System.out.println("String Inserted instead of Number!!");
		}
		catch(InvalidContactException e){
			System.out.println(e);
		}
		catch(NegativeHeightException e){
			System.out.println(e);
		}
	}
	void setdata1(){
		this.name = "";
		this.address = "";
		this.contact_no = "";
		this.height = -1;
		this.date_of_birth = "";
		this.blood_group = "";
	}
	void display1(){
		System.out.println("\t Employee Address = "+address);
		System.out.println("\t Employee Contact Number = "+contact_no);
		System.out.println("\t Employee Height = "+height);
		System.out.println("\t Employee Date of Birth (dd/mm/yyyy) = "+date_of_birth);
		System.out.println("\t Employee Blood Group = "+blood_group);
	}
	void perosonal_data(){
		System.out.println("\t Employee Name = "+name);
		System.out.println("\t Employee Address = "+address);
		System.out.println("\t Employee Contact Number = "+contact_no);
		System.out.println("\t Employee Height = "+height);
		System.out.println("\t Employee Date of Birth (dd/mm/yyyy) = "+date_of_birth);
		System.out.println("\t Employee Blood Group = "+blood_group);
	}
	void setname1(String name){
		this.name = name;
	}
	void setaddress(String a){
		this.address = a;
	}
	void setcontactno(String n){
		this.contact_no = n;
	}
	void setheight(float h){
		this.height = h;
	}
	void setdateofbirth(String d){
		this.date_of_birth = d;
	}
	void setbloodgroup(String b){
		this.blood_group = b;
	}
	String getaddress(){
		return(address);
	}
	String getcontactno(){
		return(contact_no);
	}
	float getheight(){
		return(height);
	}
	String getdateofbirth(){
		return(date_of_birth);
	}
	String getbloodgroup(){
		return(blood_group);
	}

}
class Academic extends Personal{

	private	String name;
	private	float SSC_Marks;
	private	float HSC_Marks;
	private	float degree_percent;
	private	String qualification;
	private	String year_of_passing;
	void input2(){

		BufferedReader br = new
		BufferedReader(new InputStreamReader(System.in));
		try{
		System.out.println("\t Enter Employee SSC_Marks (%) = ");
		SSC_Marks = Float.parseFloat(br.readLine());
		System.out.println("\t Enter Employee HSC_Marks (%) = ");
		HSC_Marks = Float.parseFloat(br.readLine());
		System.out.println("\t Enter Employee Degree Percent = ");
		degree_percent = Float.parseFloat(br.readLine());
		System.out.println("\t Enter Employee Qualification = ");
		qualification = br.readLine();
		System.out.println("\t Enter Employee Year of Passing = ");
		year_of_passing = br.readLine();
		}
		catch(IOException e){
			System.out.println("Input/Output Operation failed");
		}
		catch(NumberFormatException e){
			System.out.println("String Inserted instead of Number!!");
		}
		input1();

	}
	float getsscmarks(){
		return(SSC_Marks);
	}
	float gethscmarks(){
		return(HSC_Marks);
	}
	float getdegreepercent(){
		return(degree_percent);
	}
	String getqualification(){
		return(qualification);
	}
	String getyearofpassing(){
		return(year_of_passing);
	}
	void setname2(String name){
			this.name = name;
			setname1(name);
	}
	void setdata2()
	{
		this.name = "";
		this.SSC_Marks = -1;
		this.HSC_Marks = -1;
		this.degree_percent = -1;
		this.qualification = "";
		this.year_of_passing="";
		setdata1();
	}
	void setsscmarks(float s){
		this.SSC_Marks = s;}
	void sethscmarks(float h){
		this.HSC_Marks = h;}
	void setdegreepercent(float p){
		this.degree_percent = p;}
	void setqualification(String q){
		this.qualification = q;}
	void setyearofpassing(String y){
		this.year_of_passing = y;}
	void display2(){
		System.out.println("\t Employee SSC_Marks (%) = "+SSC_Marks);
		System.out.println("\t Employee HSC_Marks (%) = "+HSC_Marks);
		System.out.println("\t Employee Degree Percent = "+degree_percent);
		System.out.println("\t Employee Qualification = "+qualification);
		System.out.println("\t Employee Year of Passing = "+year_of_passing);
	}
	void academic_data(){
		System.out.println("\t Employee Name = "+name);
		System.out.println("\t Employee SSC_Marks (%) = "+SSC_Marks);
		System.out.println("\t Employee HSC_Marks (%) = "+HSC_Marks);
		System.out.println("\t Employee Degree Percent = "+degree_percent);
		System.out.println("\t Employee Qualification = "+qualification);
		System.out.println("\t Employee Year of Passing = "+year_of_passing);
	}
}
class Professional extends Academic
{
		private	String emp_name;
		private	int emp_ID;
		private	String company_name;
		private	String company_address;
		private	String emp_desg;
		private	int emp_exp;
		private	long salary;
		private	String emp_join_date;
		public static int total;
		void input3(){

			BufferedReader br = new
			BufferedReader(new InputStreamReader(System.in));
			try{
			System.out.println("\t Enter Employee Name = ");
			emp_name = br.readLine();
			System.out.println("\t Enter Employee ID (3 digit) = ");
			emp_ID = Integer.parseInt(br.readLine());
			System.out.println("\t Enter Employee Company Name = ");
			company_name = br.readLine();
			System.out.println("\t Enter Employee Company Address = ");
			company_address = br.readLine();
			System.out.println("\t Enter Employee Designation = ");
			emp_desg = br.readLine();
			System.out.println("\t Enter Employee Experience(in years) = ");
			emp_exp = Integer.parseInt(br.readLine());
			System.out.println("\t Enter Employee Salary(per annum) = ");
			salary = Long.parseLong(br.readLine());
			System.out.println("\t Enter Employee Joining date (dd/mm/yyyy) = ");
			emp_join_date = br.readLine();
		   }
		   catch(NumberFormatException e){
		   		System.out.println("String Inserted instead of Number!!");
			}
			catch(IOException e){
				System.out.println("Input/Output Operation failed");
			}

			setname2(emp_name);
			input2();
		}
		void display3(){
			System.out.println("\t Employee ID = "+emp_ID);
			System.out.println("\t Employee Company Name = "+company_name);
			System.out.println("\t Employee Company Address = "+company_address);
			System.out.println("\t Employee Designation = "+emp_desg);
			System.out.println("\t Employee Experience(in years) = "+emp_exp);
			System.out.println("\t Employee Salary(per annum) = "+salary);
			System.out.println("\t Employee Joining date = "+emp_join_date);
		}
		int gettotal(){
			return(total);}
		String getempname(){
			return(emp_name);}
		int getID(){
			return(emp_ID);}
		String getcompanyname(){
			return(company_name);}
		String getcompanyaddress(){
			return(company_address);}
		String getdesg(){
			return(emp_desg);}
		int getempexp(){
			return(emp_exp);}
		long getsalary(){
			return(salary);}
		String getempjoindate(){
			return(emp_join_date);}

		//setters
		void setempname(String name)
		{
			this.emp_name = name;
			setname2(name);
		}
		void setdata3(){
			this.emp_name = "";
			this.emp_ID = -1;
			this.company_name = "";
			this.company_address = "";
			this.emp_desg = "";
			this.emp_exp = -1;
			this.salary = -1;
			this.emp_join_date= "";
			setdata2();
		}
		void setID(int id){
			this.emp_ID = id;}
		void setcompanyname(String name){
			this.company_name = name;}
		void setcompanyaddress(String address){
			this.company_address = address;}
		void setdesg(String d){
			this.emp_desg = d;}
		void setempexp(int e){
			this.emp_exp = e;}
		void setsalary(long s){
			this.salary = s;}
		void setempjoindate(String d){
			this.emp_join_date = d;}

		void professional_data(){
			System.out.println("\t Employee ID = "+emp_ID);
			System.out.println("\t Employee Company Name = "+company_name);
			System.out.println("\t Employee Company Address = "+company_address);
			System.out.println("\t Employee Designation = "+emp_desg);
			System.out.println("\t Employee Experience(in years) = "+emp_exp);
			System.out.println("\t Employee Salary(per annum) = "+salary);
			System.out.println("\t Employee Joining date = "+emp_join_date);
		}
		void displayAll(){
			System.out.println("\t Employee Name = "+emp_name);
			display3();
			display2();
			display1();
		}
}

class EmployeeRecord{
	public static void main(String args[]){
		/*Professional A = new Professional();
		A.input3();
		A.displayAll();*/
		try{
		operation A = new operation();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total_employee = 0;
		Professional P[] = new Professional[50];
		int a = 0;
		int ch;
		do
		{
			System.out.println("\tEnter Option : ");
			System.out.println("\t1. INSERT");
			System.out.println("\t2. DISPLAY");
			System.out.println("\t3. DELETE");
			System.out.println("\t0. EXIT");
			ch = Integer.parseInt(br.readLine());
			switch(ch){
				case 1:
				{
					System.out.println("\tEnter Number of Records to Insert : ");
		            total_employee = Integer.parseInt(br.readLine());
		            A.settotal(total_employee);
					if(a == 0){
						for(int i = 0; i < total_employee; i++){
							P[i] = new Professional();
						}
						for(int j = 0; j < total_employee; j++){
							P[j].input3();
						}
						a = -1;
					}
					else{
						int p = A.gettotal();
						P[p].input3();
						total_employee++;
						A.settotal(total_employee);
						a = -1;
					}
				}
				break;
				case 2:
				{
					for(int j = 0; j < total_employee; j++){
						P[j].displayAll();
						System.out.println("-------------------------------------------------------------------------------------");
					}
				}
				break;
				case 3:
				{
					System.out.println("\t Enter Employee ID to Delete : ");
					int id = Integer.parseInt(br.readLine());
					int flag = 0;
					int i;
					for(i = 0; i < total_employee; i++){
						if(id == P[i].getID())
						{
							flag = 1;
							break;
						}
						else{
							System.out.println("\t Element not found !!");
						}
					}
					P[i].setdata3();
				}
			}
		}while(ch != 0);
	}
	catch(IOException e){}
	}
}


