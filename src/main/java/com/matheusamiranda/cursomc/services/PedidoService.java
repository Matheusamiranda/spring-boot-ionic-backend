package com.matheusamiranda.cursomc.services;

import com.matheusamiranda.cursomc.domain.Pedido;
import com.matheusamiranda.cursomc.repositories.PedidoRepository;
import com.matheusamiranda.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException( "Objeto não encontrado! Id: " + id + ", Tipo: "
                + Pedido.class.getName()));
    }
}
