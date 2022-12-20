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
        System.out.println("GameService Object created with initialization of gameMap object \n and mapping Rock ,Paper ,Scissor  with 0,1,2 respectively");

        gameMap.put(1,"Paper");
        gameMap.put(2,"Scissor");
        Random random = new Random();
        System.out.println("Computer move is determined by using random.nextInt function between 0,1,2")
        this.computerResponse=gameMap.get(random.nextInt(2 - 0 + 1) + 0);
        System.out.println(" computer move :   "+computerResponse);
        System.out.println(" result Map object is initialized to compare the moves of player and computer mapping 0 with Losing of player, 1 with Tie and 2 with Won by player   ");
        resultMap.put(0,"Lose");
        resultMap.put(1,"Draw");
        resultMap.put(2,"Won");
    }
    public String playerMove(int move){
        return this.gameMap.get(move);
    }
    public String compareResponse(String playerOneResponse,String computerResponse){
        String ans="";
        System.out.println("comparison function started comparing"+"playerOneResponse: "+playerOneResponse+" and computerResponse: +computerResponse)
        if(computerResponse==playerOneResponse){
            ans =resultMap.get(1);
        }
        else if(computerResponse=="Rock"&&playerOneResponse=="Paper"||computerResponse=="Scissor"&&playerOneResponse=="Rock"||computerResponse=="Paper"&&playerOneResponse=="Scissor"){
            ans= resultMap.get(2);
        }
        else if(computerResponse=="Scissor"&&playerOneResponse=="Paper"||computerResponse=="Paper"&&playerOneResponse=="Rock"||computerResponse=="Rock"&&playerOneResponse=="Scissor"){
            ans =resultMap.get(0);
        }
        System.out.println(" after comparing the result is: "+ans);
        return ans;

    }
}
