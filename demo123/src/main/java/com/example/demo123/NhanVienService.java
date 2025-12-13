package com.example.demo123;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private List<NhanVien> dsNhanVien = new ArrayList<>();
    public boolean themNhanVien(NhanVien nv){
        if(nv == null){
            throw new IllegalArgumentException("Doi tuong nhan vien khong duoc null");
        }
        if(nv.getTenNV().isEmpty() || nv.getMaNV().isEmpty() || nv.getPhongban().isEmpty()){
            throw new IllegalArgumentException("Cac truong khong duoc de trong");
        }
        if(nv.getLuong() <= 0 || nv.getLuong() > 100000000){
            throw new IllegalArgumentException("Luong phai > 0 va < 100,000,000");
        }
        dsNhanVien.add(nv);
        return true;
    }
    public boolean suaNhanVien(String maNV, NhanVien nvmoi){
        if(maNV.isEmpty()){
            throw new IllegalArgumentException("Khong duoc de trong ma nhan vien");
        }
        if(nvmoi.getTenNV().isEmpty() || nvmoi.getPhongban().isEmpty()){
            throw new IllegalArgumentException("Khong duoc de trong cac truong");
        }
        if(nvmoi.getLuong() <= 0 || nvmoi.getLuong() > 100000000){
            throw new IllegalArgumentException("Luong phai > 0 va < 100,000,000");
        }
        return true;
    }
    public List<NhanVien> getAll(){
        return dsNhanVien;
    }
}
