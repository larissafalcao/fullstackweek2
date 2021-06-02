package br.com.larissafalcao.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.larissafalcao.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}
