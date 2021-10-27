package com.maven.spring;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDemo {

	public static void main(String[] args) throws SQLException {
		String host="localhost";
		String port="3306";
		String query= "select name,address from customertable where id=101";
				
        Connection con= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/customerdatabase","root","Root@1234");
        Statement s=con.createStatement();
        ResultSet rs= s.executeQuery(query);
        rs.next();
        String name=rs.getString("name");
        String address =rs.getString("address");
        System.out.println(name+" "+address);

	}

}
