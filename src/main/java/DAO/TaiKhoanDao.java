package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import Model.TaiKhoan;

public class TaiKhoanDao extends Initialization implements Dao<TaiKhoan>{
	
	public TaiKhoanDao ()
	{
		super();
	}
	
	public Boolean xacThuc(String masv, String mk)
	{
		List<TaiKhoan> li = getALL();
		for (TaiKhoan tk : li) {
			if(masv.equals(String.valueOf(tk.getMaSV())) && tk.getMatKhau().equals(mk)) return true;
											
		}
		return false;
	}

	public String phanQuyen(String tenDN)
	{
		List<TaiKhoan> li = getALL();
		for(TaiKhoan tk : li)
		{
			if(tk.getMaSV() ==  Integer.valueOf(tenDN)) return "hs";
		}
		return "admin";
	}
	
	@Override
	public List<TaiKhoan> getALL() {
		List<TaiKhoan> li = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("select * from TaiKhoan");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			ResultSet rs = pre.executeQuery();
			while (rs.next()) {
				li.add(new TaiKhoan(
							rs.getInt("matk"),
							rs.getInt("masv"),
							rs.getString("matkhau"),
							rs.getString("vaitro")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}

	@Override
	public void save(TaiKhoan t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TaiKhoan t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int soLuongPage(int sLPT, int sLPTMT) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TaiKhoan> dSPTMotTrang(List<TaiKhoan> dspt, int indexPage, int sLPTMT) {
		// TODO Auto-generated method stub
		return null;
	}
}
