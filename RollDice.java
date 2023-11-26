import java.util.Random;
import java.util.Random.*;
class  Dice
{
    void DiceRoler()
    {int Dice1,Dice2;
        System.out.println("ROLLER DICE GAME");
        System.out.println("**********");
        Dice1=Roller();
        Dice2=Roller();
        System.out.println("Dice 1 "+Dice1);
        System.out.println("Dice 2 "+Dice2);

    }
    int Roller()
    {
        Random ran2=new Random();
        return ran2.nextInt(6)+1;
    }
}
public class RollDice {
    public static  void main(String []args)
    {
Dice obj=new Dice();
obj.DiceRoler();
int r=obj.Roller();
    }
}