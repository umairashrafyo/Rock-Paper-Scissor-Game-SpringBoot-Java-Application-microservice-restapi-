package com.example.game.service;

public class GameResources {
    public GameResources(){
        System.outprintln("GameResources class created to fetch html pages stored in the form of string object");
    }

    public String gameOverPart1="<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\"\n" +
            "          content=\"width=device-width,\n" +
            "\t\t\t\tinitial-scale=1.0\">\n" +
            "<style>\n" +
            "/* universal selector - Applies to whole document */\n" +
            "*{\n" +
            "    padding: 0;\n" +
            "    margin: 0;\n" +
            "    box-sizing: border-box;\n" +
            "    background: #082c6c;\n" +
            "    color: #fff;\n" +
            "}\n" +
            "/* To center everything in game */\n" +
            ".game{\n" +
            "    display: flex;\n" +
            "    flex-direction: column;\n" +
            "    height: 100vh;\n" +
            "    width: 100vw;\n" +
            "    justify-content: center;\n" +
            "    align-items: center;\n" +
            "}\n" +
            "\n" +
            "/* Title of the game */\n" +
            ".title{\n" +
            "    position: absolute;\n" +
            "    top: 0;\n" +
            "    font-size: 4rem;\n" +
            "    z-index: 2;\n" +
            "}\n" +
            "\n" +


            "\n" +
            "/* displaying three buttons in one line */\n" +
            ".options{\n" +
            "    display: flex;\n" +
            "    width: 50vw;\n" +
            "    justify-content: space-evenly;\n" +
            "    margin-top: 2rem;\n" +
            "}\n" +
            "\n" +
            "/* Styling on all three buttons */\n" +
            ".rock, .paper, .scissor{\n" +
            "    padding: 0.8rem;\n" +
            "    width: 100px;\n" +
            "    border-radius: 10px;\n" +
            "    background: green;\n" +
            "    outline: none;\n" +
            "    border-color: green;\n" +
            "    border: none;\n" +
            "    cursor: pointer;\n" +
            "}\n" +
            "\n" +
            ".move{\n" +
            "    font-size: 2rem;\n" +
            "    font-weight: bold;\n" +
            "}\n" +
            "\n" +
            "/* Reload button style */\n" +
            ".reload {\n" +
            "    display: none;\n" +
            "    margin-top: 2rem;\n" +
            "    padding: 1rem;\n" +
            "    background: green;\n" +
            "    outline: none;\n" +
            "    border: none;\n" +
            "    border-radius: 10px;\n" +
            "    cursor: pointer;\n" +
            "}\n" +
            "\n" +
            ".result{\n" +
            "    margin-top: 20px;\n" +
            "    font-size: 1.2rem;\n" +
            "}\n" +
            "\n" +
            "/* Responsive Design */\n" +
            "@media screen and (max-width: 612px)\n" +
            "{\n" +
            "    .title{\n" +
            "        text-align: center;\n" +
            "    }\n" +
            "    .score{\n" +
            "        position: absolute;\n" +
            "        top: 200px;\n" +
            "        width: 100vw;\n" +
            "    }\n" +
            "    .options{\n" +
            "        width: 100vw;\n" +
            "    }}\n"+"</style>" +
            "    <title>Rock Paper Scissor</title>\n" +
            "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js\"></script>\n" +
            "</head>\n" +
            "<body>\n" +
            "<section class=\"game\">\n" +
            "    <!--Title -->\n" +
            "    <div class=\"title\">Rock Paper Scissor</div>\n" +"<h1 style=\"font-size: 4rem;\">Game Over !!!</h1>"+
            "\n" +

            "    <!--Options available to player to play game -->\n" +
            "    <div class=\"options\">\n" +"        <div class=\"computerScore\">\n" +
            "           <h2>";
    public String gameOverPart2="</h2>\n"
            +
            "        </div>\n"+
            "        <button id=\"paper\" onclick=\"myFunction2()\" class=\"paper\">Play Again</button>\n"  +
            "    </div>\n" +
            "\n" +
            "    <!--Final result of game -->\n" +
            "    <div class=\"result\"></div>\n" +
            "\n" +
            "    <!--Reload the game -->\n" +
            "    <button class=\"reload\"></button>\n" +
            "\n" +
            "</section>\n" +
            "\n" +
            "<script>\n" +
            "function myFunction2() {\n" +
            "  location.replace(\"http://localhost:8080/\");\n" +
            "}\n" +"</script>"+

            "</body>\n" +
            "</html>\n";
    public String indexPage="<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\"\n" +
            "          content=\"width=device-width,\n" +
            "\t\t\t\tinitial-scale=1.0\">\n" +
            "<style>"+"\n" +
            "/* universal selector - Applies to whole document */\n" +
            "*{\n" +
            "    padding: 0;\n" +
            "    margin: 0;\n" +
            "    box-sizing: border-box;\n" +
            "    background: #082c6c;\n" +
            "    color: #fff;\n" +
            "}\n" +
            "/* To center everything in game */\n" +
            ".game{\n" +
            "    display: flex;\n" +
            "    flex-direction: column;\n" +
            "    height: 100vh;\n" +
            "    width: 100vw;\n" +
            "    justify-content: center;\n" +
            "    align-items: center;\n" +
            "}\n" +
            "\n" +
            "/* Title of the game */\n" +
            ".title{\n" +
            "    position: absolute;\n" +
            "    top: 0;\n" +
            "    font-size: 4rem;\n" +
            "    z-index: 2;\n" +
            "}\n" +


            "\n" +
            "/* displaying three buttons in one line */\n" +
            ".options{\n" +
            "    display: flex;\n" +
            "    width: 50vw;\n" +
            "    justify-content: space-evenly;\n" +
            "    margin-top: 2rem;\n" +
            "}\n" +
            "\n" +
            "/* Styling on all three buttons */\n" +
            ".rock, .paper, .scissor{\n" +
            "    padding: 0.8rem;\n" +
            "    width: 100px;\n" +
            "    border-radius: 10px;\n" +
            "    background: green;\n" +
            "    outline: none;\n" +
            "    border-color: green;\n" +
            "    border: none;\n" +
            "    cursor: pointer;\n" +
            "}\n" +
            "\n" +
            ".move{\n" +
            "    font-size: 2rem;\n" +
            "    font-weight: bold;\n" +
            "}\n" +
            "\n" +
            "/* Reload button style */\n" +
            ".reload {\n" +
            "    display: none;\n" +
            "    margin-top: 2rem;\n" +
            "    padding: 1rem;\n" +
            "    background: green;\n" +
            "    outline: none;\n" +
            "    border: none;\n" +
            "    border-radius: 10px;\n" +
            "    cursor: pointer;\n" +
            "}\n" +
            "\n" +
            ".result{\n" +
            "    margin-top: 20px;\n" +
            "    font-size: 1.2rem;\n" +
            "}\n" +
            "\n" +
            "/* Responsive Design */\n" +
            "@media screen and (max-width: 612px)\n" +
            "{\n" +
            "    .title{\n" +
            "        text-align: center;\n" +
            "    }\n" +
            "    .score{\n" +
            "        position: absolute;\n" +
            "        top: 200px;\n" +
            "        width: 100vw;\n" +
            "    }\n" +
            "    .options{\n" +
            "        width: 100vw;\n" +
            "    }}\n"+"</style>" +
            "    <title>Rock Paper Scissor</title>\n" +
            "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js\"></script>\n" +
            "</head>\n" +
            "<body>\n" +
            "<section class=\"game\">\n" +
            "    <!--Title -->\n" +
            "    <div class=\"title\">Rock Paper Scissor</div>\n" +
            "\n" +"<h1 style=\"font-size: 4rem;\" >Start The Game ...</h1>"+

            "    <div class=\"move\">Choose your move</div>\n" +
            "\n" +
            "\n" +
            "\n" +
            "    <!--Options available to player to play game -->\n" +
            "    <div class=\"options\">\n" +
            "        <button id=\"rock\" onclick=\"myFunction1()\" class=\"rock\">Rock</button>\n" +
            "        <button id=\"paper\" onclick=\"myFunction2()\" class=\"paper\">Paper</button>\n" +
            "        <button id=\"scissor\" onclick=\"myFunction3()\" class=\"scissor\">Scissors</button>\n" +
            "    </div>\n" +
            "\n" +
            "    <!--Final result of game -->\n" +
            "    <div class=\"result\"></div>\n" +
            "\n" +
            "    <!--Reload the game -->\n" +
            "    <button class=\"reload\"></button>\n" +
            "\n" +
            "</section>\n" +
            "\n" +
            "<script>\n" +
            "function myFunction1() {\n" +
            "  location.replace(\"http://localhost:8080/rock\")\n" +
            "}\n" +
            "</script>" +"<script>\n" +
            "function myFunction2() {\n" +
            "  location.replace(\"http://localhost:8080/paper\")\n" +
            "}\n" +
            "</script>"+"<script>\n" +
            "function myFunction3() {\n" +
            "  location.replace(\"http://localhost:8080/scissor\")\n" +
            "}\n" +
            "</script>"+
            "</body>\n" +
            "</html>\n";
}
