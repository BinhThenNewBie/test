import java.util.ArrayList;

public class SachService {
    public boolean them(Sach sach){
        ArrayList<Sach> arr = new ArrayList<>();
        if(sach == null){
            throw new IllegalArgumentException("doi tuong sach khong duoc null");
        }
        if(sach.getId().isEmpty() || sach.getTen().isEmpty()|| sach.getTentacgia().isEmpty()){
            throw new IllegalArgumentException("Khong duoc de trong cac truong");
        }
        if(sach.getSotrang() < 1 || sach.getSotrang() > 50){
            throw new IllegalArgumentException("So trang phai nam trong khoang tu 1 den 50 trang");
        }
        arr.add(sach);
        return true;
    }
    public boolean sua(String id, Sach sachmoi){
        if(id == null || id.isEmpty()){
            throw new IllegalArgumentException("id khong duoc de trong");
        }
        if(sachmoi == null){
            throw new IllegalArgumentException("Doi tuong sach moi khong duoc de trong");
        }
        if(sachmoi.getSotrang() < 1 || sachmoi.getSotrang() > 50){
            throw new IllegalArgumentException("So trang phai nam trong khoang tu 1 den 50 trang");
        }
        if(sachmoi.getId().isEmpty() || sachmoi.getTen().isEmpty()|| sachmoi.getTentacgia().isEmpty()){
            throw new IllegalArgumentException("Khong duoc de trong cac truong");
        }
        return true;
    }
}
