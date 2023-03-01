package Exam.ex2;

public abstract class NhanVien {
    private String manhanvien;
    private String hoten;
    private String namsinh;
    private String diachi;
    public NhanVien(){
    }

    public NhanVien(String manhanvien, String hoten, String namsinh, String diachi) {
        this.manhanvien = manhanvien;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.diachi = diachi;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "manhanvien='" + manhanvien + '\'' +
                ", hoten='" + hoten + '\'' +
                ", namsinh='" + namsinh + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }
    public abstract  String moTaCongViec();
}
