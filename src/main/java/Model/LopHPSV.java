package Model;

public class LopHPSV {
	
	private String maLop;
	private int maSV;
	private float tx1;
	private float tx2;
	private float tx3;
	private float diem;
	private String hoDem;
	private String ten;
	private String trangThaiHoc; 

	public LopHPSV() {
		// TODO Auto-generated constructor stub
	}

	
	
	public LopHPSV(String maLop, int maSV, float tx1, float tx2, float tx3, float diem, String hoDem, String ten,
			String trangThaiHoc) {
		super();
		this.maLop = maLop;
		this.maSV = maSV;
		this.tx1 = tx1;
		this.tx2 = tx2;
		this.tx3 = tx3;
		this.diem = diem;
		this.hoDem = hoDem;
		this.ten = ten;
		this.trangThaiHoc = trangThaiHoc;
	}



	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	
	public float getTx1() {
		return tx1;
	}

	public void setTx1(float tx1) {
		this.tx1 = tx1;
	}

	public float getTx2() {
		return tx2;
	}

	public void setTx2(float tx2) {
		this.tx2 = tx2;
	}

	public float getTx3() {
		return tx3;
	}

	public void setTx3(float tx3) {
		this.tx3 = tx3;
	}

	public float getDiem() {
		return diem;
	}

	public void setDiem(float diem) {
		this.diem = diem;
	}


	public String getHoDem() {
		return hoDem;
	}


	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTrangThaiHoc() {
		return trangThaiHoc;
	}

	public void setTrangThaiHoc(String trangThaiHoc) {
		this.trangThaiHoc = trangThaiHoc;
	}



	@Override
	public String toString() {
		return "LopHPSV [maLop=" + maLop + ", maSV=" + maSV + ", tx1=" + tx1 + ", tx2=" + tx2 + ", tx3=" + tx3
				+ ", diem=" + diem + ", hoDem=" + hoDem + ", ten=" + ten + ", trangThaiHoc=" + trangThaiHoc + "]";
	}

	
	

}
