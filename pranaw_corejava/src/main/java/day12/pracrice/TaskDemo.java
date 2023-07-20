package day12.pracrice;

import java.util.List;

import day11.practice.DAOException;

public class TaskDemo {
	public static void main(String[] args) throws DAOException {
		Task task = new Task();
		task.name ="practice";
		task.status="process";
		TaskDAO.createTask(task);

		List<Task> allTasks = TaskDAO.getAllTasks();
		for (Task t : allTasks) {
			System.out.println("ID: " + t.id + ", Name: " + t.name + ", Status: " + t.status);
		}

	}
}
