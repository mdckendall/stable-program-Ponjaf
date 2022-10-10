import java.util.Scanner;
class Main{
public static void main(String [] args){

    Stable s = new Stable();
    Scanner sc = new Scanner(System.in);
      System.out.println("What is the address of the stable");
        s.address = sc.nextLine();
  do{
      System.out.println("Do you wish to add a horse to the stable?");
        char Yes = sc.next().charAt(0);
        sc.nextLine();
        if(Yes == 'y'){
          Horse h;
            System.out.println("What is the name of the horse?");
              String name = sc.nextLine();
            System.out.println("What is the weight of the horse?");
              Double weight = sc.nextDouble();
sc.nextLine();
            System.out.println("Enter true if the horse is tame or false if it is not.");
              boolean tame = sc.nextBoolean();
sc.nextLine();

             h = new Horse(name, tame, weight);
    s.addHorse(h);
        }
  else{
    break;
    }
  }
    while(true);
      for(int i = 0; i < s.h.size(); i++){
        
      System.out.println("Horse #" + (i+1) + " Name: " + s.h.get(i).nameOfHorse + " Weight: " + s.h.get(i).weightOfHorse + " Tame: " + s.h.get(i).tame);
      }
    }
}