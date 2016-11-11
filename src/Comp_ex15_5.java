/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16312
 */
import java.util.Random;

public class Comp_ex15_5 extends Janken_ex15_5{
    Random rand = new Random();
    private int comp;
    
    @Override
    void setHand(){
        comp = rand.nextInt(3);
    }
            
    
    int getHand(){

        return comp;
    }
}
