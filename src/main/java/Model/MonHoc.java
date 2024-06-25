package Model;

import java.sql.Date;

public class MonHoc {

			//1
			private String maHP;
			//2
			private String tenHP;
			//3
			private String tenVietTat;
			//4
			private String maIn;
			//5
			private String moTa;
			//6
			private int soTiet;
			//7
			private double soTinChi;
			//8
			private String loaiMon;
			//9
			private Date ngayBanHanh;
			//10
			private String mucTieu;
			//11
			private String noiDungChuongTrinh;
			//12
			private String trinhDoDaoTao;
			//13
			private String taiLieuThamKhao;
			//14
			private String nhomBienSoan;
			//15
			private String hocPhanHocTruoc;
			//16
			private String hocPhanSongHanh;
			//17
			private String hocPhanTienQuyet;
			//18
			private String hocPhanTuongDuong;
			//19
			private int soLuongSVToiDa;
			//20
			private int tongSoTiet;
			//21
			private double donGiaTin;
			//22
			private int hocKi;
			
			public MonHoc()
			{
				// TODO Auto-generated constructor stub
			}

			public MonHoc(String maHP, String tenHP, String tenVietTat, String maIn, String moTa, int soTiet,
					double soTinChi, String loaiMon, Date ngayBanHanh, String mucTieu, String noiDungChuongTrinh,
					String trinhDoDaoTao, String taiLieuThamKhao, String nhomBienSoan, String hocPhanHocTruoc,
					String hocPhanSongHanh, String hocPhanTienQuyet, String hocPhanTuongDuong, int soLuongSVToiDa,
					int tongSoTiet, double donGiaTin, int hocKi) {
				super();
				this.maHP = maHP;
				this.tenHP = tenHP;
				this.tenVietTat = tenVietTat;
				this.maIn = maIn;
				this.moTa = moTa;
				this.soTiet = soTiet;
				this.soTinChi = soTinChi;
				this.loaiMon = loaiMon;
				this.ngayBanHanh = ngayBanHanh;
				this.mucTieu = mucTieu;
				this.noiDungChuongTrinh = noiDungChuongTrinh;
				this.trinhDoDaoTao = trinhDoDaoTao;
				this.taiLieuThamKhao = taiLieuThamKhao;
				this.nhomBienSoan = nhomBienSoan;
				this.hocPhanHocTruoc = hocPhanHocTruoc;
				this.hocPhanSongHanh = hocPhanSongHanh;
				this.hocPhanTienQuyet = hocPhanTienQuyet;
				this.hocPhanTuongDuong = hocPhanTuongDuong;
				this.soLuongSVToiDa = soLuongSVToiDa;
				this.tongSoTiet = tongSoTiet;
				this.donGiaTin = donGiaTin;
				this.hocKi = hocKi;
			}


			public String getMaHP() {
				return maHP;
			}



			public void setMaHP(String maHP) {
				this.maHP = maHP;
			}



			public String getTenHP() {
				return tenHP;
			}



			public void setTenHP(String tenHP) {
				this.tenHP = tenHP;
			}



			public String getTenVietTat() {
				return tenVietTat;
			}



			public void setTenVietTat(String tenVieTat) {
				this.tenVietTat = tenVieTat;
			}



			public String getMaIn() {
				return maIn;
			}



			public void setMain(String maIn) {
				this.maIn = maIn;
			}



			public String getMoTa() {
				return moTa;
			}



			public void setMoTa(String moTa) {
				this.moTa = moTa;
			}



			public double getSoTinChi() {
				return soTinChi;
			}



			public void setSoTinChi(double soTinChi) {
				this.soTinChi = soTinChi;
			}



			public String getLoaiMon() {
				return loaiMon;
			}



			public void setLoaiMon(String loaiMon) {
				this.loaiMon = loaiMon;
			}



			public Date getNgayBanHanh() {
				return ngayBanHanh;
			}



			public void setNgayBanHanh(Date ngayBanHanh) {
				this.ngayBanHanh = ngayBanHanh;
			}



			public String getMucTieu() {
				return mucTieu;
			}



			public void setMucTieu(String mucTieu) {
				this.mucTieu = mucTieu;
			}



			public String getNoiDungChuongTrinh() {
				return noiDungChuongTrinh;
			}



			public void setNoiDungChuongTrinh(String noiDungChuongTrinh) {
				this.noiDungChuongTrinh = noiDungChuongTrinh;
			}



			public String getTrinhDoDaoTao() {
				return trinhDoDaoTao;
			}



			public void setTrinhDoDaoTao(String trinhDoDaoTao) {
				this.trinhDoDaoTao = trinhDoDaoTao;
			}



			public String getTaiLieuThamKhao() {
				return taiLieuThamKhao;
			}



			public void setTaiLieuThamKhao(String taiLieuThamKhao) {
				this.taiLieuThamKhao = taiLieuThamKhao;
			}



			public String getNhomBienSoan() {
				return nhomBienSoan;
			}



			public void setNhomBienSoan(String nhomBienSoan) {
				this.nhomBienSoan = nhomBienSoan;
			}



			public String getHocPhanHocTruoc() {
				return hocPhanHocTruoc;
			}



			public void setHocPhanHocTruoc(String hocPhanHocTruoc) {
				this.hocPhanHocTruoc = hocPhanHocTruoc;
			}



			public String getHocPhanSongHanh() {
				return hocPhanSongHanh;
			}



			public void setHocPhanSongHanh(String hocPhanSongHanh) {
				this.hocPhanSongHanh = hocPhanSongHanh;
			}



			public String getHocPhanTienQuyet() {
				return hocPhanTienQuyet;
			}



			public void setHocPhanTienQuyet(String hocPhanTienQuyet) {
				this.hocPhanTienQuyet = hocPhanTienQuyet;
			}



			public String getHocPhanTuongDuong() {
				return hocPhanTuongDuong;
			}



			public void setHocPhanTuongDuong(String hocPhanTuongDuong) {
				this.hocPhanTuongDuong = hocPhanTuongDuong;
			}



			public int getSoLuongSVToiDa() {
				return soLuongSVToiDa;
			}



			public void setSoLuongSVToiDa(int soLuongSVToiDa) {
				this.soLuongSVToiDa = soLuongSVToiDa;
			}



			public double getDonGiaTin() {
				return donGiaTin;
			}



			public void setDonGiaTin(double donGiaTin) {
				this.donGiaTin = donGiaTin;
			}

			public int getSoTiet() {
				return soTiet;
			}

			public void setSoTiet(int soTiet) {
				this.soTiet = soTiet;
			}

			public int getTongSoTiet() {
				return tongSoTiet;
			}

			public void setTongSoTiet(int tongSoTiet) {
				this.tongSoTiet = tongSoTiet;
			}

			public int getHocKi() {
				return hocKi;
			}

			public void setHocKi(int hocKi) {
				this.hocKi = hocKi;
			}

			public void setMaIn(String maIn) {
				this.maIn = maIn;
			}

			@Override
			public String toString() {
				return "MonHoc [maHP=" + maHP + ", tenHP=" + tenHP + ", tenVietTat=" + tenVietTat + ", maIn=" + maIn
						+ ", moTa=" + moTa + ", soTiet=" + soTiet + ", soTinChi=" + soTinChi + ", loaiMon=" + loaiMon
						+ ", ngayBanHanh=" + ngayBanHanh + ", mucTieu=" + mucTieu + ", noiDungChuongTrinh="
						+ noiDungChuongTrinh + ", trinhDoDaoTao=" + trinhDoDaoTao + ", taiLieuThamKhao=" + taiLieuThamKhao
						+ ", nhomBienSoan=" + nhomBienSoan + ", hocPhanHocTruoc=" + hocPhanHocTruoc + ", hocPhanSongHanh="
						+ hocPhanSongHanh + ", hocPhanTienQuyet=" + hocPhanTienQuyet + ", hocPhanTuongDuong="
						+ hocPhanTuongDuong + ", soLuongSVToiDa=" + soLuongSVToiDa + ", tongSoTiet=" + tongSoTiet
						+ ", donGiaTin=" + donGiaTin + ", hocKi=" + hocKi + "]";
			}
			
	
}
