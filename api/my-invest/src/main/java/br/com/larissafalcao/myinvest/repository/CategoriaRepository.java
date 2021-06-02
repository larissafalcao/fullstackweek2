package br.com.larissafalcao.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.larissafalcao.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
