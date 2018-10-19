package venha;

import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class quanly {
	String maNV, tenNV, gioitinh, gmail;
	int tuoi;
	Scanner key = new Scanner(System.in);

	public quanly() {

	}

	public quanly(String maNV, String tenNV, int tuoi, String gioitinh, String gmail) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		this.gmail = gmail;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public Scanner getKey() {
		return key;
	}

	public void setKey(Scanner key) {
		this.key = key;
	}

}
