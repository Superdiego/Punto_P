/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoo;

/**
 *
 * @author usuario
 */
public class Punto {
    
    private static int contadorPuntos;
    private double x;
    private double y;
    
            
  
Punto(){ //constructor
        this.x=0;
        this.y=0;
        contadorPuntos++;
    }
  
Punto(double x, double y){ //constructor
        this.x= x;
        this.y= y;
        contadorPuntos++;
    }
Punto (Punto p){//constructor copia
        this.x= p.x;
        this.y=p.y;
        contadorPuntos++;
    }
public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

   
    public static int getContadorPuntos() {
        return contadorPuntos;
    } 
    
    
    
    public static double distancia(Punto punto1, Punto punto2) {
      double distancia=0;
        
      distancia= Math.hypot((punto1.getX()-punto2.getX()),(punto1.getY()-punto2.getY()));
         
      return distancia;
    }
    
    public static double distancia_origen(Punto punto1) {
      double distancia=0;
      
      distancia= Math.hypot((punto1.getX()),(punto1.getY()));
         
      return distancia;

        }
    
    public static double Area(Punto punto1, Punto punto2, Punto punto3) {
      double area=0;
      double distancia1=0;
      double distancia2=0;
      double distancia3=0;
      double p=0;
        
      distancia1= Math.hypot((punto1.getX()-punto2.getX()),(punto1.getY()-punto2.getY()));
      distancia2= Math.hypot((punto2.getX()-punto3.getX()),(punto2.getY()-punto3.getY()));
      distancia3= Math.hypot((punto3.getX()-punto3.getX()),(punto3.getY()-punto1.getY()));
      
      p=(distancia1 + distancia2 + distancia3)/2 ;
      
      area=(p*(p-distancia1)*(p-distancia2)*(p-distancia3));
      
      
      return area;
    }
    
     
     
     public void ImprimePunto(){

       System.out.println("( "  + x + "," + y +")");

      }
     
      public String ImprimePunto2(){
       String impresion;
        impresion= "(" + x + "," + y +")";
        return impresion;
    }
    
 
     public String toString(){
        String impresion;
        impresion= "(" + x + "," + y +")";
        return impresion;
      
    }

    public static String ImprimeArea(Punto punto1, Punto punto2, Punto punto3){
        double area=0;
      double distancia1=0;
      double distancia2=0;
      double distancia3=0;
      double p=0;
       String mensaje; 
       
      distancia1= Math.hypot((punto1.getX()-punto2.getX()),(punto1.getY()-punto2.getY()));
      distancia2= Math.hypot((punto2.getX()-punto3.getX()),(punto2.getY()-punto3.getY()));
      distancia3= Math.hypot((punto3.getX()-punto3.getX()),(punto3.getY()-punto1.getY()));
      
      p=(distancia1 + distancia2 + distancia3)/2 ;
      
      area=Math.sqrt((p*(p-distancia1)*(p-distancia2)*(p-distancia3)));
      mensaje="El Area formada por los punto"+punto1+" , "+punto2+" , "+punto3+"cuyos lados miden "+distancia1+" , "+distancia2+" , "+distancia3+" es "+ area;
      return mensaje;
    
    }
     
    
    
}









