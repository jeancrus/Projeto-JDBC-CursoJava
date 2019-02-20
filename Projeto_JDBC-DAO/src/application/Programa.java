package application;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vendeDao = FabricaDao.criarVendedorDao();
		
		
		System.out.println("==== TESTE 1: seller findById ==== ");
		Vendedor vend = vendeDao.findById(3);
	
		System.out.println(vend);

	}

}
