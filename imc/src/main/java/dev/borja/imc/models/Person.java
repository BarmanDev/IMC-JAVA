package dev.borja.imc.models;

public class Person {

    private String name = "";
    private double wight = 0.0;
    private double height = 0.0;

    public Person(String name, float wight, float height){

        this.name = name;
        this.wight = wight;
        this.height = height;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



}
