package TestJava2.cau3;

import java.util.Scanner;

public class Main {
    private static  HocSinh[] dsHocSinh = new  HocSinh[5];
    public static Scanner in = new Scanner(System.in);

    public static HocSinh nhapHocSinh(){
            System.out.println("Nhap Ho ten: ");
            String hoTen = in.nextLine();
            System.out.println("Nhap gioi tinh: ");
            String gioiTinh = in.nextLine();
            String tem= in.nextLine();
            System.out.println("Nhap tuoi");
            int tuoi = Integer.parseInt(in.nextLine());
            System.out.println("Nhap diem toan:");
            float diemToan = in.nextFloat();
            System.out.println("Nhap diem vat li:");
            float diemVatli = in.nextFloat();
            System.out.println("Nhap diem hoa hoc:");
            float diemHoahoc = in.nextFloat();
            String temp = in.nextLine();
            return new HocSinh(hoTen,gioiTinh,tuoi,diemToan,diemVatli,diemHoahoc);
    }
    public static void nhapDSHocSinh(){
    for (int i = 0; i < 5; i++){
        System.out.println("Hoc sinh thu " + (i + 1));
        HocSinh hs = nhapHocSinh();
        dsHocSinh[i] = hs;
    }}
    public static void inDSHocSinh() {
        for (int i = 0; i < 5; i++) {
            System.out.println(dsHocSinh[i].displayInfor());
        }
    }
    public static void swap(HocSinh hs1, HocSinh hs2){
        HocSinh temp = hs1;
        hs1 = hs2;
        hs2 = temp;
    }
    public static void sapxeptheoGPAtangdan(){
        for (int i = 0; i < 5-1; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (dsHocSinh[i].setGPA() > dsHocSinh[j].setGPA()){
                    swap(dsHocSinh[i], dsHocSinh[j]);
                }
            }
        }
    }
    public static void sapxeptheoGPAgiamdan(){
        for (int i = 0; i < 5-1; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (dsHocSinh[i].setGPA() < dsHocSinh[j].setGPA()){
                    swap(dsHocSinh[i], dsHocSinh[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        nhapDSHocSinh();
        inDSHocSinh();
        System.out.println("-----------------------------------------------------------------");
        sapxeptheoGPAtangdan();
        System.out.println("Danh sach sau khi sap xep tang dan:\n");
        inDSHocSinh();
        System.out.println("Danh sach sau khi sap xep giam dan:\n");
        sapxeptheoGPAgiamdan();

    }
}
