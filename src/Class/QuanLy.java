package Class;

import java.util.Scanner;
import java.util.ArrayList;

public class QuanLy {
    private ArrayList<BienLai> ds_217;

    public QuanLy() {
        ds_217 = new ArrayList<BienLai>(10);
    }

    public void themBienLai(BienLai bienLai_217) {
        ds_217.add(bienLai_217);
    }

    public void nhapDanhSach(Scanner sc_217) {
        BienLai bienLai_217;
        System.out.print("Nhap vao so luong bien lai: ");
        int n_217 = sc_217.nextInt();
        sc_217.nextLine();
        System.out.println("Nhap vao danh sach bien lai:");
        for (int i_217 = 0; i_217 < n_217; i_217++) {
            System.out.println("Bien lai thu " + (i_217 + 1) + " la:");
            bienLai_217 = new BienLai();
            bienLai_217.nhapThongTin(sc_217);

            themBienLai(bienLai_217);
        }
    }

    public void hienThiDanhSach() {
        for (int i_217 = 0; i_217 < ds_217.size(); i_217++) {
            System.out.println("Bien lai thu " + (i_217 + 1) + " la:");
            ds_217.get(i_217).hienThiThongTin();
            System.out.println();
        }
    }
}
