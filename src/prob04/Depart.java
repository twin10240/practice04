package prob04;

public class Depart extends Employee {

	private String dept;
	
	public Depart(String name, int salary, String dept) {
		super(name, salary);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public void getInformation() {
		System.out.println( "이름:" + getName() + "\t연봉:" + getSalary()  + "\t부서:" + getDept());
	}
}
