/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16312
 */
import java.util.Scanner;

public class Player_ex15_5 extends Janken_ex15_5{
    private int user;
    Scanner stdIn = new Scanner(System.in);
    
    @Override
    void setHand(){
        do{
            System.out.print("じゃんけんポン");
            System.out.print("　グー[0] チョキ[1] パー[2] : ");
            user = stdIn.nextInt();
        }while (user <0 || user >2);
    }
    
    @Override
    int getHand(){
        return user;
    }
}
