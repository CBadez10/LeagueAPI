package com.cambot.league.models;

import lombok.Data;

import java.util.List;

@Data
public class CurrentGameParticipant {
    private Long profileIconId;
    private Long championId;
    private String summonerName;
    private List<GameCustomizationObject> gameCustomizationObjects;
    private Boolean bot;
    private Perks perks;
    private Long spell2Id;
    private Long teamId;
    private Long spell1Id;
    private String summonerId;
}
