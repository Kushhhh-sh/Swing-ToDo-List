/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.ArrayList;

/**
 *
 * @author Kush3
 */
public class TaskList {
    private static final ArrayList<String> taskList;
    
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
     * Adds a new task to the taskList ArrayList
     * @param task String task entered by the user
     * @return true if the task is added successfully else false
     */
    public static boolean addTask(String task) {
        return taskList.add(task);
    }
    
    /**
     * Removes the Specified task from the taskList ArrayList
     * @param task String task that the user Specifies to remove
     * @return true if the task is removed successfully else false
     */
    public static boolean removeTask(String task) {
        return taskList.remove(task);
    }
}
