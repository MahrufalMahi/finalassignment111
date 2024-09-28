package Assignment9.task4;

public class Dog extends Animal{

    public String breed;
    public Dog(String name, int age, String color, String breed){

        super(name, age, color);
        this.breed = breed;
    }
    
    public void makeSound(){

        System.out.println(this.color + " color " + this.name + " is barking");
    }

    public String info(){

        return super.info() + " Breed : " + this.breed;
    }
}
