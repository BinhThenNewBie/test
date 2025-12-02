import com.example.test.SinhVien;
import com.example.test.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    private SinhVienService service;
    @BeforeEach
    public void setUP(){
        service = new SinhVienService();
    }
    @Test
    public void HL_themSV(){
        SinhVien sv = new SinhVien("SV01","toi ten la binh",3,"SD1093",20);
        assertTrue(service.themSV(sv));
    }
    @Test
    public void KHL_themSV_diemAm(){
        SinhVien sv = new SinhVien("SV02","toi ten la Binh",-10,"SD1904",20);
        assertThrows(IllegalArgumentException.class, ()-> service.themSV(sv));
    }
    @Test
    public void KHL_themSV_trongTen(){
        SinhVien sv = new SinhVien("SV03","",5,"SD1043",20);
        assertThrows(IllegalArgumentException.class, ()-> service.themSV(sv));
    }
    @Test
    public void KHL_themSV_tuoiAm(){
        SinhVien sv = new SinhVien("SV04","Toi ten la Binh",5,"SD1094",-10);
        assertThrows(IllegalArgumentException.class, ()-> service.themSV(sv));
    }
    @Test
    public void KHL_themSV_trungId(){
        SinhVien sv1 = new SinhVien("SV05","toi ten la d",7,"SD1904",20);
        SinhVien sv2 = new SinhVien("SV05","toi ten la gi dfo",7,"SD1904",20);
        service.themSV(sv1);
        assertThrows(IllegalArgumentException.class, ()-> service.themSV(sv2));
    }
    @Test
    public void HL_suaSV(){
        SinhVien sv = new SinhVien("SV06","Binh",9,"SD1904",20);
        service.themSV(sv);
        assertTrue(service.suaSV("SV06","Long Ma Bac Giang",9));
    }
    @Test// sua truc tiep voi du lieu co san
    public void KHL_suaSV_ten(){
        assertThrows(IllegalArgumentException.class, ()-> service.suaSV("SV04","Toi ten la Nguoi",9));
    }
    @Test
    public void KHL_suaSV_idKhongTonTai(){
        assertThrows(IllegalArgumentException.class, ()->service.suaSV("SV10","Toi ten la nguoi",10));
    }
    @Test
    public void KHL_suaSV_ten1(){
        assertThrows(IllegalArgumentException.class, ()->service.suaSV("SV04","",10));
    }
    @Test
    public void KHL_suaSV_ten2(){
        assertThrows(IllegalArgumentException.class, ()->service.suaSV("SV04","toi ten la người",10));
    }
    @Test
    public void KHL_suaSV_diemAm(){
        assertThrows(IllegalArgumentException.class, ()->service.suaSV("SV04","toi ten la nguoi",-1));
    }

}