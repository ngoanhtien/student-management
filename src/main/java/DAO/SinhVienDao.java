package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.SinhVien;

public class SinhVienDao extends Initialization implements Dao<SinhVien> {

	public SinhVienDao() {
		super();
	}

	@Override
	public List<SinhVien> getALL() {
		List<SinhVien> list = new ArrayList<>();
		String query = "SELECT * FROM sinhvien";
		try {
			PreparedStatement pre = this.getCon().prepareStatement(query);
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				list.add(new SinhVien(
						rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4), 
						rs.getDate(5), 
						rs.getString(6), 
						rs.getString(7),
						rs.getString(8), 
						rs.getString(9),
						rs.getString(10),
						rs.getString(11), 
						rs.getString(12)
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void save(SinhVien t) {
		String query = "INSERT INTO sinhvien\r\n"
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = this.getCon().prepareStatement(query);
			ps.setInt(1, t.getMasv());
			ps.setString(2, t.getHodem());
			ps.setString(3, t.getTen());
			ps.setString(4, t.getQuequan());
			ps.setDate(5, t.getNgaysinh());
			ps.setString(6, t.getCccd());
			ps.setString(7, t.getQuoctich());
			ps.setString(8, t.getDantoc());
			ps.setString(9, t.getTongiao());
			ps.setString(10, t.getSdt());
			ps.setString(11, t.getEmail());
			ps.setString(12, t.getHedaotao());
			int kt = ps.executeUpdate();
			if(kt==0)
			{
				this.getCon().rollback();
			}
			this.getCon().commit();
		} catch (Exception e) {
		}
		
	}

	@Override
	public void delete(String maSV) {
		String query = "DELETE FROM sinhvien WHERE masv = ?";
		try {
			PreparedStatement pre = this.getCon().prepareStatement(query);
			pre.setString(1, maSV);
			int kt = pre.executeUpdate();
			if(kt==0)
			{
				this.getCon().rollback();
			}
			this.getCon().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void update(SinhVien t) {
		String query = "UPDATE sinhvien\r\n"
				+ "SET hodem = ?,\r\n"
				+ "ten = ?,\r\n"
				+ "quequan = ?,\r\n"
				+ "ngaysinh = ?,\r\n"
				+ "cccd = ?,\r\n"
				+ "quoctich = ?,\r\n"
				+ "dantoc = ?,\r\n"
				+ "tongiao = ?,\r\n"
				+ "sdt = ?,\r\n"
				+ "email = ?,\r\n"
				+ "hedaotao = ?\r\n"
				+ "WHERE masv = ?";
		try {
			PreparedStatement ps = this.getCon().prepareStatement(query);
			ps.setString(1, t.getHodem());
			ps.setString(2, t.getTen());
			ps.setString(3, t.getQuequan());
			ps.setDate(4, t.getNgaysinh());
			ps.setString(5, t.getCccd());
			ps.setString(6, t.getQuoctich());
			ps.setString(7, t.getDantoc());
			ps.setString(8, t.getTongiao());
			ps.setString(9, t.getSdt());
			ps.setString(10, t.getEmail());
			ps.setString(11, t.getHedaotao());
			ps.setInt(12, t.getMasv());
			int kt = ps.executeUpdate();
			if(kt == 0)
			{
				this.getCon().rollback();
			}
			this.getCon().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public List<SinhVien> searchByTK(String txtSearch){
		List<SinhVien> list = new ArrayList<>();
		String query = "SELECT * FROM sinhvien\r\n"
				+ "where \r\n"
				+ "hodem like ? or\r\n"
				+ "ten like ? or \r\n"
				+ "quequan like ? or\r\n"
				+ "ngaysinh like ? or\r\n"
				+ "cccd like ? or\r\n"
				+ "quoctich like ? or\r\n"
				+ "dantoc like ? or\r\n"
				+ "tongiao like ? or\r\n"
				+ "sdt like ? or \r\n"
				+ "email like ? or\r\n"
				+ "hedaotao like ?\r\n"
				+ "\r\n"
				+ "";
		try {
			PreparedStatement ps = this.getCon().prepareStatement(query);
			ps.setString(1, "%"+ txtSearch + "%");
			ps.setString(2, "%"+ txtSearch + "%");
			ps.setString(3, "%"+ txtSearch + "%");
			ps.setString(4, "%"+ txtSearch + "%");
			ps.setString(5, "%"+ txtSearch + "%");
			ps.setString(6, "%"+ txtSearch + "%");
			ps.setString(7, "%"+ txtSearch + "%");
			ps.setString(8, "%"+ txtSearch + "%");
			ps.setString(9, "%"+ txtSearch + "%");
			ps.setString(10, "%"+ txtSearch + "%");
			ps.setString(11, "%"+ txtSearch + "%");
		
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new SinhVien(
						rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4), 
						rs.getDate(5), 
						rs.getString(6), 
						rs.getString(7),
						rs.getString(8), 
						rs.getString(9),
						rs.getString(10),
						rs.getString(11), 
						rs.getString(12)
						));
			}
		} catch (Exception e) {
			
		}
		return list;
	}

	public SinhVien getStudentObjectByMaSV(String masv) {
		String query = "SELECT * FROM sinhvien\r\n"
				+ "WHERE masv = ?";
		try {
			PreparedStatement ps = this.getCon().prepareStatement(query);
			ps.setString(1, masv);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return new SinhVien(
						rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4), 
						rs.getDate(5), 
						rs.getString(6), 
						rs.getString(7),
						rs.getString(8), 
						rs.getString(9),
						rs.getString(10),
						rs.getString(11), 
						rs.getString(12)
						);
						
			}
		} catch (Exception e) {
		}
		return null;
	}
	
	public List<Integer> getSLSVbyTinh()
	{
		List<Integer> li = new ArrayList<>();
		List<String> ListTinh = new ArrayList<>();
		ListTinh.add("Vinh Phuc");
		ListTinh.add("Thanh Hoa");
		ListTinh.add("Ha Noi");
		for(String i: ListTinh)
		{
			int count = 0;
			StringBuilder sql = new StringBuilder();
			sql.append("Select MaSV from sinhvien where quequan like ? ");
			try {
				PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
				pre.setString(1, i);
				ResultSet rs = pre.executeQuery();
				while(rs.next())
				{
					count++;
				}
				li.add(count);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return li;
	}

	@Override
	public int soLuongPage(int sLPT, int sLPTMT) {
		int sLP = sLPT / sLPTMT;
		if((sLPT % sLPTMT) != 0) sLP++;
		return sLP;
	}

	@Override
	public List<SinhVien> dSPTMotTrang(List<SinhVien> dspt, int indexPage, int sLPTMT) {
		List<SinhVien> li = new ArrayList<>();
		int slpt = dspt.size();
		int ghTren=(indexPage*sLPTMT < slpt) ? indexPage*sLPTMT : slpt;
		for(int i=(indexPage - 1)*sLPTMT; i< ghTren;i++)
		{
			li.add(dspt.get(i));
		}
		return li;
	}
	
	
}
