/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabrielaramos
 */
public class MovieRentalTest {
    
    Movie theManWhoKnewTooMuch, mulan, slumdogMillionaire;
    @Before
    public void setUp() {
        theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        slumdogMillionaire = new Movie("Slumdog Millionaire", Movie.NEW_RELEASE);
    }
    @Test
    public void testGetPriceCode() {
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
    }
    
    
    @Test
    public void testGetMovie(){
        MovieRental movie = new MovieRental(mulan,3);                
        assertEquals(mulan, movie.getMovie());
    }
    
    @Test
    public void testGetDaysR(){
        MovieRental movie = new MovieRental(mulan,3);           
        assertEquals(3,movie.getDaysRented());
    }
    
    @Test
    public void testSetPrice(){
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        mulan.setPriceCode(Movie.REGULAR);
        assertEquals(Movie.REGULAR,mulan.getPriceCode());
        
    }
    
    @Test
    public void testGetPrice(){
        MovieRental movie = new MovieRental(theManWhoKnewTooMuch,3);           
        System.out.println("Get Price");
        int expResult = (int) 3;
        int result = (int) ((movie.getDaysRented() - 2) *3) ;
        assertEquals(expResult,result);
    
    
    }
 
    

}
