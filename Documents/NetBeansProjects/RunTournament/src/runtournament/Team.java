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
public class Team 
{
    private String name;
    private int gamesWon;
    private int gamesLost;
    private int gamesTied;
    
    public Team()
    {
        
        
    }
    public Team(String nm, int gamesWn, int gamesLt, int gamesTd)
    {
        this.name = nm;
        this.gamesWon = gamesWn;
        this.gamesLost = gamesLt;
        this.gamesTied = gamesTd;
    }
    public String getName()
    {
        return name;
    }
    public int getGamesWon()
    {
        return gamesWon;
    }
    public int getGamesLost()
    {
        return gamesLost;
    }
    public int getGamesTied()
    {
        return gamesTied;
    }
    public void setName (String name)
    {
        this.name = name;
    }
    public void setGamesWon (int gamesWon)
    {
        this.gamesWon = gamesWon;
    }
    public void setGamesLost()
    {
        this.gamesLost = gamesLost;
    }
    public void setGamesTied()
    {
        this.gamesTied = gamesTied;
    }
    @Override
    public String toString()
    {
        String str = "Name:"+" "+this.name+"|| "+"The games won:"+" "+ this.gamesWon+"|| "+"The games lost:"+" " + this.gamesLost+"||"+"The games tied:"+" "+ this.gamesTied;
        return str;
    }
    public void displayDetail()
    {
        System.out.println("Team Details");
        System.out.println("---------------");
        System.out.println("Name: " + getName());
        System.out.println("The games won: " + getGamesWon());
        System.out.println("The games lost: " + getGamesLost());
        System.out.println("The games tied: " + getGamesTied());
    }

  
    
}
