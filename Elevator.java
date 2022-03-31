import java.util.Random;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        int currentLevel = random.nextInt(0, 9);
        String level;
        int levels[] = new int[10];

        for(int i = 0; i < 10; i++){
            levels[i] = i;
        }

        while(true){
            System.out.println("");
            System.out.println("");
            System.out.println("Elevator is cunvm" +
                    "rrently on level: " + currentLevel);
            System.out.println("1 2 3 4 5 6 7 8 9 Exit");

            try{
                level = s.nextLine();
                if(level.equalsIgnoreCase("Exit")){
                    System.out.println("Goodbye!");
                    break;
                }else if(Integer.parseInt(level) == currentLevel){
                    System.out.println("You are already standing on this level!");
                } else if(Integer.parseInt(level) >= 10 || Integer.parseInt(level) <= 0){
                    System.out.println("This level does not exist!");
                }else if(Integer.parseInt(level) < currentLevel){
                    System.out.println("Level: " + currentLevel);
                    Thread.sleep(1000);
                    while(currentLevel > Integer.parseInt(level)){
                        currentLevel--;
                        System.out.println("Level: " + currentLevel);
                        Thread.sleep(1000);
                    }
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }else if(Integer.parseInt(level) > currentLevel){
                    System.out.println("Level: " + currentLevel);
                    Thread.sleep(1000);
                    while(currentLevel < Integer.parseInt(level)){
                        currentLevel++;
                        System.out.println("Level: " + currentLevel);
                        Thread.sleep(1000);
                    }
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }


            }catch (Exception e){
                System.out.println("Error");
                e.printStackTrace();
            }
        }


    }
}
