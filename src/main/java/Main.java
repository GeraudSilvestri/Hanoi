import Hanoi.Hanoi;
import util.Stack;

public class Main {
    private static Stack stack1, stack2, stack3;

    public static void main(String[] args){

        if(args.length != 1){
            System.out.println("Un seul argument requis.");
        }
        else{
            Hanoi hanoi = new Hanoi(Integer.parseInt(args[0]));
            hanoi.solve();
        }
    }
}
