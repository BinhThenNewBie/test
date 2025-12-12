import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachServiceTest {
    private SachService service;
    @BeforeEach
    public void SetUp(){
        service = new SachService();
    }
    //test them
    @Test
    public void testthemhople(){
        Sach s = new Sach("sach01","java",30,"Do An Binh",20);
        assertTrue(service.them(s));
    }
    @Test
    public void testthemsotrangtaibienduoi(){
        Sach s = new Sach("sach01","java",1,"Do An Binh",20);
        assertTrue(service.them(s));
    }
    @Test
    public void testthemsotrangtaibientren(){
        Sach s = new Sach("sach01","java",50,"Do An Binh",20);
        assertTrue(service.them(s));
    }
    @Test
    public void testthemsotrangcanbienduoikhonghople(){
        Sach s = new Sach("sach01","java",-1,"Do An Binh",20);
        assertThrows(IllegalArgumentException.class,() -> service.them(s));
    }
    @Test
    public void testthemsotrangcanbientrenkhonghople(){
        Sach s = new Sach("sach01","java",51,"Do An Binh",20);
        assertThrows(IllegalArgumentException.class,() -> service.them(s));
    }


    //test sua
    @Test
    public void testsuahople(){
        Sach s = new Sach("sach01","java",30,"Do An Binh",20);
        assertTrue(service.sua("sach01",s));
    }
    @Test
    public void testsuasotrangtaibienduoi(){
        Sach s = new Sach("sach01","java",1,"Do An Binh",20);
        assertTrue(service.sua("sach01",s));
    }
    @Test
    public void testsuasotrangcanbienduoihople(){
        Sach s = new Sach("sach01","java",2,"Do An Binh",20);
        assertTrue(service.sua("sach01",s));
    }
    @Test
    public void testsuasotrangcanbienduoikhonghople(){
        Sach s = new Sach("sach01","java",0,"Do An Binh",20);
        assertThrows(IllegalArgumentException.class,() -> service.sua("sach01",s));
    }
    @Test
    public void testsuasotrangcanbientrenkhonghople(){
        Sach s = new Sach("sach01","java",51,"Do An Binh",20);
        assertThrows(IllegalArgumentException.class,() -> service.sua("sach01",s));
    }



}