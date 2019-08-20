package com.cg.tms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.cg.tms.exception.ErrorMessages;
import com.cg.tms.exception.ProgramException;
/***
 * 
 * @author Amit Kumar
 *Interacting with database
 */
public class ConnectionDB {
	private static Connection connection;

	public static Connection getConnection() throws ProgramException {
		try {
			if (null == connection) {
				
//				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "sys as sysdba",
						"system");
				connection.setAutoCommit(true);
				return connection;
			}
			return connection;
		} catch (SQLException e) {
			throw new ProgramException(ErrorMessages.MESSAGE8);
		}
	}
	public static void closeConnection() throws ProgramException {
		try {
			connection.close();
		} catch (SQLException e) {
		throw new ProgramException(ErrorMessages.MESSAGE3);
		}
	}

}
