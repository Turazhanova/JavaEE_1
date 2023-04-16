package com.example.mynew.db;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Task> tasks = new ArrayList<>();
    private static int id = 3;

    static {
        tasks.add(
                new Task(1,
                        "Java 1",
                        "Course about Java",
                        "2022-11-11"
                )
        );
        tasks.add(
                new Task(2,
                        "Java 2",
                        "Advanced Java",
                        "2022-12-22"
                )
        );
    }
    public static ArrayList<Task> getTasks() {
        return tasks;
    }
    public static void addTask(Task task) {
        task.setId(id++);
        tasks.add(task);
    }
    public static Task getTask(int id) {
        for(Task t : tasks) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
    public static void deleteTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).getId() == id){
                tasks.remove(i);
                return;
            }
        }
    }
}
