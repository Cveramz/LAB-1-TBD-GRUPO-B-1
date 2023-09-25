package com.chileayuda.voluntariadobackend.ranking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long> {

    /* metodos abstractos declarados */
    public Ranking getById(Long id);
}
