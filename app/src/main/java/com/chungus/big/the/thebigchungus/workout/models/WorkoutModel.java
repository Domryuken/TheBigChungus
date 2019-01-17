package com.chungus.big.the.thebigchungus.workout.models;

public class WorkoutModel {

    private String name;
    private int amount;
    private int reps;
    private int sets;

    public WorkoutModel(String name, int amount, int reps, int sets){
        this.name = name;
        this.amount = amount;
        this.reps = reps;
        this.sets = sets;
    }

    public void setName(String name){this.name = name;}
    public void setAmount(int amount){this.amount = amount;}
    public void setReps(int reps){this.reps = reps;}
    public void setSets(int sets){this.sets = sets;}
    public String getName(){return name;}
    public int getAmount(){return amount;}
    public int getReps(){return reps;}
    public int getSets(){return sets;}
}
