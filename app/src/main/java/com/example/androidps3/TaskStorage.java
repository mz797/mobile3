package com.example.androidps3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static TaskStorage instance;
    private static final TaskStorage taskStorage = new TaskStorage();
    private final List<Task> tasks;


    public static TaskStorage getInstance(){
        if(instance == null) {
            instance = new TaskStorage();
        }
        return instance;

    }
    private TaskStorage(){
        tasks = new ArrayList<>();
        for( int i = 0; i <= 10; i++){
            Task task = new Task();
            task.setName("Zanim umrzesz " + i  );
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public Task getTask(UUID taskId) {
        for(Task task : tasks) {
            if(taskId.equals(task.getId())){
                return task;
            }
        }
        return null;
    }
}
