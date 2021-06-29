import java.util.ArrayList;

class Zoo {
    private static Zoo instance = new Zoo();
    private Zoo(){
    }

    public static Zoo getInstance(){
        if (instance != null){
            System.out.println("The zoo already exists...");
        }
        return instance;

    }
    ArrayList<Animal> zoo = new ArrayList<>();
    int levelOfHappiness = 2;
    int levelOfHunger = 3;


    public void addAnimal (Animal animal){
        this.zoo.add(animal);
        System.out.println("Notifying observers:");
        update();

    }

    public void watchAnimals() {
        if (levelOfHappiness <= 5 && levelOfHappiness >= 1){
            levelOfHappiness++;
        }
       if (levelOfHunger <= 5 && levelOfHunger >= 1){
           levelOfHunger++;
       }
        for (Animal animal : zoo) {
            animal.watchAnimals();

        }
    }

    public void feedAnimals() {
        if (levelOfHunger <= 5 && levelOfHunger >= 1){
            levelOfHunger--;
        }
        for (Animal animal : zoo) {
            animal.feed();
        }
    }

    public void showAnimalsInfo () {

    }

    public void addObserver(ZooObserver observer) {

    }

    public void removeObserver(ZooObserver observer) {
    }
}
