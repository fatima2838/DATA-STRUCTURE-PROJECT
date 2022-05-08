



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatima
 */

import java.util.Comparator;

public class artistComparator implements Comparator<song> {

   public int compare(song o1, song o2) {
     
        return o1.getArtist().compareTo(o2.getArtist());
        
        
    }
    
}
