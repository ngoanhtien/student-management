package Model;

public class TaiKhoan {
	private int maTK;
	private int maSV;
	private String matKhau;
	private String vaiTro;
	
	public TaiKhoan() {
		
	}
	
	public int getMaTK() {
		return maTK;
	}
	public void setMaTK(int maTK) {
		this.maTK = maTK;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getVaiTro() {
		return vaiTro;
	}
	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}

	public TaiKhoan(int maTK, int maSV, String matKhau, String vaiTro) {
		super();
		this.maTK = maTK;
		this.maSV = maSV;
		this.matKhau = matKhau;
		this.vaiTro = vaiTro;
	}

	@Override
	public String toString() {
		return "TaiKhoan [maTK=" + maTK + ", maSV=" + maSV + ", matKhau=" + matKhau + ", vaiTro=" + vaiTro + "]";
	}
	
	
}
