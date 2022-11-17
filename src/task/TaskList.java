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
    
    public void printAllTasks() {
        for (String next : taskList) {
            System.out.println(next);   
        }
    }
}
