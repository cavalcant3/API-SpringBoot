package com.matheus.springcloudmysql.resources;

import com.matheus.springcloudmysql.models.Produtos;
import com.matheus.springcloudmysql.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api")
public class ProdutoResource {

        @Autowired
    ProdutoRepository produtoRepository;
    private Object Produtos;

    @GetMapping("/produtos")
            public List<Produtos> listaProduto(){
            return produtoRepository.findAll();
        }
         @GetMapping("/produtos/{id}")
            public List<Produtos> listaProdutoUnico(@PathVariable(value="id")long id){
        return (List<Produtos>) produtoRepository.findById(id);
    }
        @PostMapping("/produto")
        public Produtos salvaProduto(@RequestBody Produtos produtos) {

            return produtoRepository.save(produtos);
        }
        @DeleteMapping("/produto")
        public void deletaProduto(@RequestBody Produtos produtos) {

          produtoRepository.delete(produtos);
        }
        @PutMapping("/produto")
        public Produtos atualizaProduto(@RequestBody Produtos produtos) {

         return  produtoRepository.save(produtos);
        }
}
