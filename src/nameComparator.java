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
public class nameComparator implements Comparator<song> {

    @Override
    public int compare(song o1, song o2) {
     
        return o1.getName().compareTo(o2.getName());
        
        
    }
    
}
