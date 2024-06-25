package DAO;

import java.util.List;

public interface Dao<T> {
	List<T> getALL();	
	void save(T t);
	void delete(String t);
	void update(T t);
	int soLuongPage(int sLPT, int sLPTMT);
	List<T> dSPTMotTrang(List<T> dspt, int indexPage, int sLPTMT);
}
