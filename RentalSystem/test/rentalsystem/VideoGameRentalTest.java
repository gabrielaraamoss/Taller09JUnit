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
 * @author Juan Xavier Pita
 */
public class VideoGameRentalTest {
    
    Ps3Game ruinedKing;
    WiiGame marioKart;
    Xbox360Game minecraft;
    Object godOfWar;
    
    @Before
    public void setUp() {
        ruinedKing = new Ps3Game("Ruined King");
        godOfWar = new Ps3Game("God of War II");
        marioKart = new WiiGame("Mario Kart Wii");
        minecraft = new Xbox360Game("Minecraft");
    }
    
    /**
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        VideoGameRental videoGameRental = new VideoGameRental(ruinedKing, 14, false);
        int expResult = 14;
        int result = videoGameRental.getDaysRented();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        VideoGameRental videoGameRental = new VideoGameRental(godOfWar, 5, true);
        Object expResult = godOfWar;
        Object result = videoGameRental.getVideoGame();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        VideoGameRental videoGameRental = new VideoGameRental(marioKart, 10, false);
        double expResult = 12.0;
        double result = videoGameRental.getCharge();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        VideoGameRental videoGameRental = new VideoGameRental(minecraft, 25, true);
        int expResult = 24;
        int result = videoGameRental.getFrequentRenterPoints();
        assertEquals(expResult, result);
    }
    
}
