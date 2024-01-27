
package com.mycompany.point;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;

import java.io.BufferedReader;




public class deneme {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        double maxalan=0;
       
        
        BufferedReader inputStream = null;
		
 
        try {
            inputStream = new BufferedReader(new FileReader("C:/Users/furka/OneDrive/Masaüstü/girdiQuiz1.txt"));
			
 
            String satir;
            while ((satir = inputStream.readLine()) != null) {
			
                
                String[] bol = satir.split(" ");
                
                int u = Integer.parseInt(bol[0]);
                int ı = Integer.parseInt(bol[1]);                
                int o = Integer.parseInt(bol[2]);
                
                Point point = new Point(u,ı);
                Circle circle = new Circle(point,o);
                System.out.println("radius="+circle.getRadius()+" Merkez:"+point.toString());
                System.out.printf("alan= %.2f %n",Circle.alanhesapla(circle.getRadius()));
                if (maxalan<Circle.alanhesapla(circle.getRadius())){
                    double b = (double) Circle.alanhesapla(circle.getRadius());
                    maxalan=b;
                    
                       
                }
            
				
            }
        } 
        finally {
            if (inputStream != null) {
                
                inputStream.close();
            }
			
        }
     
    System.out.printf("Max Alan= %.2f %n ",maxalan);
    }
        
        
}        
        
    

   
