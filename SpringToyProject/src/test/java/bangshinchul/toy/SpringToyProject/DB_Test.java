package bangshinchul.toy.SpringToyProject;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DB_Test {

	@Test
	public void test() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Class.forName("org.mariadb.jdbc.Driver"); // 마리아db
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bangshinchul?useSSL=false&serverTimezone=UTC", "bsc","Tlscjf.12@");//mysql
		// Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/bangshinchul?useSSL=false&serverTimezone=UTC", "bsc","Tlscjf.12@"); // 마리아db
		// useSSL과 serverTimezome의 파라미터값은 무조건 셋팅해줘야함.
		System.out.println(con);
	}
	
}
