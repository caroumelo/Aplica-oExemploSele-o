package com.aplicacaooselecao.esig.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aplicacaooselecao.esig.model.ListagemTarefas;


@Repository
public interface TarefaRepository extends JpaRepository<ListagemTarefas, String>{
}
