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
import java.util.Random;

public class JankenTester_ex15_5 {
    
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();
        
        String[] hands  = {"グー","チョキ","パー"};
        int retry;
        
        do{
            Player_ex15_5 user = new Player_ex15_5(); //プレーヤー
            Comp_ex15_5 comp1 = new Comp_ex15_5();    //コンピュータ1
            Comp_ex15_5 comp2 = new Comp_ex15_5();    //コンピュータ2
            
            comp1.setHand();        //comp1の手を設定
            comp2.setHand();        //comp2の手を設定
            user.setHand();         //プレーヤーの手を設定
            

            System.out.println("comp1は"+ hands[comp1.getHand()] + "で、comp2は"+hands[comp2.getHand()] +"で、あなたは" + hands[user.getHand()] + "です。");
            

            int judge1 = (user.getHand() + comp1.getHand() + comp2.getHand());  //ジャッジ1
            int judge2 = (judge1 +3)%3;                                         //ジャッジ2
            
            switch(judge2){
                case 0:System.out.println("引き分けです。");    break;              //全員同じ手　もしくは　グーチョキパーだった時
                    
                case 1:switch(user.getHand()){                                  //組み合わせ1
                            case 0:                                             //プレーヤーがグーだった時
                                if(judge1 == 1){                                
                                    System.out.println("あなたの勝ちです。");
                                    break;
                                }
                                else if(judge1 == 4){                           
                                    System.out.println("あなたの負けです。");
                                    break;
                                }
                            
                            case 1:                                             //プレーヤーがパーだった時
                                if(judge1 == 1){                                
                                    System.out.println("あなたの負けです。");
                                    break;
                                }
                                else if(judge1 == 4){                           
                                    System.out.println("あなたの勝ちです。");
                                    break;
                                }
                            
                            case 2:                                             //プレーヤーがパーだった時
                                if(comp1.getHand() == 1 || comp2.getHand() == 1){
                                    System.out.println("あなたの負けです。");
                                    break;
                                }
                                else{
                                    System.out.println("あなたの勝ちです。");
                                    break;
                                }
                       }    break;
                    
                case 2:switch(user.getHand()){                                  //組み合わせ２
                            case 0:                                             //プレーヤーがグーだった時
                                if(comp1.getHand() == 2 || comp2.getHand() == 2){
                                    System.out.println("あなたの負けです。");
                                    break;
                                }
                                else{
                                    System.out.println("あなたの勝ちです。");
                                    break;
                                }
                            
                            case 1:                                             //プレーヤーがパーだった時
                                if(judge1 == 2){
                                    System.out.println("あなたの負けです。");
                                    break;
                                }
                                else if(judge1 == 5){
                                    System.out.println("あなたの勝ちです。");
                                    break;
                                }
                            
                            case 2:                                             //プレーヤーがパーだった時
                                if(judge1 == 2){
                                    System.out.println("あなたの勝ちです");
                                    break;
                                }
                                else if(judge1 == 5){
                                    System.out.println("あなたの負けです。");
                                    break;
                                }
                
                        }   break;
            }

            do{
                System.out.print("もう一度やりますか？ (0)いいえ (1)はい : ");
                retry = stdIn.nextInt();
            }while(retry != 0 && retry != 1);
            
        }while(retry == 1);
        
    }
    
}

/*組み合わせについて

            組み合わせ１
                comp1   comp2   user
            手  1       1       2

                0       0       1
            
                2       2       0
            
            のそれぞれの並び替え
            
            組み合わ 2
                comp1   comp2   user
            手  0       0       2

                2       2       1
            
                1       1       0
            
            のそれぞれの並び替え
            
*/
