package DAO;

import java.util.ArrayList;
import java.text.*;
import java.util.List;
import java.sql.*;

import Model.LopHPSV;

public class LopHP_SVDao extends Initialization implements Dao<LopHPSV>{

	public LopHP_SVDao() {
		super();
	}

	public List<LopHPSV> getALL(String malop) {
		List<LopHPSV> li = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("select malop, sinhvien.masv, hodem, ten,tx1, tx2, tx3, diem, trangthaihoc ");
		sql.append("from lophp_sv join sinhvien on lophp_sv.masv = sinhvien.masv ");
		sql.append("where malop = ?");
		
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setString(1, malop);
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				LopHPSV x = new LopHPSV
				(
					malop,
					rs.getInt("masv"),
					rs.getFloat("tx1"),
					rs.getFloat("tx2"),
					rs.getFloat("tx3"),
					rs.getFloat("diem"),
					rs.getString("hodem"),
					rs.getString("ten"),
					rs.getString("trangthaihoc")
				);
				li.add(x);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	
	public List<LopHPSV> getALLByTTH(String malop) {
		List<LopHPSV> li = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("select malop, sinhvien.masv, hodem, ten,tx1, tx2, tx3, diem, trangthaihoc ");
		sql.append("from lophp_sv join sinhvien on lophp_sv.masv = sinhvien.masv ");
		sql.append("where malop = ? and ( trangthaihoc like 'Đã học' or trangthaihoc like 'Đang học') ");
		
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setString(1, malop);
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				LopHPSV x = new LopHPSV
				(
					malop,
					rs.getInt("masv"),
					rs.getFloat("tx1"),
					rs.getFloat("tx2"),
					rs.getFloat("tx3"),
					rs.getFloat("diem"),
					rs.getString("hodem"),
					rs.getString("ten"),
					rs.getString("trangthaihoc")
				);
				li.add(x);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	
	
	
	public List<Double> getDSPTD(String malop)
	{
		List<Double> li = new ArrayList<>();
		int tongSL = getALL(malop).size();
		StringBuilder sql,sql1,sql2,sql3;
		sql = new StringBuilder();
		sql1 = new StringBuilder();
		sql2 = new StringBuilder();
		sql3 = new StringBuilder();
		sql.append("select * from lophp_sv where malop = ? and diem < 4");
		sql1.append("select * from lophp_sv where malop = ? and 4<= diem and diem <= 6.9");
		sql2.append("select * from lophp_sv where malop = ? and 7<= diem and diem <= 8.4");
		sql3.append("select * from lophp_sv where malop = ? and 8.5<= diem");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setString(1, malop);
			ResultSet rs = pre.executeQuery();
			int sLDiem = 0;
			while(rs.next()) sLDiem ++;
			double phanTram = (double)sLDiem * 100 / tongSL;
			DecimalFormat decimalFormat = new DecimalFormat("#.##");
	        String soSauKhiFormat = decimalFormat.format(phanTram);
	        soSauKhiFormat = soSauKhiFormat.replace(",", ".");
			li.add(Double.parseDouble(soSauKhiFormat));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql1.toString());
			pre.setString(1, malop);
			ResultSet rs = pre.executeQuery();
			int sLDiem = 0;
			while(rs.next()) sLDiem ++;
			double phanTram = (double)sLDiem * 100 / tongSL;
			DecimalFormat decimalFormat = new DecimalFormat("#.##");
	        String soSauKhiFormat = decimalFormat.format(phanTram);
	        soSauKhiFormat = soSauKhiFormat.replace(",", ".");
			li.add(Double.parseDouble(soSauKhiFormat));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql2.toString());
			pre.setString(1, malop);
			ResultSet rs = pre.executeQuery();
			int sLDiem = 0;
			while(rs.next()) sLDiem ++;
			double phanTram = (double)sLDiem * 100 / tongSL;
			DecimalFormat decimalFormat = new DecimalFormat("#.##");
	        String soSauKhiFormat = decimalFormat.format(phanTram);
	        soSauKhiFormat = soSauKhiFormat.replace(",", ".");
			li.add(Double.parseDouble(soSauKhiFormat));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql3.toString());
			pre.setString(1, malop);
			ResultSet rs = pre.executeQuery();
			int sLDiem = 0;
			while(rs.next()) sLDiem ++;
			double phanTram = (double)sLDiem * 100 / tongSL;
			DecimalFormat decimalFormat = new DecimalFormat("#.##");
	        String soSauKhiFormat = decimalFormat.format(phanTram);
	        soSauKhiFormat = soSauKhiFormat.replace(",", ".");
			li.add(Double.parseDouble(soSauKhiFormat));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	
	public LopHPSV getByKhoaChinh(String malop, int masv)
	{
		StringBuilder sql = new StringBuilder();
		sql.append("select malop, sinhvien.masv, hodem, ten,tx1, tx2, tx3, diem, trangthaihoc ");
		sql.append("from lophp_sv join sinhvien on lophp_sv.masv = sinhvien.masv ");
		sql.append("where malop	= ? and sinhvien.masv = ? ");
		try {
			PreparedStatement pre  = this.getCon().prepareStatement(sql.toString());
			pre.setString(1, malop);
			pre.setInt(2, masv);
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				return new LopHPSV(
							malop,
							masv,
							rs.getFloat("tx1"),
							rs.getFloat("tx2"),
							rs.getFloat("tx3"),
							rs.getFloat("diem"),
							rs.getString("hodem"),
							rs.getString("ten"),
							rs.getString("trangthaihoc")
						);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@Override
	public List<LopHPSV> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(LopHPSV t) {
		StringBuilder sql = new StringBuilder();
		sql.append("Insert into lophp_sv ");
		sql.append("values (?,?,?,?)");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setFloat(1, t.getDiem());
			pre.setString(2, t.getMaLop());
			pre.setInt(3, t.getMaSV());
			pre.setString(4, t.getTrangThaiHoc());
			if(pre.executeUpdate() == 0) this.getCon().rollback();
			else this.getCon().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(LopHPSV t) {
		StringBuilder sql = new StringBuilder();
		sql.append("update lophp_sv ");
		sql.append("set diem = ?, trangthaihoc= ?, ");
		sql.append("tx1 = ?, tx2 = ?, tx3 = ? ");
		sql.append("where malop = ? and masv = ? ");
		try {
			PreparedStatement pre  = this.getCon().prepareStatement(sql.toString());
			pre.setFloat(1, t.getDiem());
			pre.setString(2, t.getTrangThaiHoc());
			pre.setFloat(3, t.getTx1());
			pre.setFloat(4, t.getTx2());
			pre.setFloat(5, t.getTx3());
			pre.setString(6, t.getMaLop());
			pre.setInt(7, t.getMaSV());
			if(pre.executeUpdate() == 0) this.getCon().rollback();
			else this.getCon().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int soLuongPage(int sLPT, int sLPTMT) {
		int sLP = sLPT / sLPTMT;
		if((sLPT % sLPTMT) != 0) sLP++;
		return sLP;
	}

	@Override
	public List<LopHPSV> dSPTMotTrang(List<LopHPSV> dspt, int indexPage, int sLPTMT) {
		List<LopHPSV> li = new ArrayList<>();
		int slpt = dspt.size();
		int ghTren=(indexPage*sLPTMT < slpt) ? indexPage*sLPTMT : slpt;
		for(int i=(indexPage - 1)*sLPTMT; i< ghTren;i++)
		{
			li.add(dspt.get(i));
		}
		return li;
	}

}
