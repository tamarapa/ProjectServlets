package jdbc;


public class UsuarioDTO {
	private String user_name;
	private String user_pass;
	
	public UsuarioDTO () {
		
	}
	

	@Override
	public String toString() {
		return "Usuario [user_name=" + user_name
				+ ", user_pass=" + user_pass + "]";
	}


	public UsuarioDTO(String user_name, String user_pass) {
		super();
		this.user_name = user_name;
		this.user_pass = user_pass;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getUser_pass() {
		return user_pass;
	}


	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}


		
}
