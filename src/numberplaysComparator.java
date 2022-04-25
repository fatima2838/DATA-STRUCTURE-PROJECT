/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Comparator;

/**
 *
 * @author Fatima
 */
public class numberplaysComparator implements Comparator<song>{

    public int compare(song o1, song o2)
    {
    int value = o1.getNumberplays()- o2.getNumberplays(); 
        
        if (value>0)
            return -1; 
        else if (value<0 )
            return 1 ; 
        else 
            return 0 ; 
        



    } }
