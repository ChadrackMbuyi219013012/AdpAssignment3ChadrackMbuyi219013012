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
public class Netball extends Team 
{
    private int goalsFor;
    private int goalsAgainst;
    
    public Netball()
    {
        
    }
    public Netball(String nm, int gamesWn, int gamesLt, int gamesTd, int glsFor, int glsAgnt)
    {
        super(nm,gamesWn, gamesLt, gamesTd);
        this.goalsFor = glsFor;
        this.goalsAgainst = glsAgnt;
    }
    public int getGoalsFor()
    {
        return goalsFor;
    }
    public int getGoalsAgainst()
    {
        return goalsAgainst;
    }
    public void setGoalsFor(int goalsFor)
    {
        this.goalsFor = goalsFor;
    }
    public void setGoalsAgainst(int goalsAgainst)
    {
        this.goalsAgainst = goalsAgainst;
    }
    public String toString()
    {
        String str = super.toString() + "The GF (GoalsFor): " + this.goalsFor + "The GA (GoalsAgainst): " + this.goalsAgainst;
        return str;
    }
    @Override
    public void displayDetail()
    {
        super.displayDetail();
        System.out.println("The GF (GoalsFor): " + getGoalsFor());
        System.out.println("The GA (GoalsAgainst): " + getGoalsAgainst());
    }
    
}
