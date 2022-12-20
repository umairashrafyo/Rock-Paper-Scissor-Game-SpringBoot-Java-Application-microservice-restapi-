package com.example.game.service;


import java.util.HashMap;
import java.util.Random;

public class GameService {
    HashMap<Integer,String> gameMap=new HashMap<Integer,String>();
    HashMap<Integer,String> resultMap=new HashMap<Integer,String>();

    String playerOneResponse="";
    String computerResponse="";

    public String getComputerResponse() {
        return computerResponse;
    }

    public GameService(){

        gameMap.put(1,"Paper");
        gameMap.put(2,"Scissor");
        Random random = new Random();
        this.computerResponse=gameMap.get(random.nextInt(2 - 0 + 1) + 0);
        System.out.println("  computer:   "+computerResponse);
        resultMap.put(0,"Lose");
        resultMap.put(1,"Draw");
        resultMap.put(2,"Won");
    }
    public String playerMove(int move){
        return this.gameMap.get(move);
    }
    public String compareResponse(String playerOneResponse,String computerResponse){
        String ans="";
        if(computerResponse==playerOneResponse){
            ans =resultMap.get(1);
        }
        else if(computerResponse=="Rock"&&playerOneResponse=="Paper"||computerResponse=="Scissor"&&playerOneResponse=="Rock"||computerResponse=="Paper"&&playerOneResponse=="Scissor"){
            ans= resultMap.get(2);
        }
        else if(computerResponse=="Scissor"&&playerOneResponse=="Paper"||computerResponse=="Paper"&&playerOneResponse=="Rock"||computerResponse=="Rock"&&playerOneResponse=="Scissor"){
            ans =resultMap.get(0);
        }
        return ans;

    }
}
