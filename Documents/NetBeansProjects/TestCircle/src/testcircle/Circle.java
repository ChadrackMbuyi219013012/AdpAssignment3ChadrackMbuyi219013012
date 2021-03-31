/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcircle;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Circle 
{
    private int radius;
    
    public Circle()
    {
        this.radius = 0;
    }
    public Circle(int radius)
    {
        this.radius = radius;
        
    }
    public int getRadius()
    {
        return radius;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    @Override
    public String toString()
    {
        String str = String.format("Radius: %d",this.radius);
        return str;
    }
    public double area()
    {
        double area = Math.PI * (radius * radius);
        return area;
    }
    public double circumference()
    {
        double circumference = Math.PI * 2 * radius;
        return circumference;
    }
    
    
}
