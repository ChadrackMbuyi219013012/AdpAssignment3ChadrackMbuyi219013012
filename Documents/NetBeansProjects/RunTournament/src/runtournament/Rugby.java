/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtournament;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Rugby extends Team
{
    private int tries;
    
    public Rugby()
    {
        
    }
    public Rugby(String nm, int gamesWn, int gamesLt, int gamesTd, int tr)
    {
        super(nm, gamesWn, gamesLt, gamesTd);
        this.tries = tr;
    }
    public int getTries()
    {
        return tries;
    }
    public void setTries (int tries)
    {
        this.tries = tries;
    }

    /**
     *
     * @return
     */
    public String tostring()
    {
        String str = super.toString() + "The Total tries: " + this.tries;
        return str;
    }
    @Override
    public void displayDetail()
    {
        super.displayDetail();
        System.out.println("The total tries: " + getTries());
    }
    
}
