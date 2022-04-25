/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Fatima
 */

import java.util.TreeSet;
import java.io.*;
import java.util.*;

public class treesetExample {

    public static void main(String[] args){
        // playlist1 willl be sorted by song name 
        
    TreeSet<song> playlist1 = new TreeSet<song>(new nameComparator());
    
    
    song s2 = new song("b name", "b artist", 5 , 5000); 
    song s1 = new song("a name", "a artist", 5 , 5000); 
    song s3 = new song("c name", "c artist", 5 , 5000); 
    
    
   playlist1.add(s1); // the elements are added a, b , c * but when printed they will be added  
   playlist1.add(s3); 
   playlist1.add(s2); 
    
    
    
   //traversing though the treeSet 
  //object type  o  : list 
   for(song s : playlist1)
        {
            System.out.print(s.getName() ) ; 
            System.out.println();
        } 
   
   
   //playlist 2 will be sorted by number of plays 
    TreeSet<song> playlist2 = new TreeSet<song>(new numberplaysComparator());
    
  
    song s4 = new song("a name", "a artist", 5 , 2);
      song s5 = new song("b name", "b artist", 5 , 1); 
    song s6 = new song("c name", "c artist", 5 , 5000); // c a b 
    
    
    playlist2.add(s6); 
    playlist2.add(s5); 
    playlist2.add(s4); 
    
   //traversing though the treeSet 
  //object type  o  : list 
   for(song s : playlist2)
        {
            s.showSong();
           // System.out.print(s.getName() ) ; 
            System.out.println();
        } 
   
   // linked list : 
   // go through the tree set and add all the elemnts to the linked list 
   LinkedList list = new LinkedList<>(); 
   
    for(song s : playlist2)
        {
           list.add(s);
            System.out.println();
        } 
    // make a function that plays the next song 
    song   currentsong = new song(); 
   currentsong.getNext();//use this 
    
    
  } 
}
