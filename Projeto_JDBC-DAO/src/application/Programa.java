package application;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vendeDao = FabricaDao.criarVendedorDao();
		
		Vendedor vend = vendeDao.findById(4);
	
		System.out.println(vend);

	}

}
