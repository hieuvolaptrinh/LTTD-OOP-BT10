package Class;

import java.util.Scanner;

public class KhachHang {
    protected String tenChuHo_217;
    protected int soNha_217;
    protected String maCongTo_217;

    public KhachHang() {

    }

    public KhachHang(String tenChuHo_217, int soNha_217, String maCongTo_217) {
        this.tenChuHo_217 = tenChuHo_217;
        this.soNha_217 = soNha_217;
        this.maCongTo_217 = maCongTo_217;
    }

    public void nhapThongTin(Scanner sc_217) {
        System.out.print("\tNhap ten chu ho: ");
        tenChuHo_217 = sc_217.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha_217 = sc_217.nextInt();
        sc_217.nextLine();
        System.out.print("\tNhap ma cong to: ");
        maCongTo_217 = sc_217.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tTen chu ho: " + tenChuHo_217);
        System.out.println("\tSo nha: " + soNha_217);
        System.out.println("\tMa cong to: " + maCongTo_217);
    }
}
