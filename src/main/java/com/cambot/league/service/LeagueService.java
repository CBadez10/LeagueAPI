package com.cambot.league.service;

import com.cambot.league.models.GameCustomizationObject;
import com.cambot.league.models.SummonerResponse;
import com.cambot.league.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LeagueService {

    @Autowired
    LeagueRepository leagueRepository;

    public ResponseEntity<GameCustomizationObject> getSummoner(String summoner) {
       SummonerResponse summonerResponse = leagueRepository.getSummoner(summoner);

       return leagueRepository.getSummonerInfo(summonerResponse.getId());
    }
}
