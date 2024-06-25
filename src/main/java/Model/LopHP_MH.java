package Model;

public class LopHP_MH {
	private String mahp; 
	private String tenhp;
	private String malop;
	private String tenlop;
	private String mota; 
	private int soluongsvtoida;
	
	public LopHP_MH()
	{
		
	}
	
	public LopHP_MH(String mahp, String tenhp, String malop, String tenlop, String mota, int soluongsvtoida) {
		super();
		this.mahp = mahp;
		this.tenhp = tenhp;
		this.malop = malop;
		this.tenlop = tenlop;
		this.mota = mota;
		this.soluongsvtoida = soluongsvtoida;
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
	public String getTenlop() {
		return tenlop;
	}
	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public int getSoluongsvtoida() {
		return soluongsvtoida;
	}
	public void setSoluongsvtoida(int soluongsvtoida) {
		this.soluongsvtoida = soluongsvtoida;
	}

	@Override
	public String toString() {
		return "LopHP_MH [mahp=" + mahp + ", tenhp=" + tenhp + ", malop=" + malop + ", tenlop=" + tenlop + ", mota="
				+ mota + ", soluongsvtoida=" + soluongsvtoida + "]";
	}
	
}
