package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public DBConnection() {

	 }
	
	private static Connection connection = null;

	public static java.sql.Connection getConexaoMySQL() {

	              

		if(connection != null ) {
			return connection;
		}
		

	try {



	String driverName = "com.mysql.cj.jdbc.Driver";

	Class.forName(driverName);



	        String serverName = "localhost"; 

	        String mydatabase = "fatec";       

	        String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true&serverTimezone=UTC";

	        String username = "root";       

	        String password = "root";     
	        connection = DriverManager.getConnection(url, username, password);


	       

	        return connection;



	        } catch (ClassNotFoundException e) {  



	            System.out.println("O driver nao foi encontrado.");

	            return null;

	        } catch (SQLException e) {


	            System.out.println("Nao foi possivel conectar ao Banco de Dados." + e);

	            return null;

	        }



	    }



	    public static boolean FecharConexao() {

	        try {

	            connection.close();

	            return true;

	        } catch (SQLException e) {

	            return false;

	        }



	    }



	 

	

}
