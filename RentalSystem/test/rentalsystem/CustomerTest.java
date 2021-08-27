/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalsystem;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author milvflor
 */
public class CustomerTest {
    static Customer instance, instance2;
    static MovieRental arg, arg2; 
    static VideoGameRental arg3, arg4;
    
    @Before
    public void setUp() {
        instance = new Customer("Castiel");
        arg = new MovieRental(new Movie("El Rey Harry", 1), 5);
        arg2 = new MovieRental(new Movie("B", 0), 4);
        arg3 = new VideoGameRental(new Xbox360Game("FinalFantasy"), 3, true);
        arg4 = new VideoGameRental(new Xbox360Game("FinalFantasyIV"), 5, true);
    }
    
    public CustomerTest() {
        String expected = "Dean";
        instance2 = new Customer(expected);
        assertEquals(expected, instance2._name);
    }
    
    /**
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        
        ArrayList<MovieRental> expected_ = new ArrayList<>();
        expected_.add(arg);
        expected_.add(arg2);
        
        instance.addMovieRental(arg);
        instance.addMovieRental(arg2);

        assertEquals(expected_, instance.get_movieRental());
        
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        ArrayList<VideoGameRental> expected_ = new ArrayList<>();
        
        expected_.add(arg3);
        expected_.add(arg4);

        instance.addVideoGameRental(arg3);
        instance.addVideoGameRental(arg4);

        assertEquals(expected_, instance.get_VideoGameRental());
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        System.out.println("statement");
       
        instance.addMovieRental(arg);
        instance2.addVideoGameRental(arg3);
        
        String expResult = instance2.statement();
        String result = instance.statement();
        assertNotNull(expResult, result);       
    }
}
