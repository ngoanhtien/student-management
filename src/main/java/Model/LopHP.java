package Model;

import java.sql.Date;

public class LopHP {

	private String maLop;
	private String tenLop;
	private Date tGBD;
	private Date tGKT;
	private String moTa;
	private int sLSVTD;
	private String maPhong;
	private String maHP;
	
	public LopHP() {
		
	}
	
	public LopHP(String maLop, String tenLop, Date tGBD, Date tGKT, String moTa, int sLSVTD, String maPhong,
			String maHP) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.tGBD = tGBD;
		this.tGKT = tGKT;
		this.moTa = moTa;
		this.sLSVTD = sLSVTD;
		this.maPhong = maPhong;
		this.maHP = maHP;
	}

	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public Date gettGBD() {
		return tGBD;
	}

	public void settGBD(Date tGBD) {
		this.tGBD = tGBD;
	}

	public Date gettGKT() {
		return tGKT;
	}

	public void settGKT(Date tGKT) {
		this.tGKT = tGKT;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public int getsLSVTD() {
		return sLSVTD;
	}

	public void setsLSVTD(int sLSVTD) {
		this.sLSVTD = sLSVTD;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getMaHP() {
		return maHP;
	}

	public void setMaHP(String maHP) {
		this.maHP = maHP;
	}

	@Override
	public String toString() {
		return "LopHP [maLop=" + maLop + ", tenLop=" + tenLop + ", tGBD=" + tGBD + ", tGKT=" + tGKT + ", moTa=" + moTa
				+ ", sLSVTD=" + sLSVTD + ", maPhong=" + maPhong + ", maHP=" + maHP + "]";
	}
	
	
}
