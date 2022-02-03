package com.aplicacaooselecao.esig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aplicacaooselecao.esig.model.ListagemTarefas;
import com.aplicacaooselecao.esig.repository.TarefaRepository;

@RestController
@RequestMapping("/Tarefa")
	public class TarefaController {
	
		@Autowired
		private TarefaRepository tarefarepository;
		
		@GetMapping
		public List <ListagemTarefas> listar(){
			return tarefarepository.findAll();
			
}

}