package spring.prac.dayprac.BussinessLayer;

import java.util.List;

import spring.prac.dayprac.dao.PracDao;
import spring.prac.dayprac.dto.Prac;

public class PracBussinessLayerImpl implements PracBussinessLayer {
	private PracDao pracDao;
	public PracDao getPracDao() {
		return pracDao;
	}
	public void setPracDao(PracDao pracDao) {
		this.pracDao = pracDao;
	}
	
	public List<Prac> printDetails() {
		// TODO Auto-generated method stub
		return pracDao.getDetails();
	}
	

}
