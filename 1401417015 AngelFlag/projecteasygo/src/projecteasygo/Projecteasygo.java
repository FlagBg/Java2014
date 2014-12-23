/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteasygo;

/**
 *
 * @author THE NET
 */
public class Projecteasygo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String imena[] = new String[50];
        String[] imena = {"Пловдив", "Бургас", "Боровец", "Варна","София",  "Велико Търново", "Стара Загора", "Ивайловград", "Крумовград","Долен Чифлик", "Хасково", "Долно Калугерово", "Разград", "Пещера","Плевен", "Русе","Монтана", "Силистра", "Сливен", "Смолян", "Търговище", "Шумен","Ямбол", "Благоевград", "Видин", "Враца", "Габрово", "Добрич", "Кърджали","Кюстендил", "Ловеч",  "Пазарджик", "Перник", "Албена", "Златни пясъци", "Константин и Елена", "Лозенец", "Царево", "Слънчев бряг","Пампорово", "Каварна", "Несебър", "Ахтопол", "Черноморец", "Китен", "Карлово","Асеновград", "Сопот", "Калофер", "Харманли", "Градешница" };
        
        
        //String[] array = new String[50];
        
        низовеЗапочващиС(imena, "и");
   
        System.out.println(imena);
        }
    public static void низовеЗапочващиС(String m[], String search){
               System.out.println("Низове започващи с " + search + ":");
               
        for(int i=0; i<m.length; i++)
	           if(m[i].startsWith(search))
	               System.out.println(m[i]);

    }
    

}
