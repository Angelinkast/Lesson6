public class Dog extends Animal {
    Dog(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    public void animalRun(int x) {
        int xmax = 500;
        if (x > xmax){
            System.out.println(name + " can't run more than " + xmax + " m");
        }
        else {
            System.out.println(name + " ran " + x + " m");
        }
    }

    @Override
    public void animalSwim(int y) {
        int ymax = 10;
        if (y > ymax){
            System.out.println(name + " can't swim more than " + ymax + " m");
        }
        else {
            System.out.println(name + " swam " + y + " m");
        }
    }
}
