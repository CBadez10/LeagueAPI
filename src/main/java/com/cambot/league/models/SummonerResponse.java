package com.cambot.league.models;

import lombok.Data;

@Data
public class SummonerResponse {
    private Integer profileIconId;
    private String name;
    private String puuid;
    private Long summonerLevel;
    private Long revisionDate;
    private String id;
    private String accountId;

}
