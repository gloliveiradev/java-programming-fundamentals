package Models;

import java.util.ArrayList;

import Interfaces.IConnection;
import Interfaces.MySql;
import Interfaces.SqlServer;

/**
 * Defines the class Course for this project.
 */
public class Course {
	private String Name;
	private int WorkloadHours;
	private float Price;
	private String Description;
	private int TargetAudienceId;
	private IConnection Connection;
	
	public IConnection getConnection() {
		return Connection;
	}

	public void setConnection(IConnection connection) {
		Connection = connection;
	}
	
	public Course(int opConnection) {
		if(opConnection == 1)
			Connection = new MySql();
		else 
			Connection = new SqlServer();
	}
	
	public Course(String name, int workloadHours, float price, String description, int targetAudienceId) {
		Name = name;
		WorkloadHours = workloadHours;
		Price = price;
		Description = description;
		TargetAudienceId = targetAudienceId;
	}

	public Course(String name, int workloadHours, float price, String description, int targetAudienceId, int opConnection) {
		Name = name;
		WorkloadHours = workloadHours;
		Price = price;
		Description = description;
		TargetAudienceId = targetAudienceId;
		if(opConnection == 1)
			Connection = new MySql();
		else 
			Connection = new SqlServer();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getWorkloadHours() {
		return WorkloadHours;
	}

	public void setWorkloadHours(int workloadHours) {
		WorkloadHours = workloadHours;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getTargetAudienceId() {
		return TargetAudienceId;
	}

	public void setTargetAudienceId(int targetAudienceId) {
		TargetAudienceId = targetAudienceId;
	}
	public void register(Course course) {
		Connection.register(course);
	}
	public ArrayList<Course> listCourses() {
		ArrayList<Course> courses = Connection.list();
		return courses;
	}
}
