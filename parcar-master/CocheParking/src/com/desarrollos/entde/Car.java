package com.desarrollos.entde;

import java.util.Arrays;
import java.awt.Color;
//JEJEJEJEJEJE
public class Car
{
    
    static int numberWheels = 4;                                       
    
    String theGarage=null;   //Tipo de valores que van a tomar las variables=String

    
    
    public Car (Garage g){
    	theGarage = g;
    }
    
    public STATIC void main(String[] args) throws InterruptedException{
    	Garage g = new Garage();
    	Car car = new Car(g);
        car.accelerate();
        car.slowDown();             //He añadido "car."ya que todos excepto el ultimo son propiedades de car
        car.moveDown();
        car.accelerate();
        g.printGarage();   //sustituido "car." por "g." ya que es una accion del objeto garage

    }    

   
    public void accelerate() throws InterruptedException{
        String c = new String("*");
        String space = new String(" ");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        }
                Thread.sleep(1000);   //Tambien lo he sacado fuera del bucle
        
    }
    
   
    public void slowDown() throws InterruptedException{
    	String c = new String("     *");        //Mayúsculas en (S)tring
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        }
                Thread.sleep(1000); //Lo he sacado fuera del bucle for ya que me daba un aviso
        
    	System.out.println();
    }    
    
    
    public void moveDown() throws InterruptedException{
    	String c = new String("\t\t\t\t  *");    //La primera mayuscula en String y sobraba un paréntesis al final
    	for(int i=0;i<5;i++)          //a la hora de definir el comportamiento del bucle for,se separa con puntos y comas y no por comas
        {
    		if(i!=4)
    			System.out.println(c);
    		else 
    			System.out.print(c);
        }
                Thread.sleep(1000); //Lo he sacado fuera del bucle ya que me daba un warning
        
    }
    
}
