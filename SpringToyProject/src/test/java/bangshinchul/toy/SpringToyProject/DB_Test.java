package bangshinchul.toy.SpringToyProject;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DB_Test {

	@Test
	public void test() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Class.forName("org.mariadb.jdbc.Driver"); // ������db
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bangshinchul?useSSL=false&serverTimezone=UTC", "bsc","Tlscjf.12@");//mysql
		// Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/bangshinchul?useSSL=false&serverTimezone=UTC", "bsc","Tlscjf.12@"); // ������db
		// useSSL�� serverTimezome�� �Ķ���Ͱ��� ������ �����������.
		System.out.println(con);
	}
	
}
