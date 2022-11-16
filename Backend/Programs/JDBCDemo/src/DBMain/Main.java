package DBMain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
//			creating conncetion
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/first?user=root&password=Vgd@54321");
//		    fetching data
//			Statement statement = connection.createStatement();
//		    ResultSet resultSet = statement.executeQuery("select * from animals");
//		    while(resultSet.next()) {
//		    	for(int i=1;i<=5;i++) {
//		    		System.out.print(resultSet.getString(i)+" ");
//		    	}
//		    	System.out.println();
//		    }
//		    data insertion
		    PreparedStatement preparedStatement=connection.prepareStatement("update animals set name=? where id=?");
		    preparedStatement.setString(1, "tuffy");
		    preparedStatement.setInt(2, 1);
		    int status=preparedStatement.executeUpdate();
		    if(status==1) {
		    	System.out.println("Data Updated");
		    }else {
		    	System.out.println("Some Problem");
		    }
		    
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
