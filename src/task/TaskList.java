/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Kush3
 */
public class TaskList {
    private static ArrayList<String> taskList;
    private static Connection conn = DBConnect.getConnection();
    private static Statement stmt;
    
    static {
        taskList = new ArrayList<>();
    }
    
    /**
     * Prints all the tasks line-by-line that are available in the taskList
     */
    public static void printAllTasks() {
        for (String next : taskList) {
            System.out.println(next);   
        }
    }
    
    /**
     * Returns a 2 Dimensional String array of all the tasks so that they can be displayed in the JTable
     * @return 2 Dimensional String array
     */
    public static String[][] get2DArray() {
        int size = taskList.size();
        String[][] array = new String[size][];
        
        for(int i = 0; i < taskList.size(); i++) {
            String[] arr = {taskList.get(i)};
            array[i] = arr;
        }
        return array;
    }
    
    /**
     * Adds a new task to the taskList ArrayList and the database
     * @param task String task entered by the user
     * @return true if the task is added successfully else false
     * @throws java.sql.SQLException
     */
    public static boolean addTask(String task) throws SQLException {
        stmt = conn.createStatement();
        // INSERTING THE TASK IN THE TASK DATABASE
        stmt.execute("INSERT INTO tasks VALUES('" + task + "')");
        return taskList.add(task);
    }
    
    /**
     * Removes the Specified task from the taskList ArrayList and the database
     * @param task String task that the user Specifies to remove
     * @return true if the task is removed successfully else false
     * @throws java.sql.SQLException
     */
    public static boolean removeTask(String task) throws SQLException {
        stmt = conn.createStatement();
        // INSERTING THE TASK IN THE TASK DATABASE
        stmt.execute("DELETE FROM tasks WHERE task = '" + task + "'");
        return taskList.remove(task);
    }
    
    /**
     * Checks if the taskList already contains a particular task
     * @param task The task to run duplicacy check on
     * @return true if there is a duplicate else false
     */
    public static boolean checkDuplicates(String task) {
        for(String next : taskList) {
            if(next.equalsIgnoreCase(task)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * This method initializes the taskList with a new ArrayList
     * @param tasks ArrayList of tasks
     */
    public static void initializeTaskList(ArrayList<String> tasks) {
        taskList = tasks;
    }
}
