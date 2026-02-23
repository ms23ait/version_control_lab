/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

/**
 *
 * @author ms23ait
 */
public class Complex {
    private double real;
    private double imaginary;
    
    public double getRealPart(){
        return real;}
    
    public double getImaginaryPart(){
        return imaginary;
    }
   
    public Complex add(Complex other){
    double r = this.real + other.real;
    double i = this.imaginary + other.imaginary;
    return Complex;
    }
    
    public Complex subtract(Complex other){
    double r = this.real - other.real;
    double i = this.imaginary - other.imaginary;
    }
}
