package chapter2.polymorphism.v1;

public class Animal extends LifeForm {

    public void exist() {
        System.out.println("동물입니다.");
    }

    public void makeSound() {
        System.out.println("소리를 냅니다.");
    }
}
