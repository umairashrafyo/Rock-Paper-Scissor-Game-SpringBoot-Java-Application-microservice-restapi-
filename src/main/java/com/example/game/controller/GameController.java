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
    System.out.println("Game Resources class created");
    @GetMapping
    public String getHomePage(){
        System.out.println("Get homepage function mapped with home page is rendering...");
        return pageString.indexPage;
    }

    @GetMapping(path="/{userID}")
    public String getResultPage(@PathVariable String userID){
        System.out.println("Getresult page function mapped with result template will render ...");
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
        GameService gameStart=new GameService();
        System.out.println("1)Player Move:  "+gameStart.playerMove(input)+"  ");
        System.out.println("1)Computer Move:  "+gameStart.getComputerResponse()+"  ");

        String output=gameStart.compareResponse(gameStart.playerMove(input),gameStart.getComputerResponse());
        if(output=="Lose"){
            output="Computer Won";
        }
        else if(output=="Won"){
            output="Player won against computer";
        }
        else{
            output="  TIE  ";
        }
        System.out.println("Result of the game :  "+output);
        return pageString.gameOverPart1+output+pageString.gameOverPart2;
    }


}


