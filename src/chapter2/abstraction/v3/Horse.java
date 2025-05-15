package chapter2.abstraction.v3;

public class Horse implements Animal{
    @Override
    public void makeSound() {
        System.out.println("히히힝!");
    }

    @Override
    public void exist() {
        System.out.println("말이 존재 합니다.");
    }

    public void Run() {
        System.out.println("이랴!");
    }
}
