package com.example.game.controller;



import java.lang.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.game.service.GameService;
import com.example.game.service.GameResources;

@RestController
@RequestMapping("/")
@Controller
public class GameController {
    GameResources pageString=new GameResources();
    @GetMapping
    public String getUsers(){
        return pageString.indexPage;
    }

    @GetMapping(path="/{userID}")
    public String getUsers(@PathVariable String userID){
        Integer input=1;
        if(userID=="rock"){
            input=0;
        }
        else if(userID=="paper"){
            input=1;
        }
        else if(userID=="scissor"){
            input=2;
        }


        String display="";
        System.out.println("Welcome to Rock Paper Scissor Game...");
        System.out.println("--------------------------------------");
        System.out.println("Rules are ...........");
        System.out.println("1)Rock Beats Scissor");
        System.out.println("2)Scissor Beats Paper");
        System.out.println("3)Paper Beats Rock");
        System.out.println("*Put 0 if you want to choose Rock");
        System.out.println("*Put 1 if you want to choose Paper");
        System.out.println("*Put 2 if you want to choose Scissor");
        GameService gameStart=new GameService();
        System.out.println("1)Player Move:  "+gameStart.playerMove(input)+"  ");
        System.out.println("-------------AND-------------------");
        System.out.println("--------------THE------------------");
        System.out.println("----------------Winner---------------");
        System.out.println("--------------ISS------------------");
        String output=gameStart.compareResponse(gameStart.playerMove(input),gameStart.getComputerResponse());
        if(output=="Lose"){
            output="Computer Won";
        }
        else if(output=="Won"){
            output="Player won against computer";
        }
        else{
            output="  Tie  ";
        }
        System.out.println("------------"+output+"--------");
        return pageString.gameOverPart1+output+pageString.gameOverPart2;
    }


}


