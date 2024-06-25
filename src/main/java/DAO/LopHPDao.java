package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Model.LopHP;

public class LopHPDao extends Initialization implements Dao<LopHP>{

	public LopHPDao()
	{
		super();
	}
	
	@Override
	public List<LopHP> getALL() {
		
		List<LopHP> li = new ArrayList<>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select * ");
		sql.append("from lophp");
		
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				LopHP x = new LopHP
				(
					rs.getString("malop"),
					rs.getString("tenlop"),
					rs.getDate("tgbatdau"),
					rs.getDate("tgketthuc"),
					rs.getString("mota"),
					rs.getInt("soluongsvtoida"),
					rs.getString("maphong"),
					rs.getString("mahp")
				);
				li.add(x);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return li;
	}

	@Override
	public void save(LopHP t) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into lophp(malop, tenlop, tgbatdau, tgketthuc, ");
		sql.append("mota, soluongsvtoida, maphong, mahp )");
		sql.append("values(?,?,?,?,?,?,?,?)");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setString(1, t.getMaLop());
			pre.setString(2, t.getTenLop());
			pre.setDate(3, t.gettGBD());
			pre.setDate(4, t.gettGKT());
			pre.setString(5, t.getMoTa());
			pre.setInt(6, t.getsLSVTD());
			pre.setString(7, t.getMaPhong());
			pre.setString(8, t.getMaHP());
			int result = pre.executeUpdate();
			if(result==0)
			{
				this.getCon().rollback();
				
			}
			this.getCon().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String malop) {
		StringBuilder sql = new StringBuilder();
		sql.append("delete from lophp ");
		sql.append("where malop = ? ");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setString(1, malop);
			int rs = pre.executeUpdate();
			if(rs==0)
			{
				this.getCon().rollback();
				
			}
			this.getCon().commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(LopHP t) {
		StringBuilder sql = new StringBuilder();
		sql.append("update lophp ");
		sql.append("set tenlop = ?, tgbatdau = ?, tgketthuc = ?, ");
		sql.append("mota = ?, soluongsvtoida = ?, ");
		sql.append("maphong = ?, mahp = ? ");
		sql.append("where malop = ?");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setString(1, t.getTenLop());
			pre.setDate(2, t.gettGBD());
			pre.setDate(3, t.gettGKT());
			pre.setString(4, t.getMoTa());
			pre.setInt(5, t.getsLSVTD());
			pre.setString(6, t.getMaPhong());
			pre.setString(7, t.getMaHP());
			pre.setString(8, t.getMaLop());
			int rs = pre.executeUpdate();
			if(rs==0)
			{
				this.getCon().rollback();
			
			}
			this.getCon().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<LopHP> getALLByTK(String tk) {
		List<LopHP> li = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("Select * from LOPHP ");
		sql.append("where malop like ? ");
		sql.append(" or tenlop like ? ");
		sql.append(" or tgbatdau like ? ");
		sql.append(" or tgketthuc like ? ");
		sql.append(" or mota like ? ");
		sql.append(" or soluongsvtoida like ? ");
		sql.append(" or maphong like ? ");
		sql.append(" or mahp like ? ");
		
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setString(1, "%"+tk+"%");
			pre.setString(2, "%"+tk+"%");
			pre.setString(3, "%"+tk+"%");
			pre.setString(4, "%"+tk+"%");
			pre.setString(5, "%"+tk+"%");
			pre.setString(6, "%"+tk+"%");
			pre.setString(7, "%"+tk+"%");
			pre.setString(8, "%"+tk+"%");
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				LopHP x = new LopHP
				(
					rs.getString("malop"),
					rs.getString("tenlop"),
					rs.getDate("tgbatdau"),
					rs.getDate("tgketthuc"),
					rs.getString("mota"),
					rs.getInt("soluongsvtoida"),
					rs.getString("maphong"),
					rs.getString("mahp")
				);
				li.add(x);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	
	public LopHP getLopHPByMa(String malop)
	{
		LopHP x =null;
		StringBuilder sql = new StringBuilder();
		sql.append("Select * from LOPHP ");
		sql.append("where malop = ? ");
		
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setString(1, malop);
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				x = new LopHP
				(
					rs.getString("malop"),
					rs.getString("tenlop"),
					rs.getDate("tgbatdau"),
					rs.getDate("tgketthuc"),
					rs.getString("mota"),
					rs.getInt("soluongsvtoida"),
					rs.getString("maphong"),
					rs.getString("mahp")
				);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	public static void main(String[] args)
	{
//		LopHPDao x = new LopHPDao();
//		String tk = "2021-09-11";
//		Date date = Date.valueOf(tk);
//		List<LopHP> li = x.getALL(tk);
//		System.out.println(date);
//		for(LopHP i:li)
//		{
//			System.out.println(i.toString());
//		}
		
//		boolean kt = x.delete("LHP12");
//		if(kt) System.out.println(1);
//		else System.out.println(0);
		
	}

	@Override
	public int soLuongPage(int sLPT, int sLPTMT) {
		int sLP = sLPT / sLPTMT;
		if((sLPT % sLPTMT) != 0) sLP++;
		return sLP;
	}

	@Override
	public List<LopHP> dSPTMotTrang(List<LopHP> dspt, int indexPage, int sLPTMT) {
		List<LopHP> li = new ArrayList<>();
		int slpt = dspt.size();
		int ghTren=(indexPage*sLPTMT < slpt) ? indexPage*sLPTMT : slpt;
		for(int i=(indexPage - 1)*sLPTMT; i< ghTren;i++)
		{
			li.add(dspt.get(i));
		}
		return li;
	}
	
}
