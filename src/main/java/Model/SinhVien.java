package Model;

import java.sql.Date;

public class SinhVien {

	private int masv;
	private String hodem;
	private String ten;
	private String quequan;
	private Date ngaysinh;
	private String cccd;
	private String quoctich;
	private String dantoc;
	private String tongiao;
	private String sdt;
	private String email;
	private String hedaotao;
	public SinhVien() {
	}
	public SinhVien(int masv, String hodem, String ten, String quequan, Date ngaysinh, String cccd,
			String quoctich, String dantoc, String tongiao, String sdt, String email, String hedaotao) {
		this.masv = masv;
		this.hodem = hodem;
		this.ten = ten;
		this.quequan = quequan;
		this.ngaysinh = ngaysinh;
		this.cccd = cccd;
		this.quoctich = quoctich;
		this.dantoc = dantoc;
		this.tongiao = tongiao;
		this.sdt = sdt;
		this.email = email;
		this.hedaotao = hedaotao;
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getHodem() {
		return hodem;
	}
	public void setHodem(String hodem) {
		this.hodem = hodem;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
	public String getQuoctich() {
		return quoctich;
	}
	public void setQuoctich(String quoctich) {
		this.quoctich = quoctich;
	}
	public String getDantoc() {
		return dantoc;
	}
	public void setDantoc(String dantoc) {
		this.dantoc = dantoc;
	}
	public String getTongiao() {
		return tongiao;
	}
	public void setTongiao(String tongiao) {
		this.tongiao = tongiao;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHedaotao() {
		return hedaotao;
	}
	public void setHedaotao(String hedaotao) {
		this.hedaotao = hedaotao;
	}
	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hodem=" + hodem + ", ten=" + ten + ", quequan=" + quequan
				+ ", ngaysinh=" + ngaysinh + ", cccd=" + cccd + ", quoctich=" + quoctich + ", dantoc=" + dantoc
				+ ", tongiao=" + tongiao + ", sdt=" + sdt + ", email=" + email + ", hedaotao=" + hedaotao + "]";
	}
	
	
}
