package murach.test;

public class Employee implements DepartmentConstants,Displayable{

    private int department;
    private String firstName;
    private String lastName;

    public Employee(int department, String lastName, String firstName) {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
    }

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(department==1) {
			return firstName+" "+lastName +", ("+ this.ADMIN + ")";
		}
		else if(department==2) {
			return firstName+" "+lastName +", ("+ this.EDITORIAL + ")";
		}
		else {
			return firstName+" "+lastName +", ("+ this.MARKETING + ")";
		}
	}
}