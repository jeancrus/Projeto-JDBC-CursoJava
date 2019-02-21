package application;

import java.util.List;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vendeDao = FabricaDao.criarVendedorDao();
		
		
		System.out.println("==== TESTE 1: seller findById ==== ");
		Vendedor vend = vendeDao.findById(3);
		System.out.println(vend);
		
		System.out.println("\n==== TESTE 2: seller findByDepartamento ==== ");
		Departamento departamento = new Departamento(2, "a");
		List<Vendedor> list = vendeDao.findByDepartamento(departamento);
		for (Vendedor obj : list) {
			System.out.println(obj);
		}

	}

}
