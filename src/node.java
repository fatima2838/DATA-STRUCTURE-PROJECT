/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatima
 */
public class node {
  
    private node next; 
    private node previous; 

    
    node(){ 
    } 
    
  
    

   

    //.............................................................................
    //setters and getters
 
    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public node getPrevious() {
        return previous;
    }

    public void setPrevious(node prevoius) {
        this.previous = prevoius;
    }
    
    
    


    
}
