/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_7menu;
import java.util.Scanner;
/**
 *
 * @author THE NET
 */
public class Exam2_7menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Меню"); // Извеждане на менюто в конзолата
        System.out.println(" 1. Теглене на сума");
        System.out.println(" 2. Промяна на PIN");
        System.out.println(" 3. Проверка на наличност");
        System.out.println(" 4. Настройки");
        System.out.println(" 5. Изход");
        System.out.print("Изберете възможност (1-5): ");

            Scanner Keyboard = new Scanner(System.in);
            int избор = Keyboard.nextInt();

                String текст;
    switch(избор){ // В зависимост от стойността на „избор”...
            case 1: текст = "Вие избрахте 1: Теглене на сума"; break;
            case 2: текст = "Вие избрахте 2: Промяна на PIN"; break;
            case 3: текст = "Вие избрахте 3: Проверка на наличност"; break;
            case 4: текст = "Вие избрахте 4: Настройки"; break;
            case 5: текст = "Вие избрахте 5: Изход"; break;
            default: текст = "Въвели сте грешен избор!";
}
        System.out.println(текст );
        Keyboard.close();
        
    }
    
}
