package com.example.kcalapp;

public class Food {
    private String name;
    private String type;
    private int kcal;

    public Food(String setName, String setType, int setKcal){
        name = setName;
        type = setType;
        kcal = setKcal;
    }

    public String toString(){
        return name;
    }

    public String getName(){
        return name;
    }

    public String info(){
        String info=name;
        info+=" are ";
        info+=type;
        info+=" that has ";
        info+=Integer.toString(kcal);
        info+=" kcal per 100g.";
        return info;
    }
}
