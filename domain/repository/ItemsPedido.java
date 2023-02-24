package io.github.linogt.vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.linogt.vendas.domain.entity.ItemPedido;

public interface ItemsPedido extends JpaRepository<ItemPedido,Integer> {

}
