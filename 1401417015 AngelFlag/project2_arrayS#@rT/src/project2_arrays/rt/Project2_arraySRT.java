package project2_arrays.rt;

import java.util.Scanner;

//Задача 4. Елементите на масив са имена на населени места,
//започващи с главна буква. Да се съставят ППГ за:
//а) въвеждане на елементите на масива (не повече от 50).
//ж) извеждане на екрана на всички населени места, в чиито имена буквата
//"е" или "Е" се среща 2, 3 или 4 пъти, а буквата "р" не се среща нито веднъж;

public class Project2_arraySRT {

    
    static int br = 0;
    static String array [] = new String[50];
    static Scanner keyboard = new Scanner(System.in, "windows-1251");
      
    public static void main(String[] args) {

        menu();
    }
    
    public static void menu()  {
        
        System.out.println("Меню"); // Извеждане на менюто в конзолата
        System.out.println(" 1. Въвеждане на градове от конзола");
        System.out.println(" 2. Въвеждане на градове от задание");
        System.out.println(" 3. Принти масива");
        System.out.println(" 4. Особената част!");
        System.out.println(" 5. Изход");
        System.out.print("Изберете възможност (1-5): ");
        
        //int myChoice = keyboard.nextInt();

        //String Text;
        switch(keyboard.nextLine()){
            
            case "1": 
                System.out.println("Вие избрахте 1: Въвеждане на градове от конзола");
             input();
             menu();

            break;

            case "2": 
                System.out.println("Вие избрахте 2: Въвеждане на градове от задание");
                autoArray();
                menu();
            break;

            case "3":
                System.out.println("Вие избрахте 3 да принтирате масива");
                printAll();
                menu();
            break;

            case "4": 
                System.out.println("Вие избрахте да принтирате Особена част");
                printSpecial();
                menu();
                
            break;
                
            case "5": 
                System.out.println("Изход - Довиждане");
                //menu();
            break;
                
            default: 
                System.out.println("Въвели сте грешен избор!");
                menu();
            break;

        }
        
        //Keyboard.close();
        
    }
    //int[] array = new int[50];//tova mi e za dvata masiva!
    
    
        public static void input(){
            
            System.out.print("Напишете град: ");
            
            for (int i = br ; i < array.length; i++) {
                array[i] = keyboard.nextLine();
                break;
            }
            br++;
        }
    
        public static String autoTowns(){
            
            String[] towns = {"Пловдив", "Бургас", "Боровец", "Варна","София", "Велико Търново", "Стара Загора", "Ивайловград", "Крумовград","Долен Чифлик", "Хасково", "Долно Калугерово", "Разград", "Пещера","Плевен", "Русе","Монтана", "Силистра", "Сливен", "Смолян", "Търговище", "Шумен","Ямбол", "Благоевград", "Видин", "Враца", "Габрово", "Добрич", "Кърджали","Кюстендил", "Ловеч",  "Пазарджик", "Перник", "Албена", "Златни пясъци", "Константин и Елена", "Лозенец", "Царево", "Слънчев бряг","Пампорово", "Каварна", "Несебър", "Ахтопол", "Черноморец", "Китен", "Карлово","Асеновград", "Сопот", "Калофер", "Харманли", "Градешница", "Пловидв" };
            br++;
            return towns[br];
            
        }    
            
        public static void autoArray(){
            
            System.out.println("Избрани градове!");
            
            for (int i = 0; i < array.length; i++){
                 
                 array[i] = autoTowns();
                 
            }
            br = array.length;
                 
            
        }
            
        public static void printAll(){
            
            System.out.println("Избраните градове сa: " + array[0]);
            
            for(int i = 0; i < array.length; i++) {
                
                if (array[i] == null) {
                break;
                }
                
            System.out.println(array[i]);
           
            }
            
//            for(String elements : array) {
//                System.out.println(elements);
//            }
            
        }
//        
	public static void printSpecial(){
		System.out.println("->Градовете,в чиито имена буквата \"е\" или \"Е\" се " +
                        "среща 2, 3 или 4 пъти, а буквата \"р\" не се среща нито веднъж: \n");
                
		int non=0;
                
		for(int i=0; i<br; i++){
                    int br=0;
                    for(int j=0;j<array[i].length();j++)
                    if(array[i].charAt(j) == 'е' || array[i].charAt(j) == 'Е') br++;
                    if(br>1 && br<5 && (array[i].indexOf('р') == -1))
                        {System.out.print(" " + array[i] + "; \n"); non++;}
		}
		if(0 == non) System.out.println("\nНяма такива!!!!");
	}
    }
    
    //public static String[] m = new String[]{"Пловдив", "Бургас", "Боровец", "Варна","София",  "Велико Търново", "Стара Загора", "Ивайловград", "Крумовград","Долен Чифлик", "Хасково", "Долно Калугерово", "Разград", "Пещера","Плевен", "Русе","Монтана", "Силистра", "Сливен", "Смолян", "Търговище", "Шумен","Ямбол", "Благоевград", "Видин", "Враца", "Габрово", "Добрич", "Кърджали","Кюстендил", "Ловеч",  "Пазарджик", "Перник", "Албена", "Златни пясъци", "Константин и Елена", "Лозенец", "Царево", "Слънчев бряг","Пампорово", "Каварна", "Несебър", "Ахтопол", "Черноморец", "Китен", "Карлово","Асеновград", "Сопот", "Калофер", "Харманли", "Градешница" };

//}


