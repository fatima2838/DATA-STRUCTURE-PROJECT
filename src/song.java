/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Fatima
 */
import java.io.*;
import java.util.*;

public class song extends node{
   private String artist; 
    private String name; 
    private int numberplays; 
    private int duration ; 
    
    
    song(){ 
       this.name = name ; 
       this.artist = artist; 
      this.duration = duration ; 
       this.numberplays = numberplays; 
       
              
        
    } 
    
    song(String name, String artist, int duration , int numberplays){ 
        this.name = name ; 
       this.artist = artist; 
       this.duration = duration ; 
       this.numberplays = numberplays; 
 } 
    public void showSong(){
        System.out.println(this.getName()+"----->"+this.getArtist()+"----->"+this.getDuration());
    }

    
    
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberplays() {
        return numberplays;
    }

    public void setNumberplays(int numberplays) {
        this.numberplays = numberplays;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
    
    
    
    
    
}
