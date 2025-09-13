import Class.QuanLy;
import Class.BienLai;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc_217 = new Scanner(System.in);
        QuanLy ql_217 = new QuanLy();
        int luaChon_217;

        System.out.println("=== CHUONG TRINH QUAN LY BIEN LAI DIEN ===");

        do {
            // Hiển thị menu
            System.out.println("\n--- MENU CHINH ---");
            System.out.println("1. Nhap danh sach bien lai");
            System.out.println("2. Hien thi danh sach bien lai");
            System.out.println("3. Them mot bien lai moi");
            System.out.println("4. Tinh tong tien dien cua tat ca ho gia dinh");
            System.out.println("5. Tim ho gia dinh co tien dien cao nhat");
            System.out.println("6. Tim ho gia dinh theo ten chu ho");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");

            luaChon_217 = sc_217.nextInt();
            sc_217.nextLine(); // Xử lý ký tự xuống dòng

            switch (luaChon_217) {
                case 1:
                    System.out.println("\n--- NHAP DANH SACH BIEN LAI ---");
                    ql_217.nhapDanhSach(sc_217);
                    System.out.println("Nhap danh sach bien lai thanh cong!");
                    break;

                case 2:
                    System.out.println("\n--- DANH SACH BIEN LAI CUA CAC HO GIA DINH ---");
                    ql_217.hienThiDanhSach();
                    break;

                case 3:
                    System.out.println("\n--- THEM BIEN LAI MOI ---");
                    System.out.println("Nhap thong tin bien lai moi:");
                    BienLai bienLaiMoi_217 = new BienLai();
                    bienLaiMoi_217.nhapThongTin(sc_217);
                    ql_217.themBienLai(bienLaiMoi_217);
                    System.out.println("Them bien lai moi thanh cong!");
                    break;

                case 4:
                    System.out.println("\n--- TINH TONG TIEN DIEN ---");
                    double tongTien_217 = tinhTongTien(ql_217);
                    System.out.printf("Tong tien dien cua tat ca ho gia dinh: %.0f VND\n", tongTien_217);
                    break;

                case 5:
                    System.out.println("\n--- HO GIA DINH CO TIEN DIEN CAO NHAT ---");
                    timHoTienCaoNhat(ql_217);
                    break;

                case 6:
                    System.out.println("\n--- TIM HO GIA DINH THEO TEN ---");
                    System.out.print("Nhap ten chu ho can tim: ");
                    String tenCanTim_217 = sc_217.nextLine();
                    timHoTheoTen(ql_217, tenCanTim_217);
                    break;

                case 0:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    System.out.println("Hen gap lai!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
                    break;
            }

        } while (luaChon_217 != 0);

        sc_217.close();
    }

    public static double tinhTongTien(QuanLy ql_217) {
        double tongTien_217 = 0;

        System.out.println("Chuc nang nay can cap nhat them phuong thuc trong class QuanLy");
        return tongTien_217;
    }


    public static void timHoTienCaoNhat(QuanLy ql_217) {
        System.out.println("Chuc nang nay can cap nhat them phuong thuc trong class QuanLy");
    }


    public static void timHoTheoTen(QuanLy ql_217, String ten_217) {
        System.out.println("Chuc nang nay can cap nhat them phuong thuc trong class QuanLy");
        System.out.println("Dang tim ho gia dinh co ten chu ho: " + ten_217);
    }
}