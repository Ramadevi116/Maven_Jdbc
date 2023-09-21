package spring.prac.dayprac.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import spring.prac.dayprac.dto.Prac;

public class PracDaoImpl implements PracDao {

	@Override
	public List<Prac> getDetails() {
		// TODO Auto-generated method stub
		String Driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/stu";
		String username="root";
		String password="sql834";
		List<Prac> prac=new ArrayList<Prac>();
		try {
		Class.forName(Driver);
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery("select * from stulist");
		while(res.next()) {
			String name=(res.getString(1));
			String surname=(res.getString(2));
			Prac prac1=new Prac(name,surname);
			prac.add(prac1);
			}
		con.close();
		
	}catch(Exception e) {}
		return prac;
	}

}
