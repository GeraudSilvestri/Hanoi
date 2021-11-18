package Hanoi;

import Stack.Stack;

public class HanoiDisplayer {

    public void display(Hanoi h){
        System.out.println("\nTurn " + h.getCounter());
        for(Stack s : h.getStakes()){
            System.out.println(s);
        }
    }
}
