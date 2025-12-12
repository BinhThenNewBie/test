package com.example.i1thang12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    private NhanVienService service;
    @BeforeEach
    public void SetUp(){
        service = new NhanVienService();
    }
    //test themnv
    @Test
    public void testthemnhanvienluongtrongphanvunghople(){
        NhanVien nv = new NhanVien("maNV01","Binh",18,8000000,"IT");
        assertTrue(service.themNV(nv));
    }
    @Test
    public void testthemnhanvienluongngoaiphanvunghopleluongam(){
        NhanVien nv = new NhanVien("maNV03","Binh",18,-5000,"IT");
        assertThrows(IllegalArgumentException.class,() ->service.themNV(nv));
    }
    @Test
    public void testthemnhanvienluongqualon(){
        NhanVien nv = new NhanVien("maNV04","Binh",18,150000000,"IT");
        assertThrows(IllegalArgumentException.class,() ->service.themNV(nv));
    }
    @Test
    public void testthemnhanvienkhitenbotrong(){
        NhanVien nv = new NhanVien("maNV05","",18,8000000,"IT");
        assertThrows(IllegalArgumentException.class,() ->service.themNV(nv));
    }
    @Test
    public void testthemnhanvienkhimaNVtrong(){
        NhanVien nv = new NhanVien("","Binh",18,8000000,"IT");
        assertThrows(IllegalArgumentException.class,() ->service.themNV(nv));
    }
    @Test
    public void testthemnhanvienkhiphongbantrong(){
        NhanVien nv = new NhanVien("maNV06","Binh",18,8000000,"");
        assertThrows(IllegalArgumentException.class,() ->service.themNV(nv));
    }

    //test suanv
    @Test
    public void testsuanhanvienhople(){
        NhanVien nv = new NhanVien("maNV07","Binh",18,8000000,"IT");
        assertTrue(service.suaNV("maNV07",nv));
    }
    @Test
    public void testsuanhanvienkhidetrongmaNVUp(){
        NhanVien nv = new NhanVien("maNV01","Binh",18,8000000,"IT");
        assertThrows(IllegalArgumentException.class,() ->service.suaNV("",nv));
    }
    @Test
    public void testsuanhanvienkhidetrongdoituongnvMoi(){
        NhanVien nv = new NhanVien("maNV01","Binh",18,8000000,"IT");
        assertThrows(IllegalArgumentException.class,() ->service.suaNV("maNV01",null));
    }
    @Test
    public void testsuanhanvienkhidetrongphongban(){
        NhanVien nv = new NhanVien("maNV01","Binh",18,8000000,"");
        assertThrows(IllegalArgumentException.class,() ->service.suaNV("maNV01",nv));
    }
    @Test
    public void testsuanhanvienkhidetrongtenNV(){
        NhanVien nv = new NhanVien("maNV01","",18,8000000,"IT");
        assertThrows(IllegalArgumentException.class,() ->service.suaNV("maNV01",nv));
    }
    @Test
    public void testsuanhanvienkhiluongam(){
        NhanVien nv = new NhanVien("maNV01","Binh",18,-5000,"IT");
        assertThrows(IllegalArgumentException.class,() ->service.suaNV("maNV01",nv));
    }
    @Test
    public void testsuanhanvienkhiluongquacao(){
        NhanVien nv = new NhanVien("maNV01","Binh",18,150000000,"IT");
        assertThrows(IllegalArgumentException.class,() ->service.suaNV("maNV01",nv));
    }
    @Test
    public void testsuanhanvienkhidetrongmaNV(){
        NhanVien nv = new NhanVien("","Binh",18,8000000,"IT");

    }
}