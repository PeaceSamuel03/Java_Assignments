//student number: 121376141
//student name: Peace Samuel

import java.util.*;
//Program 1: Polyline
public class Polyline {
    ArrayList<Point> points; //list of points

    static class Point {
    //point class, initializes point instances
    //points have an x and y value (instance variables)
    int x;
    int y;
    //constructor to create a new point
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
//constructor to create a new polyline
//one created with no input and the other created with an array list
    public Polyline(){
        points = new ArrayList<Point>();
    }
    public Polyline(ArrayList<Point> points){
        this.points = points;
    }

    public void appendPoint(int x, int y){
        //append or add point to the list using (x,y) values
        Point point = new Point(x, y);
        points.add(point);
    }
    public void appendPoint(Point point){
        //append or add point using point instance
        points.add(point);
    }
    public String toString(){
        //print string representation of the points in the polyline
        System.out.print("Points in polyline: ");
        String string = "";
        for(Point point : points){
            string = "(" + point.x +","+ point.y + ")";
            System.out.print(string);
        }
        System.out.println();
        return string;
    }
    public void getLength(){
        //find and return as a double the length of the polyline
        double length = 0;
        for (int i =0; i< points.size()-1; i++){
            Point p = points.get(i);
            Point p1 = points.get(i+1);
            //use distance formula for finding the distance of a line, using x and y values
            double dx = p.x - p1.x;
            double dy = p1.y - p1.y;
            double distance = Math.sqrt(dx*dx + dy*dy);
            //add together all the distances to find the total length
            length += distance;
        }
        System.out.print("Length of the polyline: ");
        System.out.println(length);
    }

    public static void main(String[] args){
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(1,2));
        points.add(new Point (3,4));
        Polyline line1 = new Polyline(points);
        line1.appendPoint(new Point(5,6));
        line1.appendPoint(8,3);
        line1.toString();
        line1.getLength();
        Polyline line2 = new Polyline();
        line2.appendPoint(8,9);
        line2.appendPoint(new Point(2,3));
        line2.toString();
        line2.getLength();
    }
}

