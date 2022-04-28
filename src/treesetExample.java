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
//TREE-SET 
    // playlist1 will be sorted by song name 
        System.out.println("1-implementing treeset");
    TreeSet<song> playlist1 = new TreeSet<song>(new nameComparator());
    
    song s1 = new song("a name", "a artist", 5 , 5000); 
    song s2 = new song("b name", "b artist", 5 , 5000); 
    song s3 = new song("c name", "c artist", 5 , 5000); 
    
    
   playlist1.add(s1); // the elements are added a, c , b * but when printed they will be abc in alphabetical order 
   playlist1.add(s3); 
   playlist1.add(s2); 
    
    
    
    //traversing though the treeSet 
    //object type  o  : list 
    System.out.println("welcome to your music player! ,the following playlist is sorted alphabetical order :  ");
    
    for(song s : playlist1)
        {
            System.out.print(s.getName() + " ") ; 
        } 
         System.out.println();

   
   //playlist 2 will be sorted by number of plays
    System.out.println("This is the same playlist sorted by number of plays");
    
    TreeSet<song> playlist2 = new TreeSet<song>(new numberplaysComparator());

    song s4 = new song("a name", "a artist", 5 , 2);
    song s5 = new song("b name", "b artist", 5 , 1); 
    song s6 = new song("c name", "c artist", 5 , 5000);
    
    
    playlist2.add(s6); // order added : c b a, oreder printed c a b 
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
   
  
   
//LINKED LIST 
   // go through the tree set and add all the elemnts to the linked list 
   System.out.println("2- Implementing linked list ");
   LinkedList<song> list = new LinkedList<song>(); 
   
   /* for(song s : playlist2)// filing linked list using for loop 
        {
           list.add(s);
           
        } */ 
   
    list.addAll(playlist2);
    
   // addFirstSong(list, new song("the first song"));
   // addLastSong(list, new song("the last song")); 
     for(song s : list)
        {
           System.out.print(s.getName() ) ; 
            System.out.println();
        }
     
     
     int a = 0 ; 
     song playingnow = list.get(a); 
     while(list.get(a) != null){
    System.out.print("Currently playing : "+ playingnow.getName() + " do u want to play the next song ?? 1, 0"); 
    Scanner input = new Scanner(System.in); 
    int in = input.nextInt();
    if(in == 1 ){
        a++;
        if (a==(list.size())){
            break; 
        } 
        playingnow = list.get(a); 
        
    } 
    if (in==0){
        break; 
    } } 
     
//PRIORITY QUEUE

     PriorityQueue<song> queue = new PriorityQueue<>(new priorityComparator());
     
     
     //filling in the queue while keeping the insertion order 
     for(int i = 0 ; i<list.size(); i++){
     song  currentsong = list.get(i); 
     currentsong.priority= i ; // this gives space to fill in the 
     queue.add(currentsong);
    
     }
     
     //queue.poll();//removes the top priority  element zero 
     //song s7 = new song("this is my favourite song ");
     //s7.priority= 0; 
     
  // queue.add(s7);
       showqueue(queue);
       song thenewsong = new song("this is the new added song ");
       thenewsong.priority = 0 ;
       queue.add(thenewsong); 
       showqueue(queue);

  }
    
    
    
    
//****methods for inked list ****************************************************************************************************************    
    //adding song to the befinning of linked list
      public static void addFirstSong(LinkedList<song> list, song randomsong)
   {
      song newSong = new song();     // make a new NODE
        song start = null;
      newSong.setNext(start);          // new NODE points to previous start
      newSong = randomsong;
      start = newSong;               // start now points to new NODE
   }
      
   //add song at the end of linked list   
   public static void addLastSong(LinkedList<song> list, song randomsong)
   {
        song start = null;
      song temp = list.getFirst();            // temp points at first node
      while (temp.getNext()!= null)     // find last node
      {
         temp = (song) temp.getNext();          // move to next node
      }
      
      song newSong = new song();    // make a new NODE
      newSong = randomsong; 
      temp.setNext(newSong);          // attach new NODE at end of list
   }
   
   
   public void playnextsong(LinkedList<song> list, song currentsong){ 
       int i = 	list.indexOf(currentsong);
    for( song s : list){// filing linked list using for loop 
       
           if (list.indexOf(s) ==(i+1))
            System.out.println("currently playing" + s.getName());
        } 
       
   }
   
//****methods for priority queue******************************************************************************************************************   
    //this method takes one song form and inserts it into the priority queue so that it plays next 
  /* public static void showqueue(PriorityQueue<song> queue){
       PriorityQueue<song> newqueue = new PriorityQueue<song>(new priorityComparator());
       newqueue.addAll(queue);
       
       newqueue.forEach((var s) -> {                      //this syntax was recommended by netbeans 
           
           System.out.println(s.getName() + s.priority);       
        }); 
   } */ 
    
    public static void showqueue(PriorityQueue<song> queue){
        PriorityQueue<song> temp = new  PriorityQueue<song>(new priorityComparator()); 
        temp.addAll(queue); 
      while (!temp.isEmpty()){
           song currentsong = temp.poll(); 
           System.out.println(" "+ currentsong.getName() + currentsong.priority); 
       }
    }
    
    
    
   
    
}
