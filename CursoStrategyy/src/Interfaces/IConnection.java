package Interfaces;

import java.sql.Connection;
import java.util.ArrayList;
import Models.Course;

/**
 * Defines the interface IConnection for this project.
 */
public interface IConnection {
	Connection openConnection();
	void register(Course course);
	ArrayList<Course> list();
	void closeConnection(Connection connection);
	Connection connectDatabase();
}
