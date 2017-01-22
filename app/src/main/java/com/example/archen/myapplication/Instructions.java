package com.example.archen.myapplication;

public class Instructions {
    private String [] instructions = {
      " urFood will turn all your cravings into reality. This application will allow you to tell the world" +
      " \" I want my favorite food placce right next to me house! \" You can join the crowd and add in your preferences. OR, you can" +
      " establish a business to bring divine food happiness to the people. It's a win-win situation!"
    };

    public String getInstruction(int counter){
        if(counter < instructions.length){
            return instructions[counter];
        }else {
            return null;
        }
    }

    public int getArrayLength(){
        return instructions.length;
    }
}
