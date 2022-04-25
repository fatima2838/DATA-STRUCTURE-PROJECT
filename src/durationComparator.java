
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
public class durationComparator implements Comparator<song>{

    @Override
   
        public int compare(song s1, song s2)
    {
        return s1.getDuration()-s2.getDuration();
    }
    
    
}
