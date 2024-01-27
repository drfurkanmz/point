
package com.mycompany.point;


public class Point {

    private int x ;
    private int y;
    
    public Point (){
        
        x=0;
        y=0;
    }
    public Point (int x,int y){
        this.x=x;
        this.y =y;
        
    }
    public Point(Point pt){
        this.x=pt.x;
        this.y=pt.y;
        
    }
                
    

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    
    public String toString() {
        return "["+ x + "," + y + ']';
    }

    
        
    public  boolean equals(Point pt1){
        return ((pt1.getX()==x)&& (pt1.getY()==y));
    }
    
} 
  
    
            
        
   

