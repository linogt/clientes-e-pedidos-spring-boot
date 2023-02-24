package io.github.linogt.vendas.service;

import java.util.Optional;

import io.github.linogt.vendas.domain.entity.Pedido;
import io.github.linogt.vendas.enums.StatusPedido;
import io.github.linogt.vendas.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}