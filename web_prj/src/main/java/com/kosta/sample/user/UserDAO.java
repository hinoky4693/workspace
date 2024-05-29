package com.kosta.sample.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.kosta.sample.common.MyOracleConnection;

// Data Access Object : DML

public class UserDAO {
	public int userInsert(UserVO uvo) {
		MyOracleConnection oc = new MyOracleConnection();
		DataSource ds = null;
		Connection conn = null;
		int insertRows = 0;
		
		try {
//			conn = oc.oracleConn();
			ds = oc.myOracleDataSource();
			conn = ds.getConnection();
			if (conn != null) System.out.println("conn ok!");
			else System.out.println("conn failed!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		PreparedStatement pstmt = null;
		String sql = "insert into users values(users_seq.nextval, ?, ?, ?, ?, sysdate, 'u')";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uvo.getUserid());
			pstmt.setString(2, uvo.getUname());
			pstmt.setString(3, uvo.getEmail());
			pstmt.setString(4, uvo.getPasswd());
			insertRows = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return insertRows;
	}
	
	public UserVO userLogin(String userid, String passwd) {
		MyOracleConnection oc = new MyOracleConnection();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DataSource ds = null;
		UserVO uvo = null;
		
		try {
			ds = oc.myOracleDataSource();
			conn = ds.getConnection();
			String sql = "select userid, uname, grade from users where userid = ? and passwd = ?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, passwd);
			rs = pstmt.executeQuery();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		try {
			if(rs.next()) {
				uvo = new UserVO();
				uvo.setUserid(rs.getString("userid"));
				uvo.setUname(rs.getString("uname"));
				uvo.setGrade(rs.getString("grade"));
				uvo.setLoginCheck(true);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return uvo;
	}	
}
