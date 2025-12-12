package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrungbinhcongTest {
    private Trungbinhcong tbc;
    @BeforeEach
    public void setUp(){
         tbc = new Trungbinhcong();
    }
    @Test
    public void testtrungbinhhople(){
        assertEquals(2,tbc.trungbinh(1,2,3));
    }
    @Test
    public void testtrungbinhtaibienduoi(){
        assertEquals(0,tbc.trungbinh(0,0,0));
    }
    @Test
    public void testtrungbinhtaibientren(){
        assertEquals(10,tbc.trungbinh(10,10,10));
    }
    @Test
    public void testtrungbinhcanbienduoikhonghople(){
        assertThrows(IllegalArgumentException.class,() -> tbc.trungbinh(-1,-1,-1));
    }
    @Test
    public void testtrungbinhcanbientrenkhonghople(){
        assertThrows(IllegalArgumentException.class,() -> tbc.trungbinh(11,11,11));
    }

}