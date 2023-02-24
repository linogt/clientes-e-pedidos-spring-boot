package io.github.linogt.vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.linogt.vendas.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto,Integer>{

}
