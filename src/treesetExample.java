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
    

     for(song s : list)
        {
           System.out.print(s.getName() ) ; 
            System.out.println();
        }
    
    list.addFirst(new song("first song "));
    list.addLast(new song("last song "));
     
   
     playnextsong(list); 
     
//PRIORITY QUEUE
System.out.println("3- Implementing priority queue");
     PriorityQueue<song> queue = new PriorityQueue<>(new priorityComparator());
     
     
     //filling in the queue while keeping the insertion order 
     for(int i = 0 ; i<list.size(); i++){
     song  currentsong = list.get(i); 
     currentsong.priority= i ; 
     queue.add(currentsong);
    
     }
     
    //queue.poll();//removes the top priority  element zero 
    //song s7 = new song("this is my favourite song ");
    //s7.priority= 0; 
     
    // queue.add(s7);
    System.out.println("this is your queue (before adding new song) :"); 
    
       showqueue(queue);
       
       song newsong = new song("song-added-to-queue");
       newsong.priority = 0 ;
       queue.add(newsong); 
        System.out.println("this is your queue (after adding new song) :"); 
       showqueue(queue);
       
     /*   System.out.println("please add a song "); 
        Scanner q_input = new Scanner(System.in) ; 
        newsong = new song(q_input.nextLine());
        System.out.println("this is your queue (after adding " + q_input + ":"); 
        queue.add(newsong); 
       
*/ 
      playnextsong(queue); 
  }
    
    
    
    
//****methods for inked list ****************************************************************************************************************    
    //adding song to the befinning of linked list
   
   //add song at the end of linked list   

   
   public static void playnextsong(LinkedList<song> list){ 
       int a = 0 ; 
     song playingnow = list.get(a); 
     while(list.get(a) != null){
    System.out.println("Currently playing : "+ playingnow.getName() + " do u want to play the next song ?? 1, 0"); 
    Scanner input = new Scanner(System.in); 
    int in = input.nextInt();
   
    if(in == 1 ){
        a++;
        if (a==(list.size())){
            System.out.println("end of the playlist, it will start over. "); playnextsong(list);  break; 
        } 
        playingnow = list.get(a); 
        
    } 
    else if (in==0){
        break; 
    } } 
     
       
   }
  
   
   
//****methods for priority queue******************************************************************************************************************   
    //this method takes one song form and inserts it into the priority queue so that it plays next 

    
    public static void showqueue(PriorityQueue<song> queue){
        PriorityQueue<song> temp = new  PriorityQueue<song>(new priorityComparator()); 
        temp.addAll(queue); 
      while (!temp.isEmpty()){
           song currentsong = temp.poll(); 
           System.out.println(" "+ currentsong.getName() + currentsong.priority); 
       }
    }
     public static void playnextsong(PriorityQueue<song> queue){ 
         PriorityQueue<song> temp = new  PriorityQueue<song>(new priorityComparator()); 
        temp.addAll(queue);
        int pr = 0 ; 
        while (!temp.isEmpty()){
         System.out.println("you are currently playing: "+ temp.poll().getName() ); 
         System.out.println(" enter 1 to play the next song, 2 to add a song of your choice , or 0 to stop : ");
         
         Scanner input = new Scanner(System.in); 
         int in = input.nextInt(); 
          input.nextLine();
         if (in == 0 ) { 
              break; 
         } 
         
         else if (in ==2 ){
             System.out.println("enter the name : ");
             song newsong = new song(input.nextLine()); 
             newsong.priority= pr; 
             temp.add(newsong); 
         } 
            pr++; 
        } 
         
         
      } 
     
    
    
   
    
}
