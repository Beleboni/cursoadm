package br.com.adminfo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adminfo.model.Cliente;
import br.com.adminfo.repository.helper.cliente.ClientesQueries;

public interface Clientes extends JpaRepository<Cliente, Long>, ClientesQueries{

}