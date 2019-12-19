package com.company;

public class Car implements ColourChange{
    private String name;
    private double weight;
    private String colour;

    @Override
    public void changeColor(String color) {
        System.out.println("You recolored your car to"+ " " + color);
    }

    public class Window{
        private String opacity;
        void Down(){
            System.out.println("Vi opustili okno");
        }
        void Up(){
            System.out.println("Vi podnyali okno");
        }

    }
    void moveRight(){
        System.out.println("Vi podvinuli maschinu vpravo");
    }
    void moveLeft(){
        System.out.println("Vi podvinuli maschinu vlevo");
    }
    void pickUp(){
        System.out.println("Vi podnyali maschinu");
    }
}