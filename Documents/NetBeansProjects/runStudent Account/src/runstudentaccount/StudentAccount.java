/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runstudentaccount;

/**
 *
 * @author WINDOWS 10 PRO
 */
class StudentAccount {
     private String name;
    private String course;
    private double balance;

    public StudentAccount() {
    }

    public StudentAccount(String name, String course, double balance) {
        this.name = name;
        this.course = course;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        String stAct = String.format("Name: %S\nCourse:%S\nBalance:%.2f",this.name,this.course,this.balance);
        return stAct;
      
    }

    public double Pay(double amount) {
        if (balance < 0) {
            balance = balance +(amount) ;

        }
        return balance;
    }

    public double addFees(double amount) {
        balance = balance + amount;
        return balance;
    }

    public void refund() {
        if (balance < 0) {
            System.out.println("The total amount owed to the student is : " + Math.abs(balance));
        }
    }    

    void setName(String chadrack_Mbuyi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
