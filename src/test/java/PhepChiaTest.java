import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhepChiaTest {
    private PhepChia div;
    @BeforeEach
    public void Setup(){
        div = new PhepChia();
    }
    //Ap dung ky thuat bien (a chay tu 0 den 100)
    //min = 0 => hop le
    //min + 1 = 1 => hop le
    //min - 1 = -1 => khong hop le
    //max = 100 => hop le
    //max - 1 = 99 => hop le
    //max + 1 = 101 => khong hop le
    //chia cho 0 <=>  b = 0 => khong hop le => ngoai le
    //---------------hop le-----------------------

    @Test
    public void HL_minla0(){
        int thucTe = div.PhepChia(0,1);
        int mongMuon = 0;
        assertEquals(mongMuon,thucTe);
    }

    @Test
    public void HL_mincong1la1(){
        int thucTe = div.PhepChia(1,1);
        int mongMuon = 1;
        assertEquals(mongMuon,thucTe);
    }

    @Test
    public void HL_maxla100(){
        int thucTe = div.PhepChia(100,1);
        int mongMuon = 100;
        assertEquals(mongMuon,thucTe);
    }

    @Test
    public void HL_maxtru1la99(){
        int thucTe = div.PhepChia(99,1);
        int mongMuon = 99;
        assertEquals(mongMuon,thucTe);
    }
    //-----------khong hop le - ngoai le-----------------
    @Test
    public void chiaKHL_bienlaam1(){
        assertThrows(IllegalArgumentException.class,() -> {div.PhepChia(-1,1);});
        }
    @Test
    public void chiaKHL_bienla101(){
        assertThrows(IllegalArgumentException.class,() -> {div.PhepChia(101,1);});
    }
    @Test
    public void KHL_chiacho0(){
        assertThrows(ArithmeticException.class,() -> {div.PhepChia(100,0);});
    }

    @Test
    public void HL_trongphanvungla20(){
        int thucTe = div.PhepChia(20,1);
        int mongMuon = 20;
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void chiaKHL_ngoaiphanvungamhaimuoi(){
        assertThrows(IllegalArgumentException.class,() -> {div.PhepChia(-20,1);});
    }
    @Test
    public void KHL_ngoaiphanvungmottramnammuoi(){
        assertThrows(IllegalArgumentException.class,() -> {div.PhepChia(150,1);});
    }

    }
