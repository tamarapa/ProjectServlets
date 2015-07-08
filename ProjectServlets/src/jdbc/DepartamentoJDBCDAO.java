package jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import comun.IRecuperable;
import comun.Pool;


public class DepartamentoJDBCDAO  {
	
	public ArrayList<DepartamentoDTO> obtenerDepartamentos()
	{
		System.out.println("entra en obtenerDepartamentos");
		ResultSet rset = null;
		Statement stmt = null;		
		Connection conn = null;
		
		try {
			conn = Pool.getConnection();
			stmt = conn.createStatement();
			String sqlQuery = "SELECT * FROM DEPARTMENTS";
			rset = stmt.executeQuery(sqlQuery);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ArrayList<DepartamentoDTO> listaDepartamentos = new ArrayList<DepartamentoDTO>();
		DepartamentoDTO dpto = null;
		try {
			while(rset.next())
			{
				dpto = new DepartamentoDTO(
					rset.getInt(1),
					rset.getString(2),
					rset.getString(3),
					rset.getString(4));
				listaDepartamentos.add(dpto);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		finally
		{
			Pool.liberarRecursos(conn, stmt, rset);
		}
		System.out.println("listaDepartamentos: " +listaDepartamentos);
		return listaDepartamentos;		
	}

	public ArrayList<EmpleadoDTO> obtenerEmpleados(String id) {
		// TODO Auto-generated method stub
		ResultSet rset = null;
		Statement stmt = null;		
		Connection conn = null;
		
		try {
			conn = Pool.getConnection();
			stmt = conn.createStatement();
			String sqlQuery = "SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID=" + id;
			rset = stmt.executeQuery(sqlQuery);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ArrayList<EmpleadoDTO> listaEmpleados = new ArrayList<EmpleadoDTO>();
		EmpleadoDTO e = null;
		try {
			while(rset.next())
			{
				e = new EmpleadoDTO(
					rset.getInt(1),
					rset.getString(2),
					rset.getString(3),
					rset.getString(4),
					rset.getString(5),
					rset.getString(6),
					rset.getString(7),
					rset.getString(8),
					rset.getString(9),
					rset.getString(10),
					rset.getString(11));
				listaEmpleados.add(e);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		finally
		{
			Pool.liberarRecursos(conn, stmt, rset);
		}
		return listaEmpleados;
	}

	
	
	
}
