//student number: 121376141
//student name: Peace Samuel
//Program 3: Circle & Cylinder

import java.util.*;
public class MainCircle{
    public static void main(String args[]){
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println("Area of the circle: "+ circle1.getArea());
        circle1.setColor("blue");
        circle1.toString();
        Cylinder c1 = new Cylinder(0.1,1.0,"blue");
        System.out.println(c1.toString());
        System.out.println("Area of the cylinder: "+ c1.getArea());
    }
}

public class Circle {
    //SUPERCLASS//
    //(instance variables)
    double radius; //radius of circle 
    String color; //color of circle 

//constructor to create a new circle
    public Circle(){
        //set default construct values for radius and color
        this.color = "red";
        this.radius = 0.1;
    }

    public Circle(double radius){
        this.color = "red";
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
//getters and setters
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
//other methods
    public double getArea(){
        //use area of a circle formula, pi(r-squared)
        double area = Math.PI *radius * radius;
        return area;
    }
    public String toString(){
        //print string representation of the circle
        String string ="";
        string = "Circle"+ "[radius:" + radius +", color:" + color +  "]";
        return string;
    }
}


public class Cylinder extends Circle{
    //SUBCLASS//
    //(instance variables)
    double height; //height of the cylinder
//constructor
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double radius){
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(){
        super(); //uses radius and color default value from  circle superclass
        this.height = 1.0;
    }
//getters and setters
    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        //volume formula =base_area * height
        double base_area = Math.PI *radius * radius;
        double volume = base_area*height;
        System.out.println("the volume of this cylinder: "+ volume);
        return volume;
    }

    @Override
    public double getArea(){
        //override Circle area method//
        //use area formula: 2pi *radius *height+ (2base-area)
        //base area: pi(radius-squared)
        double base_area = Math.PI *radius * radius;
        double area = (2*(Math.PI)*radius*height) + base_area;
        return area;
    }
//other methods
    @Override
    public String toString() {
        return "Cylinder[radius: " + getRadius() + ", height: " + height + ", color: " + color+ "]";
    }
}

