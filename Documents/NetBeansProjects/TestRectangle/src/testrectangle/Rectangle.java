/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrectangle;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Rectangle 
{
    private int width;
    private int height;
    
     public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Recatangle{" + "height=" + height + ", width=" + width + '}';
    }
    
    public void show() {
        System.out.println("Rectangle details");
        System.out.println("Width = " + width );
        System.out.println("Height = " + height);
    }
    
    public double calculateCircumference() {
        return 2 * (height + width);
    }
    
    public double calculateArea() {
        return height * width;
    }
    
}
