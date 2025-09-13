import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc_217 = new Scanner(System.in);

		QuanLy ql_217 = new QuanLy();
		ql_217.nhapDanhSach(sc_217);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql_217.hienThiDanhSach();

		sc_217.close();
	}

}
	