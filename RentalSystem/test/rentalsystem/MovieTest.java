/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalsystem;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabrielaramos
 */
public class MovieTest {

    Movie toyStory, chickenLittle, reyLeon, cronicasSpiderwick;
    
    @Before
    public void setUp() throws Exception {
        toyStory = new Movie("Toy Story", 2);
        chickenLittle = new Movie("ola pero no ola de mar, ola de saludo", 0);
        reyLeon = new Movie("El Rey León", 2);
        cronicasSpiderwick = new Movie("Las Crónicas de Spiderwick", 0);
    }

    /**
     * Test of getTitle method, of class Movie.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Movie movie = toyStory;
        String expResult = "Toy Story";
        String result = movie.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Movie.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "Chicken Little";
        Movie movie = chickenLittle;
        movie.setTitle(title);
        assertEquals(title, movie.getTitle());
    }

    /**
     * Test of getPriceCode method, of class Movie.
     */
    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        Movie movie = reyLeon;
        int expResult = Movie.CHILDRENS;
        int result = movie.getPriceCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPriceCode method, of class Movie.
     */
    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        int priceCode = Movie.NEW_RELEASE;
        Movie movie = cronicasSpiderwick;
        movie.setPriceCode(priceCode);
        assertEquals(priceCode, movie.getPriceCode());
    }
    
}
