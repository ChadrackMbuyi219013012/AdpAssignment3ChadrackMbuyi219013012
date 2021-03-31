/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runrectangle;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Rectangle 
{
    private int length;
    private int width;
    int area=0;

    public Rectangle(int length,int width)
    {
        this.length = length;
        this.width = width;
    }
    public int getLength()
    {
        return length;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public int getWidth()
    {
        return width;
    }
    public void setWidth(int width)
    {
        this.width = width;
    }
    @Override
    public String toString()
    {
        String str = "Length : " +this.length+"||"+ "Width : " + this.width;
        return str;
    }
   
    public void displayDetails()
    {
        System.out.println("Square measures");
        System.out.println("===============");
        System.out.println("The length = " + this.length);
        System.out.println("The width = " + this.width);
        System.out.println("The area = " + this.area);
    }
    public int area()
    {
        area = (this.length * this.width);
        return area;
    }
}
