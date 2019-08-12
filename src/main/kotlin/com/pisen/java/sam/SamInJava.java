package com.pisen.java.sam;

import java.util.ArrayList;

public class SamInJava {

    public SamInJava(){

    }

    public ArrayList<Runnable> runnables = new ArrayList<>();

    public void addTask(Runnable r){
        runnables.add(r);
        System.out.println("After add"+r+",we have "+runnables.size()+"all in");
    }

    public void removeTask(Runnable r){
        runnables.remove(r);
        System.out.println("After removed"+r+",we have "+runnables.size()+"left");
    }

}
