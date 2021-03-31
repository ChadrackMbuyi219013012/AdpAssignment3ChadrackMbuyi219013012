/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runmagazine;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Magazine {
    private String name;
    private double price;
    private String editor;
    private String email;
    
    public Magazine(){}
    public Magazine(String name,double price,String editor,String email){
      this.name=name;
      this.price=price;
      this.editor=editor;
      this.email=email;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getEditor() {
        return editor;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
      String str1=String.format("Magazine Name is-----%s\nThe price is-----%.2f\nThe editor's name is-----%s\nThe email address is-----%s\n=================================================",this.name,this.price,this.editor,this.email);
      
      return str1;
    }
    
}
