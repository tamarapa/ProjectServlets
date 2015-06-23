package jdbc;


public class EmpleadoDTO {
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private String hire_date;
	private String job_id;
	private String salary;
	private String commission_pct;
	private String manager_id;
	private String department_id;
	
	public EmpleadoDTO () {
		
	}
	

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email
				+ ", phone_number=" + phone_number + ", hire_date=" + hire_date
				+ ", job_id=" + job_id + ", salary=" + salary
				+ ", commission_pct=" + commission_pct + ", manager_id="
				+ manager_id + ", department_id=" + department_id + "]";
	}


	public EmpleadoDTO(int id, String first_name, String last_name, String email,
			String phone_number, String hire_date, String job_id, String salary,
			String commission_pct, String manager_id, String department_id) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.hire_date = hire_date;
		this.job_id = job_id;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.manager_id = manager_id;
		this.department_id = department_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public String getHire_date() {
		return hire_date;
	}


	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}


	public String getJob_id() {
		return job_id;
	}


	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getCommission_pct() {
		return commission_pct;
	}


	public void setCommission_pct(String commission_pct) {
		this.commission_pct = commission_pct;
	}


	public String getManager_id() {
		return manager_id;
	}


	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}


	public String getDepartment_id() {
		return department_id;
	}


	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	
	
	
}
