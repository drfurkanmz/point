/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point;

/**
 *
 * @author furka
 */
public class Circle {

    private static Object math;
    private Point center;
    private int radius;
    
    public Circle() {
        radius=0;
        
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        if  (radius<=0){
            System.out.println("Yanlis deger girdiniz");
            System.exit(0);
    }
    }
    public Circle(Circle cr){
        this.center = cr.center;
        this.radius = cr.radius;
    
    
            
    }
    
    

    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
        
    }

    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }

    
    
    public boolean equals(Circle cr1){
        return ((cr1.getCenter()==center)&& (cr1.getRadius()==radius));
    }
    public static double  alanhesapla(int radius){
        return Math.PI*radius*radius;
        
    } 

}

