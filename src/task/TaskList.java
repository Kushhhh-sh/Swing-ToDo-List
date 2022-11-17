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
    
    public static void printAllTasks() {
        for (String next : taskList) {
            System.out.println(next);   
        }
    }
    
    public static String[][] get2DArray() {
        int size = taskList.size();
        String[][] array = new String[size][];
        
        for(int i = 0; i < taskList.size(); i++) {
            String[] arr = {taskList.get(i)};
            array[i] = arr;
        }
        return array;
    }
    
    public static boolean addTask(String task) {
        return taskList.add(task);
    }
}
