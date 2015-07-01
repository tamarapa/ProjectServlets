package jdbc;


public class DepartamentoDTO {
	private int DEPARTMENT_ID;
	private String DEPARTMENT_NAME;
	private String MANAGER_ID;
	private String LOCATION_ID;
	
	public DepartamentoDTO () {
		
	}
	

	@Override
	public String toString() {
		return "Departamento [id=" + DEPARTMENT_ID + ", DEPARTMENT_NAME=" + DEPARTMENT_NAME
				+ ", MANAGER_ID=" + MANAGER_ID + ", LOCATION_ID=" + LOCATION_ID + "]";
	}


	public DepartamentoDTO(int DEPARTMENT_ID, String DEPARTMENT_NAME, String MANAGER_ID, String LOCATION_ID) {
		super();
		this.DEPARTMENT_ID = DEPARTMENT_ID;
		this.DEPARTMENT_NAME = DEPARTMENT_NAME;
		this.MANAGER_ID = MANAGER_ID;
		this.LOCATION_ID = LOCATION_ID;
	}


	public int getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}


	public void setDEPARTMENT_ID(int dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}


	public String getDEPARTMENT_NAME() {
		return DEPARTMENT_NAME;
	}


	public void setDEPARTMENT_NAME(String dEPARTMENT_NAME) {
		DEPARTMENT_NAME = dEPARTMENT_NAME;
	}


	public String getMANAGER_ID() {
		return MANAGER_ID;
	}


	public void setMANAGER_ID(String mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}


	public String getLOCATION_ID() {
		return LOCATION_ID;
	}


	public void setLOCATION_ID(String lOCATION_ID) {
		LOCATION_ID = lOCATION_ID;
	}


		
	
}
