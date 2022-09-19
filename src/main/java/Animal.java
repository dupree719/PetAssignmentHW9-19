public class Animal {

    private String name, noise;

    public Animal(String name, String noise) {
        this.name = name;
        this.noise = noise;


    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoise() {
        return this.noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public static void makeNoise(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println(animal.noise);
        } else if (animal instanceof Cat) {
            System.out.println(animal.noise);
        } else if (animal instanceof Orangutan) {
            System.out.println(animal.noise);
        }
    }
}
