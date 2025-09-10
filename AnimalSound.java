class Animal{
public void makeSound(){

System.out.println("Animal makes a sound");
}
}

class Dog extends Animal{
@Override
public void makeSound(){
System.out.println("Dog -- Bark");
}
}

class Cat extends Animal{
@Override
public void makeSound(){
System.out.println("Cat ---Meow");
}
}

public class AnimalSound{
public static void main(String args[]){

Animal dog =new Dog();
Animal cat=new Cat();

dog. makeSound();
cat. makeSound();
}
}

