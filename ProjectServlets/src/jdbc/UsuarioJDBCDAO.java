package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import comun.Pool;

public class UsuarioJDBCDAO {
	public UsuarioDTO leerUsuario(String nombre, String password)
	{
		ResultSet rset = null;
		Statement stmt = null;		
		Connection conn = null;
		
		try {
			conn = Pool.getConnection();
			stmt = conn.createStatement();
			String sqlQuery = "SELECT * FROM USERS WHERE USER_NAME='" + nombre + "' AND USER_PASS='" + password + "'";
			System.out.println("UsuarioJDBCDTO - leerUsuario - rset: " + sqlQuery);
			rset = stmt.executeQuery(sqlQuery);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		UsuarioDTO e = null;
		try {
			if (rset.next())
			{
				//rset.next();
				e = new UsuarioDTO(
					rset.getString(1),
					rset.getString(2));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		finally
		{
			Pool.liberarRecursos(conn, stmt, rset);
		}
		return e;		
	}

}
