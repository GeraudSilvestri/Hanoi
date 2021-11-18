package Hanoi;

import util.Stack;

public class HanoiDisplayer {
    int mode; // 0 = console, 1 = GUI

    public HanoiDisplayer(int mode){
        this.mode = mode;
    }

    public void display(Hanoi h){
        System.out.println("\nTurn " + h.getCounter());
        for(Stack s : h.getStakes()){
            System.out.println(s);
        }
    }
}
