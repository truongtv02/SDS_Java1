package Exam.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NhanVien nv1 = new KyThuat("GEN 123","TranVanTruong","02/08/2000","BacGiang","DTVT");
        System.out.println("Nhap ma nhan vien: ");
        String mnv = in.nextLine();
        System.out.println("Nhap Ho ten: ");
        String ht = in.nextLine();
        System.out.println("Nhap nam sinh: ");
        String ns = in.nextLine();
        System.out.println("Nhap dia chi: ");
        String dc = in.nextLine();
        System.out.println("Nhap Chuyen nganh: ");
        String cn = in.nextLine();
        in.close();

        NhanVien nv2 = new KyThuat(mnv,ht,ns,dc,cn);
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
    }
}
