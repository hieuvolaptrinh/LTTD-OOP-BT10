package Class;

import java.util.Scanner;

public class BienLai extends KhachHang {
    private int chiSoMoi_217;
    private int chiSoCu_217;
    private double tien_217;

    public BienLai() {

    }

    public BienLai(int chiSoMoi_217, int chiSoCu_217, double tien_217) {
        this.chiSoMoi_217 = chiSoMoi_217;
        this.chiSoCu_217 = chiSoCu_217;
        this.tien_217 = tien_217;
    }

    public BienLai(String tenChuHo_217, int chiSoMoi_217, int chiSoCu_217, double tien_217) {
        this.tenChuHo_217 = tenChuHo_217;
        this.chiSoMoi_217 = chiSoMoi_217;
        this.chiSoCu_217 = chiSoCu_217;
        this.tien_217 = tien_217;
    }

    public void nhapThongTin(Scanner sc_217) {
        super.nhapThongTin(sc_217);
        System.out.print("\tNhap chi so moi: ");
        chiSoMoi_217 = sc_217.nextInt();
        sc_217.nextLine();
        System.out.print("\tNhap chi so cu: ");
        chiSoCu_217 = sc_217.nextInt();
        sc_217.nextLine();
        tien_217 = (chiSoMoi_217 - chiSoCu_217) * 750;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tChi so moi: " + chiSoMoi_217);
        System.out.println("\tChi so cu: " + chiSoCu_217);
        System.out.println("\tTien: " + tien_217);
    }
}
