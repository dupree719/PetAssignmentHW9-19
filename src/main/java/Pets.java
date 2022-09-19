import java.util.Scanner;

public class Pets {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
       Scanner y = new Scanner(System.in);
//        System.out.println("How many pets do you have?");
//        int qty = x.nextInt();
      System.out.println("What kind of pets are they?");
        String kind = y.nextLine();
//        x.nextLine();
       System.out.println("What are their names?");
        String names = x.nextLine();
//       System.out.println("You have " + qty + " pets." + "\n The types of pets: " + kind + "\n Their names are: " + names);
        System.out.println("Kind of pets you have: " + kind + "\nList of their names: " + names + "\nSounds they make: ");

        Animal dog = new Animal("Richard", "Growl");
        Animal cat = new Animal("Puss", "purrr");
       Animal orangutan = new Animal("Marcus","laugh");

       //Setters
        dog.setName("Richard");
        dog.setNoise("Growl");
        cat.setName("Puss");
        cat.setNoise("purrrr");
        orangutan.setName("Marcus");
        orangutan.setNoise("laugh");

        //Getters
//        System.out.println(dog.getName());
//        System.out.println(cat.getName());
//        System.out.println(orangutan.getName());

        //Instances of each subclass
        Dog dog1 = new Dog("Max", "growl");
        Cat cat1 = new Cat("Ruby", "purrr");
        Orangutan orangutan1 = new Orangutan("Marcus", "laugh");


        //Speak method that each subclass overrides
        Dog.makeNoise(dog1);
        Cat.makeNoise(cat1);
        Orangutan.makeNoise(orangutan1);


    }
}
