package com.mycompany.conversortemperatura;
import java.util.*;

public class Calculos{
    private double f;
    private double c;
    private Scanner scanner;

    public Calculos(double f ,double c ){
        this.f = f;
        this.c = c;

    }

    public double getFahrenheit(double f){
        return f;

    }
    public double getCelsius(double c){
        return c;

    }


    public void celsiusPFahrenheit(){
        System.out.println("Insira um valor em graus celsius: ");
        c = scanner.nextDouble();
        f = c * 1.8 + 32;
        System.out.printf(" o valor em graus celsius inserido foi: %f que em fahrenheit e igual a %f " , c,f);
        
    }
    public void fahrenheitPCelsius(){
        System.out.println("Insira um valor em graus fahrenheit: ");
        f= scanner.nextDouble();
        c = (5/9) * (f-32);
        System.out.printf(" o valor em graus fahrenheit inserido foi: %f que em celsius e igual a %f " ,f,c);
        
    }


}