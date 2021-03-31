/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runstudent;

/**
 *
 * @author CHADRACK MBUYI
 */
public class PostGraduate extends Student 
{
    private String thesis;
    
    public PostGraduate()
    {
        
    }
    
    public PostGraduate(String nm, long studentNm, double loanAmt, String thsis)
    {
        super(nm, studentNm, loanAmt);
        this.thesis = thsis;
    }
    
    public String getThesis()
    {
        return thesis;
    }
    
    public void thesis(String thesis)
    {
        this.thesis = thesis;
    }
    
    @Override
    public String toString()
    {
        String str = super.toString() + "Thesis: " + this.thesis;
        return str;
    }
    
    public void Show()
    {
        super.Show();
        System.out.println("Thesis: " + getThesis());
    }
    
    public double interest()
    {
        return loanAmount*0.1;
    }
    
    
}
