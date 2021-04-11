package lesson6;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void playWithBall() {
        System.out.println("I'll bring it back!");
    }
}
