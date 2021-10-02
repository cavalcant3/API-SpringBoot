package com.matheus.springcloudmysql.repository;

import com.matheus.springcloudmysql.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {


    Produtos findById(long id);


}
