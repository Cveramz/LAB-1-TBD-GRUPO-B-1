package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Ranking;
import java.util.List;
public interface RankingRepository {

    /* metodos abstractos declarados */
    public Ranking createRanking(Ranking ranking);
    public Ranking getRankingById(Long id);
    public List<Ranking> findAllRankings();
    public Ranking updateRanking(Ranking rankingUpdate);
    public void deleteRankingById(@PathVariable Long id);

}
