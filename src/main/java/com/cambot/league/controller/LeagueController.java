package com.cambot.league.controller;

import com.cambot.league.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/league")
public class LeagueController {

    @Autowired
    LeagueService leagueService;

    @GetMapping(value = "/summoner")
    @ResponseBody ResponseEntity getSummonerInfo(@RequestParam("name") String summoner) {
        return leagueService.getSummoner(summoner);
    }
}
