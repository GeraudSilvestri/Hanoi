import Hanoi.Hanoi;
import Stack.Stack;

public class Main {
    private static Stack stack1, stack2, stack3;

    public static void main(String[] args){
        Hanoi hanoi = new Hanoi(4);
        hanoi.solve();
    }




}
