package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;


import Model.MonHoc;

public class MonHocDao extends Initialization implements Dao<MonHoc>{

	public MonHocDao()
	{
		super();
	}
	
	@Override
	public List<MonHoc> getALL() {
		List<MonHoc> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("select * ");
		sql.append("from monhoc ");
		sql.append("order by hocki asc ");
		try {
			PreparedStatement ps = this.getCon().prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new MonHoc(
						rs.getString("mahp"), 
						rs.getString("tenhp"),
						rs.getString("tenviettat"),
						rs.getString("main"),
						rs.getString("mota"),
						rs.getInt("sotiet"), 
						rs.getDouble("sotinchi"),
						rs.getString("loaimon"), 
						rs.getDate("ngaybanhanh"),
						rs.getString("muctieu"),
						rs.getString("noidungchuongtrinh"),
						rs.getString("trinhdodaotao"), 
						rs.getString("tailieuthamkhao"),
						rs.getString("nhombiensoan"),
						rs.getString("hocphanhoctruoc"),
						rs.getString("hocphansonghanh"),
						rs.getString("hocphantienquyet"),
						rs.getString("hocphantuongduong"),
						rs.getInt("soluongSVtoida"),
						rs.getInt("tongsotiet"),
						rs.getInt("dongia1tin"),
						rs.getInt("hocki")
						));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void save(MonHoc t) {
		String query = "INSERT INTO monhoc\r\n"
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = this.getCon().prepareStatement(query);
			ps.setString(1, t.getMaHP());
			ps.setString(2, t.getTenHP());
			ps.setString(3, t.getTenVietTat());
			ps.setString(4, t.getMaIn());
			ps.setString(5, t.getMoTa());
			ps.setInt(6, t.getSoTiet());
			ps.setDouble(7, t.getSoTinChi());
			ps.setString(8, t.getLoaiMon());
			ps.setDate(9,  t.getNgayBanHanh());
			ps.setString(10, t.getMucTieu());
			ps.setString(11, t.getNoiDungChuongTrinh());
			ps.setString(12, t.getTrinhDoDaoTao());
			ps.setString(13, t.getTaiLieuThamKhao());
			ps.setString(14, t.getNhomBienSoan());
			ps.setString(15, t.getHocPhanHocTruoc());
			ps.setString(16, t.getHocPhanSongHanh());
			ps.setString(17, t.getHocPhanTienQuyet());
			ps.setString(18, t.getHocPhanTuongDuong());
			ps.setInt(19, t.getSoLuongSVToiDa());
			ps.setInt(20, t.getTongSoTiet());
			ps.setDouble(21, t.getDonGiaTin());
			ps.setInt(22, t.getHocKi());
			int kt= ps.executeUpdate();
			if(kt == 0) this.getCon().rollback();
			this.getCon().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(String maHP) {
		String query = "DELETE FROM monhoc WHERE mahp = ?";
		try {
			PreparedStatement ps = this.getCon().prepareStatement(query);
			ps.setString(1, maHP);
			int kt = ps.executeUpdate();
			if(kt==0) this.getCon().rollback();
			this.getCon().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(MonHoc t) {
		String query = "UPDATE monhoc\r\n"
				+ "SET tenhp = ?,\r\n"
				+ "tenviettat = ?,\r\n"
				+ "main = ?,\r\n"
				+ "mota = ?,\r\n"
				+ "sotiet = ?,\r\n"
				+ "sotinchi = ?,\r\n"
				+ "loaimon = ?,\r\n"
				+ "ngaybanhanh = ?,\r\n"
				+ "muctieu = ?,\r\n"
				+ "noidungchuongtrinh = ?,\r\n"
				+ "trinhdodaotao = ?,\r\n"
				+ "tailieuthamkhao = ?,\r\n"
				+ "nhombiensoan = ?,\r\n"
				+ "hocphanhoctruoc = ?,\r\n"
				+ "hocphansonghanh = ?,\r\n"
				+ "hocphantienquyet = ?,\r\n"
				+ "hocphantuongduong = ?,\r\n"
				+ "soluongSVtoida = ?,\r\n"
				+ "tongsotiet = ?,\r\n"
				+ "dongia1tin = ?,\r\n"
				+ "hocki = ?\r\n"
				+ "WHERE mahp = ?";
		try {
			PreparedStatement ps =this.getCon().prepareStatement(query);
			ps.setString(1, t.getTenHP());
			ps.setString(2, t.getTenVietTat());
			ps.setString(3, t.getMaIn());
			ps.setString(4, t.getMoTa());
			ps.setInt(5, t.getSoTiet());
			ps.setDouble(6, t.getSoTinChi());
			ps.setString(7, t.getLoaiMon());
			ps.setDate(8, t.getNgayBanHanh());
			ps.setString(9, t.getMucTieu());
			ps.setString(10, t.getNoiDungChuongTrinh());
			ps.setString(11, t.getTrinhDoDaoTao());
			ps.setString(12, t.getTaiLieuThamKhao());
			ps.setString(13, t.getNhomBienSoan());
			ps.setString(14, t.getHocPhanHocTruoc());
			ps.setString(15, t.getHocPhanSongHanh());
			ps.setString(16, t.getHocPhanTienQuyet());
			ps.setString(17, t.getHocPhanTuongDuong());
			ps.setInt(18, t.getSoLuongSVToiDa());
			ps.setInt(19, t.getTongSoTiet());
			ps.setDouble(20, t.getDonGiaTin());
			ps.setInt(21, t.getHocKi());
			ps.setString(22, t.getMaHP());
			int kt= ps.executeUpdate();
			if(kt == 0) this.getCon().rollback();
			this.getCon().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<MonHoc> searchByTK(String txtSearchMonHoc){
		List<MonHoc> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("select * ");
		sql.append("from monhoc ");
		sql.append("where mahp like ? ");
		sql.append("or tenhp like ? ");
		sql.append("or sotiet like ? ");
		sql.append("or sotinchi like ? ");
		sql.append("or loaimon like ? ");
		sql.append("or ngaybanhanh like ? ");
		sql.append("or trinhdodaotao like ? ");
		sql.append("or hocki like ? ");
		sql.append("order by hocki asc ");
		try {
			PreparedStatement ps = this.getCon().prepareStatement(sql.toString());
			ps.setString(1, "%"+ txtSearchMonHoc + "%");
			ps.setString(2, "%"+ txtSearchMonHoc + "%");
			ps.setString(3, "%"+ txtSearchMonHoc + "%");
			ps.setString(4, "%"+ txtSearchMonHoc + "%");
			ps.setString(5, "%"+ txtSearchMonHoc + "%");
			ps.setString(6, "%"+ txtSearchMonHoc + "%");
			ps.setString(7, "%"+ txtSearchMonHoc + "%");
			ps.setString(8, "%"+ txtSearchMonHoc + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new MonHoc(
						rs.getString("mahp"), 
						rs.getString("tenhp"),
						rs.getString("tenviettat"),
						rs.getString("main"),
						rs.getString("mota"),
						rs.getInt("sotiet"), 
						rs.getDouble("sotinchi"),
						rs.getString("loaimon"), 
						rs.getDate("ngaybanhanh"),
						rs.getString("muctieu"),
						rs.getString("noidungchuongtrinh"),
						rs.getString("trinhdodaotao"), 
						rs.getString("tailieuthamkhao"),
						rs.getString("nhombiensoan"),
						rs.getString("hocphanhoctruoc"),
						rs.getString("hocphansonghanh"),
						rs.getString("hocphantienquyet"),
						rs.getString("hocphantuongduong"),
						rs.getInt("soluongSVtoida"),
						rs.getInt("tongsotiet"),
						rs.getInt("dongia1tin"),
						rs.getInt("hocki")
						));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}	

	public MonHoc getSubjectObjectByMaHP(String maHP) {
		String query = "SELECT * FROM monhoc\r\n"
				+ "WHERE mahp = ?";
		try {
			PreparedStatement ps = this.getCon().prepareStatement(query);
			ps.setString(1, maHP);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return new MonHoc(
						rs.getString("mahp"), 
						rs.getString("tenhp"),
						rs.getString("tenviettat"),
						rs.getString("main"),
						rs.getString("mota"),
						rs.getInt("sotiet"), 
						rs.getDouble("sotinchi"),
						rs.getString("loaimon"), 
						rs.getDate("ngaybanhanh"),
						rs.getString("muctieu"),
						rs.getString("noidungchuongtrinh"),
						rs.getString("trinhdodaotao"), 
						rs.getString("tailieuthamkhao"),
						rs.getString("nhombiensoan"),
						rs.getString("hocphanhoctruoc"),
						rs.getString("hocphansonghanh"),
						rs.getString("hocphantienquyet"),
						rs.getString("hocphantuongduong"),
						rs.getInt("soluongSVtoida"),
						rs.getInt("tongsotiet"),
						rs.getInt("dongia1tin"),
						rs.getInt("hocki")
						);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int soLuongPage(int sLPT, int sLPTMT) {
		int sLP = sLPT / sLPTMT;
		if((sLPT % sLPTMT) != 0) sLP++;
		return sLP;
	}

	@Override
	public List<MonHoc> dSPTMotTrang(List<MonHoc> dspt, int indexPage, int sLPTMT) {
		List<MonHoc> li = new ArrayList<>();
		int slpt = dspt.size();
		int ghTren=(indexPage*sLPTMT < slpt) ? indexPage*sLPTMT : slpt;
		for(int i=(indexPage - 1)*sLPTMT; i< ghTren;i++)
		{
			li.add(dspt.get(i));
		}
		return li;
	}
}
