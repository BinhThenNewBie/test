package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> dsSinhVien = new ArrayList<>();

    //chuc nang them
    public boolean themSV(SinhVien sv){
        if(sv.getTuoi() < 10 || sv.getTuoi() > 30){
            throw new IllegalArgumentException("Tuoi phai trong khoang tu 10 den 30");
        }if(sv.getTen() == null || sv.getTen().trim().isEmpty()){
            throw new IllegalArgumentException("Khong duoc de trong ten");
        }if(sv.getDiem() < 0 || sv.getDiem() > 10){
            throw new IllegalArgumentException("Diem phai nam trong khoang tu 0 den 10");
        }for(SinhVien existing : dsSinhVien){
            if(existing.getId().equals(sv.getId())){
                throw new IllegalArgumentException("Id da ton tai" + sv.getId());
            }
        }
        dsSinhVien.add(sv);
        return true;
    }
    public boolean suaSV(String id, String tenMoi, double diemMoi){
        for(SinhVien sv : dsSinhVien){
            if(sv.getId().equals(id)){
                if(diemMoi < 0 || diemMoi > 10){
                    throw new IllegalArgumentException("Diem nam trong khoang tu 0 den 10");
                }if(tenMoi == null || tenMoi.trim().isEmpty()){
                    throw new IllegalArgumentException("Ten khong duoc de trong");
                }if(!tenMoi.matches("^[a-zA-Z\\s]+$")){
                    throw new IllegalArgumentException("Ten khong duoc chua cac ky tu dac biet va khoang trang");
                }
                sv.setTen(tenMoi);
                sv.setDiem(diemMoi);
                return true;
            }

        }
        throw new IllegalArgumentException("Khong tim thay sinh vien voi id:" + id);
    }
}
