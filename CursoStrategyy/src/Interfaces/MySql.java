package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Models.Course;

/**
 * Defines the class MySql for this project.
 */
public class MySql implements IConnection{
	Connection conn = null;
	PreparedStatement stm;
	ResultSet rs;

	@Override
	public void register(Course course) {
		String sql = "INSERT INTO course (Name, Description, WorkloadHours, TargetAudienceId, Price) VALUES (?, ?, ?, ?, ?)";
		
		Connection conn = openConnection();
		
		try {
			stm = conn.prepareStatement(sql);
			
			stm.setString(1, course.getName());
			stm.setString(2, course.getDescription());
			stm.setInt(3, course.getWorkloadHours());
			stm.setInt(4, course.getTargetAudienceId());
			stm.setFloat(5, course.getPrice());
			
			stm.execute();
			stm.close();
			
		closeConnection(conn);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	@Override
	public Connection openConnection() {
		conn = connectDatabase();
		return conn;
	}

	@Override
	public ArrayList<Course> list() {
		ArrayList<Course> courses = new ArrayList<Course>(); 
		String sql = "Select * from course"; 
		openConnection();
		try {
			stm = conn.prepareStatement(sql);
			rs = stm.executeQuery();
			
			
			while(rs.next()) {
				courses.add(new Course(rs.getString("Name"), rs.getInt("WorkloadHours"), rs.getFloat("Price"), 
						rs.getString("Description"), rs.getInt("TargetAudienceId")));
			}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		return courses;
	}

	@Override
	public void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
	}

	@Override
	public Connection connectDatabase() {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/Course?user=root&password=your_password";
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return conn;
	}
}
