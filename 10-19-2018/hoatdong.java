package venha;

import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class hoatdong {
	Vector list = new Vector();

	public hoatdong() {
		while (true) {
			System.out.println("Quan ly NV");
			System.out.println("1. NhapNV");
			System.out.println("2. Xem NV");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch (n) {
			case 1:
				NhapTT();
				break;
			case 2:
				InTT();
				break;
			}
		}
	}

	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		System.out.print("Nhập vào số lượng nhân viên cần thêm");
		int n = Integer.parseInt(key.nextLine());
		for(int i = 0; i < n; i++) {
			System.out.println("\n Nhân viên thứ"+(i+1));
			System.out.print("Nhập mã nhân viên: ");
			String maNV = key.nextLine();
			System.out.print("Nhập họ tên nhân viên: ");
			String tenNV = key.nextLine();
			System.out.print("Nhập giới tính : ");
			String gioitinh = key.nextLine();
			System.out.print("Nhập gmail: ");
			String gmail = key.nextLine();
			System.out.print("Nhập tuổi: ");
			int tuoi = Integer.parseInt(key.nextLine());
			quanly b = new quanly(maNV, tenNV, tuoi, gioitinh, gmail);
			list.add(b);	
		}
	}

	public void InTT() {
		Enumeration eQl = list.elements();
		int i = 1;
		while (eQl.hasMoreElements()) {
			quanly ql = (quanly) eQl.nextElement();
//			quanly ql = new quanly();
			System.out.println("Ma Nhan Vien =" + ql.getMaNV() + " va ten NV la " + ql.getTenNV());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new hoatdong();
	}
}
