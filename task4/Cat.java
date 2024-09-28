package Assignment9.task4;

public class Cat extends Animal{
    
    public String breed;
    public Cat(String name, int age, String color, String breed){

        super(name, age, color);
        this.breed = breed;
    }

    public void makeSound(){

        System.out.println(this.color + " color " + this.name + " is meowing");
    }

    public String info(){

       return super.info() + " Breed : " + this.breed;
    }
}
