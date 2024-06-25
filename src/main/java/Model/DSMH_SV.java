package Model;

public class DSMH_SV {
	private String mahp;
	private String tenhp;
	private String malop;
	private int hocki;
	private double sotinchi;
	private float tx1;
	private float tx2;
	private float tx3;
	private double diem;
	private String trangthaihoc;
	
	public DSMH_SV()
	{
		super();
	}
	
	

	public DSMH_SV(String mahp, String tenhp, String malop, int hocki, double sotinchi, float tx1, float tx2, float tx3,
			double diem, String trangthaihoc) {
		super();
		this.mahp = mahp;
		this.tenhp = tenhp;
		this.malop = malop;
		this.hocki = hocki;
		this.sotinchi = sotinchi;
		this.tx1 = tx1;
		this.tx2 = tx2;
		this.tx3 = tx3;
		this.diem = diem;
		this.trangthaihoc = trangthaihoc;
	}



	public String getMahp() {
		return mahp;
	}

	public void setMahp(String mahp) {
		this.mahp = mahp;
	}

	public String getTenhp() {
		return tenhp;
	}

	public void setTenhp(String tenhp) {
		this.tenhp = tenhp;
	}

	public String getMalop() {
		return malop;
	}

	public void setMalop(String malop) {
		this.malop = malop;
	}

	public int getHocki() {
		return hocki;
	}

	public void setHocki(int hocki) {
		this.hocki = hocki;
	}

	public double getSotinchi() {
		return sotinchi;
	}

	public void setSotinchi(double sotinchi) {
		this.sotinchi = sotinchi;
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

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public String getTrangthaihoc() {
		return trangthaihoc;
	}

	public void setTrangthaihoc(String trangthaihoc) {
		this.trangthaihoc = trangthaihoc;
	}

	@Override
	public String toString() {
		return "DSMH_SV [mahp=" + mahp + ", tenhp=" + tenhp + ", malop=" + malop + ", hocki=" + hocki + ", sotinchi="
				+ sotinchi + ", tx1=" + tx1 + ", tx2=" + tx2 + ", tx3=" + tx3 + ", diem=" + diem + ", trangthaihoc="
				+ trangthaihoc + "]";
	}

	
	
	
	
}
