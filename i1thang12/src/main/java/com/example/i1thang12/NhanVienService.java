package com.example.i1thang12;

import java.util.ArrayList;

public class NhanVienService {
    ArrayList<NhanVien> arr = new ArrayList<>();
    public boolean themNV(NhanVien nv){
        if(nv == null){
            throw new IllegalArgumentException("Doi tuong nhan vien khong duoc null");
        }
        if(nv.getMaNV().isEmpty() || nv.getPhongban().isEmpty() || nv.getTenNV().isEmpty()){
            throw new IllegalArgumentException("Cac truong khong duoc de trong");
        }
        if(nv.getLuong() < 0 || nv.getLuong() >= 100000000){
            throw new IllegalArgumentException("Luong phai nam trong khoang tu 1 - 100000000");
        }
        arr.add(nv);
        return true;
    }
    public boolean suaNV(String maNVUp, NhanVien nvMoi){
        if(maNVUp == null || maNVUp.isEmpty()){
            throw new IllegalArgumentException("Khong duoc de trong maNV");
        }
        if(nvMoi == null){
            throw new IllegalArgumentException("Khong duoc de trong doi tuong nvMoi");
        }
        if(nvMoi.getMaNV().isEmpty() || nvMoi.getPhongban().isEmpty() || nvMoi.getTenNV().isEmpty()){
            throw new IllegalArgumentException("Cac truong khong duoc de trong");
        }
        if(nvMoi.getLuong() < 0 || nvMoi.getLuong() >= 100000000){
            throw new IllegalArgumentException("Luong phai nam trong khoang tu 1 - 100000000");
        }
        arr.add(nvMoi);
        return true;
    }
}
