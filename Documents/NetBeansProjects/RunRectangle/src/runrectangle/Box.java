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
public class Box extends Rectangle 
{
    private int height;
    int volume;

    public Box(int length,int width,int height)
    {
        this.height = height;
        
    }
    public int volume() 
    {
        return volume;
    }
    
}
