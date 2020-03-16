package com.cambot.league.repository;

import com.cambot.league.models.SummonerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;

@Repository
public class LeagueRepository {

    @Value("${riot.apiKey}")
    private String apiKey;

    @Autowired RestTemplate restTemplate;

    public SummonerResponse getSummoner(String summoner) {

        // Build custom URL for passed in summoner
        UriComponents uri = UriComponentsBuilder.fromHttpUrl("https://na1.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summoner}")
                .buildAndExpand(summoner);
        String urlString = uri.toString();

        // Call riot API
        return  restTemplate.getForEntity(urlString, SummonerResponse.class).getBody();
    }

}