package chapter2.clazz;

public class Main {

    public static void main(String[] args) {

        // 객체 생성(인스턴스화)
        // --- personA ---;
        // - name = "jinhwan";
        // - age = 33;
        // - address = xxx
        Person personA = new Person("jinhwan", 33);
        Person personB = new Person("jake", 22);

        // 속성에 직접 접근
//        System.out.println("설정전 personA 이름 : " + personA.name);
//        System.out.println("설정전 personB 이름 : " + personB.name);
//
//        personA.name = "jinhwan";
//        personB.name = "jake";
//
//        System.out.println("설정 후 personA 이름 : " + personA.name);
//        System.out.println("설정 후 personB 이름 : " + personB.name);

        // 기능활용
        int result1 = personA.sum(1, 2);
        int result2 = personB.sum(2, 4);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // 게터 활용
        String name = personB.getName();
        System.out.println("name = " + name);

        // 세터 활용
        System.out.println("personA 의 주소 : " + personA.address);
        personA.setAddress("서울");
        System.out.println("personA 의 주소 : " + personA.address);

    }
}
