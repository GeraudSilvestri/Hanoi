import hanoi.Hanoi;
import hanoi.gui.JHanoi;
import util.Stack;

public class Main {
    private static Stack stack1, stack2, stack3;

    public static void main(String[] args){

        if(args.length == 1){
            JHanoi jHanoi = new JHanoi();
        }
        else{
            int temp = Integer.parseInt(args[1]);
            Hanoi hanoi = new Hanoi(temp);
            hanoi.solve();
        }
    }




}
