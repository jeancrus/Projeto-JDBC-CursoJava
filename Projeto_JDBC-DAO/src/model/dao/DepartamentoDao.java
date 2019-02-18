package model.dao;

import java.util.List;

import model.entities.Departamento;

public interface DepartamentoDao {
	void inserir(Departamento obj);
	void atualizar(Departamento obj);
	void deleteById(Integer id);
	Departamento findById(Integer id);
	List<Departamento> findAll();
}
