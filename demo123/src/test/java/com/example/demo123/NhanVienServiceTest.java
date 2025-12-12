package com.example.demo123;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    private NhanVienService service;

    @BeforeEach
    public void SetUp(){
        service = new NhanVienService();
    }
    @Test
    public void TestThemNVHopLe8tr() {
        NhanVien nv = new NhanVien("NV01","Binh",18,8000000,"IT");
        assertTrue(service.themNhanVien(nv));
    }

}