package io.github.ceciliopf.produtosapi.repository;

import io.github.ceciliopf.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, String> {

}
