package nhanvien;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class NhanVien {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String maNV ;
    private String hoTen;
    private String gioiTinh; //male 1 / female 2
    private double luongCoBan;
    private String soDT;
    private int soNgayDiLam;
    private String diaChi;
    private int chucVu ; // 1 nhan vien , 2 to truong , 3 quan ly ca

    // constructor
    public NhanVien(){}

    public NhanVien(String maNV, String hoTen , double luongCoBan , String soDT , int soNgayDiLam , String diaChi , int chucVu){
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.chucVu = chucVu;
        this.diaChi = diaChi;
        this.soNgayDiLam = soNgayDiLam;
        this.soDT = soDT;
    }

    // constructor sao chép
    public NhanVien(NhanVien nv){
        this.maNV = nv.maNV;
        this.hoTen = nv.hoTen;
        this.chucVu = nv.chucVu;
        this.diaChi = nv.diaChi;
        this.soDT = nv.soDT;
        this.soNgayDiLam = nv.soNgayDiLam;
        this.luongCoBan = nv.luongCoBan;
    }
    // getter va setter
    public String getMaNV(){
        return maNV;
    }
    public String getHoTen(){
        return hoTen;
    }

    public String getGioiTinh(){
        return gioiTinh;
    }
    public void setMaNV (String maNV){
        this.maNV=maNV;
    }
    public void setHoTen(String hoTen) {
        this.hoTen=hoTen;
    }
    public void setGioiTinh(String gioiTinh){
        this.gioiTinh=gioiTinh;
    }
    public void setLuong (double luong){
        this.luongCoBan=luongCoBan;
    }

    // check date


    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap ma so nhan vien vao day ");
        maNV = sc.nextLine();
        System.out.println("moi ban nhap ten nhan vien ");
        hoTen = sc.nextLine();
        System.out.println("moi ban nhap gioi tinh vao day :");
        gioiTinh = sc.nextLine();
        System.out.println("moi ban nhap chuc vu cua minh ");
        chucVu = Integer.parseInt(sc.nextLine());
        System.out.println("nhap luong co ban cua nhan vien "+maNV);
        luongCoBan = Double.parseDouble(sc.nextLine());
        do {
            System.out.println("nhap so dien thoai cua nhan vien "+soDT);
            soDT = sc.nextLine();
            if (soDT.length() != 10){
                System.out.println("so dien thoai ma ban nhap khong hop le ");
                System.out.println("yeu cau ban nhap lai dung 10 so ");
            }
        }
        while (soDT.length() != 10);
        System.out.println("nhap dia chi cua ban ");
        diaChi = sc.nextLine();
    }

    public void xuat(){
        System.out.format("%8s | %18s | %8s | %14s | %10s | %4s | %7s || \n",maNV,hoTen,soDT,diaChi,chucVu,soNgayDiLam,luongCoBan);
    }

    // phuong thuc tinh luong nhan vien

    public void luongNhanVien(int soNgayDiLam){
        double luongThang = luongCoBan * soNgayDiLam ;
    }
}