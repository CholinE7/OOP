package khachhang;

import java.awt.*;
import java.util.Scanner;

public class KhachHang {
    Scanner sc = new Scanner(System.in);
    private String maKH, hoTen, gioiTinh, soDT, diaChi;

    // constructer
    public KhachHang(){}

    // constructer
    public KhachHang (String maKH, String hoTen, String gioiTinh, String soDT, String diaChi){
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.diaChi = diaChi;
    }
    // constructer copy
    public KhachHang(KhachHang kh){
        this.maKH = kh.maKH;
        this.hoTen = kh.hoTen;
        this.gioiTinh = kh.gioiTinh;
        this.soDT = kh.soDT;
        this.diaChi = kh.diaChi;
    }

    // getter and setter
    public void setMaKH (String maKH){
        this.maKH = maKH;
    }
    public void setHoTen (String hoTen){
        this.hoTen = hoTen;
    }
    public void setSoDT (String soDT){
        this.soDT = soDT;
    }
    public void setGioiTinh (String gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    public void setDiaChi (String diaChi){
        this.diaChi = diaChi;
    }

    public String getMaKH (){
        return maKH;
    }
    public String getHoTen(){
        return hoTen;
    }
    public String getSoDT(){
        return soDT;
    }
    public String getGioiTinh(){
        return gioiTinh;
    }
    public String getDiaChi(){
        return diaChi;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap ma khach hang ");
        maKH = sc.nextLine();
        System.out.println("moi ban nhap ho ten khach hang ");
        hoTen = sc.nextLine();
        do {
            System.out.println("moi ban nhap so dien thoai cua khach hang co ma "+maKH);
            soDT = sc.nextLine();
            if (soDT.length() != 10){
                System.out.println("so dien thoai khong hop le ");
                System.out.println("yeu cau ban nhap lai so dien thoai");
            }
        }while (soDT.length() != 10);

        System.out.println("moi ban nhap gioi tinh cua khach han ");
        gioiTinh = sc.nextLine();
        System.out.println("moi ban nhap dia chi cua khach hang ");
        diaChi = sc.nextLine();
    }
    public void xuat(){
        System.out.format("%10s | %14s | %10s | %4s | %14s ||\n",maKH,hoTen,soDT,gioiTinh,diaChi);
    }

}


