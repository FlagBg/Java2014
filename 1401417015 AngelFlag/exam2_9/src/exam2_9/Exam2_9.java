/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_9;
import java.util.Scanner;
/**
 *
 * @author THE NET
 */
public class Exam2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Изберете число от едно до дванадесет:");
            //System.out.println ("1 ");//= Януари
            //System.out.println ("2"); //= Февруари
            //System.out.println ("3"); //= Март
            //System.out.println ("4"); //= Април
            //System.out.println ("5"); //= Май
            //System.out.println ("6"); //= Юни
            //System.out.println ("7"); //= Юли
            //System.out.println ("8"); //= Август
            //System.out.println ("9");//= Септември
            //System.out.println ("10");// = Октомври
            //System.out.println ("11");//; = Ноември
            //System.out.println ("12"); //= Декември
            
        
            Scanner Keyboard = new Scanner(System.in);
            int избор = Keyboard.nextInt();
            String Текст;
            
        do{
            System.out.println("Изберете число от едно до дванадесет");
            избор= Keyboard.nextInt();
        switch(избор){
            case 1: Текст = "Вие избрахте 1 - Януари"; break;
            case 2: Текст = "Вие избрахте 2 - Февруари";break;
            case 3: Текст = "Вие избрахте 3 - Март"; break;
            case 4: Текст = "Вие избрахте 4 - Април";break;
            case 5: Текст = "Вие избрахте 5 - МАй";break;
            case 6: Текст = "Вие избрахте 6 - Юни";break;
            case 7: Текст = "Вие избрахте 7 - Юли";break;
            case 8: Текст = "Вие избрахте 8 - Август";break;
            case 9: Текст = "Вие избрахте 9 - Септември";break;
            case 10: Текст = "Вие избрахте 10 - Октомври";break;
            case 11: Текст = "Вие избрахте 11 - Ноември";break;
            case 12: Текст = "Вие избрахте 12 - Декември";break;
            default: Текст = "Въведете число от едно до дванадесет!";
        }
    System.out.println(Текст);
        }while(избор!=13);
    Keyboard.close();
    }
}
