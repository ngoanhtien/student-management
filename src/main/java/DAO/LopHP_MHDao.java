package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.LopHP_MH;

public class LopHP_MHDao extends Initialization implements Dao<LopHP_MH>{

	@Override
	public List<LopHP_MH> getALL() {
		List<LopHP_MH> li = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("select monhoc.mahp, tenhp, malop, tenlop, lophp.mota, lophp.soluongsvtoida ");
		sql.append("from lophp join monhoc on lophp.mahp = monhoc.mahp ");
		sql.append("order by hocki asc ");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				li.add( new LopHP_MH(
							rs.getString("mahp"),
							rs.getString("tenhp"),
							rs.getString("malop"),
							rs.getString("tenlop"),
							rs.getString("mota"),
							rs.getInt("soluongsvtoida")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}

	public List<LopHP_MH> getALLByMSV(int masv) {
		List<LopHP_MH> li = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("select monhoc.mahp, tenhp, lophp.malop, tenlop, lophp.mota, lophp.soluongsvtoida ");
		sql.append("from lophp join monhoc on lophp.mahp = monhoc.mahp ");
		sql.append("join lophp_sv on lophp.malop = lophp_sv.malop ");
		sql.append("where masv = ? and trangthaihoc like '%Chưa học%' ");
		sql.append("order by hocki asc ");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setInt(1, masv);
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				li.add( new LopHP_MH(
							rs.getString("mahp"),
							rs.getString("tenhp"),
							rs.getString("malop"),
							rs.getString("tenlop"),
							rs.getString("mota"),
							rs.getInt("soluongsvtoida")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	
	@Override
	public void save(LopHP_MH t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(LopHP_MH t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int soLuongPage(int sLPT, int sLPTMT) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<LopHP_MH> dSPTMotTrang(List<LopHP_MH> dspt, int indexPage, int sLPTMT) {
		// TODO Auto-generated method stub
		return null;
	}

}
