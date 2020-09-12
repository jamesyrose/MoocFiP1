package Part6;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
	private ArrayList<String> todo; 
	private Scanner reader;
	

	public ToDoList() {
		this.todo = new ArrayList<>();
		this.reader = new Scanner(System.in);
	}
	
	public void start() {
		boolean cont = true;
		while(cont) {
			System.out.print("Command: ");
			String command = reader.nextLine();
			String comm = command.toLowerCase().trim();
			if (comm.equals("add")) {
				add();
			}else if(comm.equals("list")) {
				listTasks();
			}else if(comm.equals("completed")) {
				taskCompleted();
			}else if (comm.equals("stop")) {
				cont = false; 
			}else {
				System.out.println("invalid command");
			}
		}
		
		
	}
	
	public void add() {
		System.out.print("Task: ");
		String task = reader.nextLine();
		todo.add(task);
	}
	
	public void listTasks() {
		if (todo.isEmpty()) {
			System.out.println("No Tasks to do");
		}else {
			int count = 1;
			for (String task: todo) {
				System.out.println(count + ": " + task);
			}
		}
	}
	
	public void taskCompleted() {
		System.out.print("Which task was completed: ");
		int completed = Integer.valueOf(reader.nextLine());
		todo.remove(completed - 1);  // -1 for correct indexing 
	}

}
