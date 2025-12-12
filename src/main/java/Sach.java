public class Sach {
    private String id;
    private String ten;
    private int sotrang;
    private String tentacgia;
    private int lantaiban;

    public Sach() {
    }

    public Sach(String id, String ten, int sotrang, String tentacgia, int lantaiban) {
        this.id = id;
        this.ten = ten;
        this.sotrang = sotrang;
        this.tentacgia = tentacgia;
        this.lantaiban = lantaiban;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public int getLantaiban() {
        return lantaiban;
    }

    public void setLantaiban(int lantaiban) {
        this.lantaiban = lantaiban;
    }
}
