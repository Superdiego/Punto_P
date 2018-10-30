/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class PracticaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String p;
        Punto p1 = new Punto();
        p1.setXY(3,4);
        p1.ImprimePunto();

        Punto p2 = new Punto(7,4); 
        p = p2.ImprimePunto2();
        System.out.println(p);
        
        
        Punto p3 = new Punto (p1);
        p3.setXY(3,7);
        System.out.println(p3.toString());
        
        double dist = Punto.distancia(p1, p2);
        System.out.println("La distancia entre los puntos"+p1+" y "+p2+" es "+ dist);
        
        Scanner sc= new Scanner(System.in);
        
        Punto p4 = new Punto();  
        Punto p5 = new Punto();  
        Punto p6 = new Punto(); 
        double ax,ay,bx,by,cx,cy ;
        System.out.print("Introduce el valor x del primer punto:");
        ax = sc.nextDouble();
        System.out.print("Introduce el valor x del primer punto:");
        ay = sc.nextDouble();
        
        p4.setXY(ax,ay);
        
        System.out.print("Introduce el valor x del segundo punto:");
        bx = sc.nextDouble();
        System.out.print("Introduce el valor x del segundo punto:");
        by = sc.nextDouble();
        
        p5.setXY(bx,by);
        
        System.out.print("Introduce el valor x del tercer punto:");
        cx = sc.nextDouble();
        System.out.print("Introduce el valor x del tercer punto:");
        cy = sc.nextDouble();
        
        p6.setXY(cx,cy);
        
        String area = Punto.ImprimeArea(p4, p5, p6);
        
        System.out.println(area);
        
        System.out.println("el numero de puntos que tenemos es " + Punto.getContadorPuntos());
    }
        

        
      
        
        
        
        
         
        
      
        
        
        
         
       
       

        
        
        // TODO code application logic here
    }
    

