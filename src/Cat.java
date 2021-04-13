public class Cat extends Animal {
    Cat(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    public void animalRun(int x) {
        int xmax = 200;
        if (x > xmax){
            System.out.println(name + " can't run more than " + xmax + " m");
        }
        else {
            System.out.println(name + " ran " + x + " m");
        }
    }

    @Override
    public void animalSwim(int y) {
        System.out.println(name + " can't swim");
    }
}