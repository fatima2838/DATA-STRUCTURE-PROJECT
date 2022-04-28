
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatima
 */

public class priorityComparator implements Comparator<song> {

    @Override
    public int compare(song o1, song o2) {
          int value =  o2.priority- o1.priority ;
           if (value>0)
            return -1; 
        else if (value<0 )
            return 1 ; 
        else 
            return 0 ; 
        

    }
    // p is the priority value 
}
