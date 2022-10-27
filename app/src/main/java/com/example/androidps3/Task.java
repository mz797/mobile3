package com.example.androidps3;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task(){
        id = UUID.randomUUID();
        date = new Date();
    }

    public Date getDate(){
        return this.date;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDone(boolean done){
        this.done = done;
    }

    public boolean isDone(){
        if(this.done){
            return true;
        }
        return false;
    }
    public UUID getId(){
        return id;
    }
    public String getName() {
        return name;
    }



}
