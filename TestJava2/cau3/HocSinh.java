package TestJava2.cau3;

public class HocSinh {
    private  String hoten;
    private  String giotinh;
    private  int tuoi;
    private  float diemtoan;
    private  float diemvatli;
    private  float diemhoahoc;

    public HocSinh(String hoten, String giotinh, int tuoi, float diemtoan, float diemvatli, float diemhoahoc) {
        this.hoten = hoten;
        this.giotinh = giotinh;
        this.tuoi = tuoi;
        this.diemtoan = diemtoan;
        this.diemvatli = diemvatli;
        this.diemhoahoc = diemhoahoc;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGiotinh() {
        return giotinh;
    }

    public void setGiotinh(String giotinh) {
        this.giotinh = giotinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(float diemtoan) {
        this.diemtoan = diemtoan;
    }

    public float getDiemvatli() {
        return diemvatli;
    }

    public void setDiemvatli(float diemvatli) {
        this.diemvatli = diemvatli;
    }

    public float getDiemhoahoc() {
        return diemhoahoc;
    }

    public void setDiemhoahoc(float diemhoahoc) {
        this.diemhoahoc = diemhoahoc;
    }

    public float setGPA(){
        return (diemhoahoc+diemtoan+diemvatli)/3;
    }

    public String displayInfor() {
        return "HocSinh{" +
                "hoten='" + hoten + '\'' +
                ", giotinh='" + giotinh + '\'' +
                ", tuoi=" + tuoi +
                ", diemtoan=" + diemtoan +
                ", diemvatli=" + diemvatli +
                ", diemhoahoc=" + diemhoahoc +
                '}';
    }


}
