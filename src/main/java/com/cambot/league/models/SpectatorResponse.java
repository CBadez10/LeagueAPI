package com.cambot.league.models;

import lombok.Data;

import java.util.List;

@Data
public class SpectatorResponse {
    private Long gameId;
    private Long gameStartTime;
    private String platformId;
    private String gameMode;
    private Long mapId;
    private String gameType;
    private List<BannedChampion> bannedChampions;
    private Observer observers;
    private List<CurrentGameParticipant> participants;
    private Long gameLength;
    private Long gameQueueConfigId;

}
