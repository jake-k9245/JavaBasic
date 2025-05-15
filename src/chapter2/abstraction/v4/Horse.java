package chapter2.abstraction.v4;

public class Horse extends Animal {

    @Override
    public void makeSound() {
        System.out.println("이랴랴랴랴ㅑ랴랼");
    }

    public void Run() {
        System.out.println("뚜그닥 뚜그닥!");
    }
}
