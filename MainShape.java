//student number: 121376141
//student name: Peace Samuel
//Program 4: Shapes

import java.util.*;
public class MainShape{
    //test out the classes
    public static void main(String[] args){
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        s1.setColor("blue");
        System.out.println(s1.toString());
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        Rectangle r1 = new Rectangle();
        r1.setLength(2.0);
        System.out.println(r1.toString());
        System.out.println("Area of rectangle:"+r1.getArea());
        Square s = new Square();
        System.out.println(s.toString());
        System.out.println(s.isFilled());
        System.out.println("Area of square:"+s.getArea());
    }
}

public class Shape{
    //SUPERCLASS//
    //(instance variables)
    String color; //color of shape
    boolean filled; //states whether shape is filled or not

//constructor
    public Shape(){
        //default values for the shape
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
//getters and setters
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }
//other methods
    public String toString(){
        return "Shape[color:"+color+", filled:"+filled+"]";
    }
}

public class Circle extends Shape{
    //SUBCLASS//
    //(instance variables)
    double radius; //radius of circle
//constructor
    public Circle(){
        super(); //uses constructor from superclass
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        //area of circle formula: pi(r-squared)
        double area = Math.PI * radius* radius;
        return area;
    }

    public double getPerimeter(){
        //perimeter formula: 2pi(radius)
        double perimeter =2*Math.PI*radius;
        return perimeter;
    }

    public String toString(){
        String string = "";
        string = "Circle[radius:" +radius+"], "+ "Subclass of: "+ super.toString();
        return string;
    }
}

public class Rectangle extends Shape{
    //SUBCLASS// +//SUPERCLASS//[SQUARE]
    //(instance variables)
    double width; //width of rectangle
    double length; //length of rectangle
//constructor
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
//getter and setters
    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        //area of rectangle formula: l*w
        double area = length*width;
        return area;
    }

    public double getPerimeter(){
        //perimeter of rectangle: 2*l+2*w
        double perimeter = (2*length) + (2*width);
        return perimeter;
    }

    public String toString(){
        String string ="";
        string = "Rectangle[width:"+width+", length:"+length+"], Subclass of:"+ super.toString();
        return string;
    }
}

public class Square extends Rectangle{
    //SUBCLASS//
    //(no instance variables, inherits from superclass)
//constructor
    public Square(){
        super();
    }

    public Square(double side){
       super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return length;
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side){
        this.width = side;
        this.length = side;
    }

    public void setLength(double side){
        this.length = side;
        this.width = side;
    }

    public String toString(){
        String string = "";
        string = "Square["+ super.toString()+"]";
        return string;
    }
    //Don't need to override getArea() and getPerimeter()//

}