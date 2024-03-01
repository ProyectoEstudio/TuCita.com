
package Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    	private static String servidor="jdbc:mysql://localhost/actividades";
	private static String user="root";//Nombre de usuario por defecto
	private static String pass="Neocp.140681";//Clave por defecto
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static Connection conexion;
	

	public Connection getConnection(){
		System.out.println("Conexión realizada con éxito");
		return conexion;//Devuelvo el objeto Conexion
	}
    public static void main(String[] args) {
        // TODO code application logic here
    	

    		try {
    			Class.forName(driver);//Levanto el Driver
    			conexion=DriverManager.getConnection(servidor, user, pass);//Establezco la conexión
    			System.out.println("Conexión realizada con éxito");
    		} catch (ClassNotFoundException | SQLException e) {
    			System.out.println("Conexión Fallida");
    		}
    	

    }
    
}

